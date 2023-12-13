package com.spring.mvc.chap04.service;

import com.spring.mvc.chap04.dto.ScoreListResponseDTO;
import com.spring.mvc.chap04.dto.ScoreRequestDTO;
import com.spring.mvc.chap04.entity.Score;
import com.spring.mvc.chap04.repository.ScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//  컨트롤러와 레파지토리 사이 비즈니스 로직 처리
//  ex. 트랜잭션 처리, 예외 처리, dto 변환 처리
@RequiredArgsConstructor
@Service
public class ScoreService {

    private final ScoreRepository scoreRepository;

    //    목록 조회 중간 처리
    /*
        컨트롤러는 데이터베이스를 통해
        성적정보 리스트를 가져오길 원한다.
        그런데 데이터베이스는 성적정보를 전부 모아서 준다.
        컨트롤러는 정보를 일부만 받았으면 좋겠다.
    */
    public List<ScoreListResponseDTO> getList(String sort) {
//        scoreList 에서 원하는 정보만 추출하고 이름을 마스킹해서
//        다시 DTO 리스트로 변환해줘야 한다.
        return scoreRepository.findAll(sort).stream().map(ScoreListResponseDTO::new).collect(Collectors.toList());
    }

    //    등록 중간 처리
//    컨트롤러는 나에게 DTO 를 줬지만
//    레파지토리는 ScoreEntity 를 달라고 한다.
//    내가 반환해야겠네...
    public boolean insertScore(ScoreRequestDTO dto) {
//        dto(ScoreDTO) 를 entity(Score) 로 변환해야 함
//        save 명령
        return scoreRepository.save(new Score(dto));
    }

//    삭제 중간 처리
    public boolean delete(int stuNum) {
        return scoreRepository.deleteByStuNum(stuNum);
    }

//    상세조회, 수정화면조회 중간 처리
    public Score retrieve(int stuNum) {
        return scoreRepository.findByStuNum(stuNum);
    }

}
