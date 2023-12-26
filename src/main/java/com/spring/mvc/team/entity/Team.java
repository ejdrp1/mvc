package com.spring.mvc.team.entity;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private String teamName; // 팀 이름
    private int win; // 승
    private int draw; // 무
    private int lose; // 패
    private int gainsAndLosses; // 득실차
    private int point; // 승점


}
