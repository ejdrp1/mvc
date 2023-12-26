package com.spring.mvc.chap04.entity;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    private String name; // 학생 이름
    private int kor; // 국
    private int eng; // 영
    private int math; // 수

    private int stuNum; // 학번
    private int total; // 총점
    private double average; // 평균
    private Grade grade; // 학점


}
