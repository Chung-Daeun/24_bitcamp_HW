package com.bit.springboard.service.impl;

import com.bit.springboard.common.FileUtils;
import com.bit.springboard.dto.BoardDto;
import com.bit.springboard.dto.BoardFileDto;
import com.bit.springboard.mapper.NoticeMapper;
import com.bit.springboard.service.Boardservice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements Boardservice {
    private final NoticeMapper noticeMapper;
    private final FileUtils fileUtils;

    @Override
    public BoardDto post(BoardDto boardDto, MultipartFile[] uploadFiles) {
        List<BoardFileDto> boardFileDtoList = new ArrayList<>();

        if(uploadFiles != null && uploadFiles.length > 0){
            Arrays.stream(uploadFiles).forEach(file -> {
                if(file.getOriginalFilename() != null && !file.getOriginalFilename().equals("")){
                    BoardFileDto boardFileDto = fileUtils.parserFileInfo(file, "notice/");
                    boardFileDtoList.add(boardFileDto);
                }
            });
        }
        noticeMapper.post(boardDto);

        if(boardFileDtoList.size() > 0){
            boardFileDtoList.forEach(boardFileDto -> boardFileDto.setBoard_id(boardDto.getId()));
            noticeMapper.postFiles(boardFileDtoList);
        }
        return noticeMapper.findById(boardDto.getId());
    }
}
