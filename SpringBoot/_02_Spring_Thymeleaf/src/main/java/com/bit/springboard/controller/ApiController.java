package com.bit.springboard.controller;

import com.bit.springboard.dto.MemberDto;
import com.bit.springboard.dto.ResponseDto;
import com.bit.springboard.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.service.GenericParameterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

// @RestController = @Controller + @ResponseBody
@RestController
@RequestMapping("/apis")
@RequiredArgsConstructor
public class ApiController {
    private final MemberService memberService;
    private final GenericParameterService parameterBuilder;

    // @Operation: API 설명 추가
    @Operation(summary = "Member 등록")
    // @ApiResponses: 상태코드에 대한 설명 추가
    @ApiResponses(value = {
            // @ApiResponse: 각각 상태 코드에 대한 설명 추가
            @ApiResponse(responseCode = "201",
                         description = "Member 등록됨",
                         content = {@Content(mediaType = "application/json",
                                             schema = @Schema(implementation = ResponseDto.class))}
                         ),
            @ApiResponse(responseCode = "400",
                         description = "잘못된 파라미터 값",
                         content = @Content
            ),
            @ApiResponse(responseCode = "500",
                         description = "Internal Server Error",
                         content = @Content
            )
    })
    @PostMapping("/members")
    public ResponseEntity<?> save(
            // @Parameter: Api를 호출할 때 보내는 파라미터에 대한 설명추가
            @Parameter(description = "새로운 사용자의 username, password, email, nickname, tel")
            MemberDto memberDto) {

        ResponseDto<MemberDto> responseDto = new ResponseDto<>();
        try {
            MemberDto savedMemberDto = memberService.save(memberDto);
            responseDto.setStatusCode(HttpStatus.CREATED.value());
            responseDto.setStatusMessage("CREATED");
            responseDto.setData(savedMemberDto);
            return ResponseEntity.created(URI.create("/members")).body(responseDto);
        } catch(Exception e) {
            responseDto.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseDto.setStatusMessage(e.getMessage());
            return ResponseEntity.internalServerError().body(responseDto);
        }
    }

    @Operation(summary = "멤버 목록 조회")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                         description = "Member 목록 조회 완료",
                         content = {@Content(mediaType = "application/json",
                                             schema = @Schema(implementation = ResponseDto.class))}
            ),
            @ApiResponse(responseCode = "500",
                         description = "Internal Server Error",
                         content = @Content
            )
    })
    @GetMapping("/members")
    public ResponseEntity<?> findAll() {
        ResponseDto<MemberDto> responseDto = new ResponseDto<>();
        try{
            List<MemberDto> memberDtoList = memberService.findAll();
            responseDto.setStatusCode(HttpStatus.OK.value());
            responseDto.setStatusMessage("OK");
            responseDto.setDataList(memberDtoList);
            return ResponseEntity.ok(responseDto);
        } catch(Exception e) {
            responseDto.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseDto.setStatusMessage(e.getMessage());
            return ResponseEntity.internalServerError().body(responseDto);
        }
    }

    @Operation(summary = "id로 회원 조회")
    @ApiResponses(value={
            @ApiResponse(responseCode = "200",
                         description = "조회완료",
                         content = {@Content(mediaType = "application/json",
                                             schema = @Schema(implementation = ResponseDto.class)
                         )}
            ),
            @ApiResponse(responseCode = "400",
                         description = "잘못된 파라미터",
                         content = @Content
            ),
            @ApiResponse(responseCode = "500",
                         description = "Internal Server Error",
                         content = @Content
            )
    })
    @GetMapping("/members/{id}")
    public ResponseEntity<?> findById(
            @Parameter(description = "조회할 회원 id")
            @PathVariable("id") int id){
        ResponseDto<MemberDto> responseDto = new ResponseDto<>();
        try{
            MemberDto memberDto = memberService.findById(id);
            responseDto.setStatusCode(HttpStatus.OK.value());
            responseDto.setStatusMessage("OK");
            responseDto.setData(memberDto);
            return ResponseEntity.ok(responseDto);
        }catch(Exception e){
            responseDto.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseDto.setStatusMessage(e.getMessage());
            return ResponseEntity.internalServerError().body(responseDto);
        }
    }

    @Operation(summary = "회원 탈퇴")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204",
                         description = "회원탈퇴 완료"
            ),
            @ApiResponse(responseCode = "400",
                         description = "잘못된 파라미터",
                         content = @Content
            ),
            @ApiResponse(responseCode = "500",
                         description = "Internal Server Error",
                         content = @Content
            )
    })
    @DeleteMapping("/members/{id}")
    public ResponseEntity<?> remove(
            @Parameter(description = "탈퇴할 회원 id")
            @PathVariable("id") int id){
        ResponseDto<MemberDto> responseDto = new ResponseDto<>();
        try{
            memberService.remove(id);
            responseDto.setStatusCode(HttpStatus.NO_CONTENT.value());
            responseDto.setStatusMessage("NO CONTENT");
            return ResponseEntity.noContent().build();
        } catch(Exception e) {
            responseDto.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseDto.setStatusMessage(e.getMessage());
            return ResponseEntity.internalServerError().body(responseDto);
        }
    }

    @Operation(summary = "회원정보 수정")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                         description = "정보 수정 완료",
                         content = {@Content(mediaType = "application/json",
                                             schema = @Schema(implementation = ResponseDto.class)
                         )}
            ),
            @ApiResponse(responseCode = "400",
                         description = "잘못된 파라미터",
                         content = @Content
            ),
            @ApiResponse(responseCode = "500",
                         description = "Internal Server Error",
                         content = @Content
            )
    })
    @PatchMapping("members/{id}")
    public ResponseEntity<?> modify(
            @Parameter(description = "수정할 회원 id")
            @PathVariable("id")int id,
            // x-www-form-urlencoded형태는 @ModelAttribute나 @RequestParam으로 데이터를 전송받아 사용했다.
            // 전송되는 데이터의 형태가 application/json 형태면 @RequestBody 어노테이션을 사용한다.
            @Parameter(description = "수정될 정보")
            MemberDto memberDto){
        ResponseDto<MemberDto> responseDto = new ResponseDto<>();
        try{
            memberDto.setId(id);
            MemberDto modifiedMemberDto = memberService.modify(memberDto);

            responseDto.setStatusCode(HttpStatus.OK.value());
            responseDto.setStatusMessage("OK");
            responseDto.setData(modifiedMemberDto);

            return ResponseEntity.ok(responseDto);
        } catch(Exception e) {
            responseDto.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            responseDto.setStatusMessage(e.getMessage());
            return ResponseEntity.internalServerError().body(responseDto);
        }
    }
}
