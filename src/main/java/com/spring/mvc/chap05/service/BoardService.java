package com.spring.mvc.chap05.service;

import com.spring.mvc.chap05.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

//    중간 처리 기능 자유롭게 사용


}
