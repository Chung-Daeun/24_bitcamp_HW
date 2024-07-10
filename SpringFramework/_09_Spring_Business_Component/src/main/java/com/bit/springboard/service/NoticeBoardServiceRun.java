package com.bit.springboard.service;

import com.bit.springboard.dto.BoardDto;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NoticeBoardServiceRun {
    public static void main(String[] args) {
        AbstractApplicationContext factory = new GenericXmlApplicationContext("root-context.xml");

        BoardService boardService = factory.getBean("noticeBoardServiceImpl", BoardService.class);
        BoardDto boardDto = new BoardDto();

        // 게시물 게시
//        boardDto.setTitle("공지글2");
//        boardDto.setContent("공지글2 입니다.");
//        boardDto.setWRITER_ID(2);
//
//        boardService.post(boardDto);
//
//        boardDto.setTitle("공지글3");
//        boardDto.setContent("공지글3 입니다.");
//        boardDto.setWRITER_ID(3);
//
//        boardService.post(boardDto);

        // 게시물 수정
//        boardDto.setTitle("공지글1 수정");
//        boardDto.setContent("공지글1 수정했습니다. - 수정함");
//        boardDto.setModdate(LocalDateTime.now());
//        boardDto.setId(1);
//
//        boardService.modify(boardDto);

        // 게시물 삭제
        boardService.delete(2);

        // 게시물 전체 출력
        boardService.getBoardList().forEach(board -> {
            System.out.println(board);
        });

        // 특정 게시물 출력
        System.out.println(boardService.getBoard(1));

        factory.close();

    }
}
