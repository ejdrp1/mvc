package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.entity.Score;

import java.util.List;

public interface ScoreMapper {

    List<Score> findAll(String sort); // 정렬 목록 조회

    boolean save(Score score); // 성적 정보 등록

    boolean deleteByStuNum(int stuNum); // 성적 정보 한 개 삭제

    Score findByStuNum(int stuNum); // 성적 정보 개별 조회
}

