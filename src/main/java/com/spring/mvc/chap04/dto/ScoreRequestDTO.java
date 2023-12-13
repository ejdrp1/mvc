package com.spring.mvc.chap04.dto;

import lombok.*;

@Setter // 필수
@Getter // 필수
@ToString
@EqualsAndHashCode
@NoArgsConstructor // 필수
@AllArgsConstructor
public class ScoreRequestDTO {

    //    DTO 는 클라이언트가 전달한 데이터만 가지고 있음
    private String name; // 학생 이름
    private int kor, eng, math; // 국, 영, 수 점수

}
