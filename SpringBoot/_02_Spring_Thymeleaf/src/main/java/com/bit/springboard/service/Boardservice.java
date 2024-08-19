package com.bit.springboard.service;

import com.bit.springboard.dto.BoardDto;
import org.springframework.web.multipart.MultipartFile;

public interface Boardservice {
    BoardDto post(BoardDto boardDto, MultipartFile[] uploadFiles);
}
