package com.spring.mvc.chap05.entity;

import java.time.LocalDateTime;

public class Board {

    private int boardNo;    // 게시글 번호
    private String title;   // 제목
    private String content;  // 내용
    private int viewCount;  // 조회수
    private LocalDateTime regDateTime;  // 작성일자시간

}
