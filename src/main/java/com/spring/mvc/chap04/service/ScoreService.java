package com.spring.mvc.chap04.service;

//  컨트롤러와 레파지토리 사이 비즈니스 로직 처리
//  ex. 트랜젝션 처리, 예외 처리, dto 변환 처리

import com.spring.mvc.chap04.repository.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    private final ScoreMapper scoreRepository;

    @Autowired
    public ScoreService(ScoreMapper scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

//    목록 조회 중간 처리
    /*

    */
}
