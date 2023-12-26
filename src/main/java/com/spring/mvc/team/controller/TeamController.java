package com.spring.mvc.team.controller;
    /*
        # 요청 URL
        1. 팀 정보 등록 화면을 보여주고 성적 정보 목록 조회 처리
        - /team/list : GET

        2. 팀 성적 정보 등록 처리 요청
        - /team/register : POST

        3. 팀 성적 정보 삭제 요청
        - /team/remove : POST

        4. 팀 성적 정보 상세 조회
        - /team/detail : GET
    */

import com.spring.mvc.team.service.TeamService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
//@AllArgsConstructor : 모든 필드를 초기화하는 생성자
@RequiredArgsConstructor // final 필드만 초기화하는 생성자
public class TeamController {

//    저장소에 의존해야 데이터를 받아서 클라이언트에게 응답할 수 있음
    private final TeamService teamService;

}
