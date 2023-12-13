package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.entity.Score;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScoreRepositoryImplTest {

    ScoreRepository repository = new ScoreRepositoryImpl();

    //    단위 테스트 (Unit Test)
//    Test 시나리오
//    - 단언 (Assertion) 기법
    @Test
    @DisplayName("저장소에서 findAll 을 호출하면 그 반환된 List 에는 성적 정보가 3개 있어야 한다.")
    void findAllTest() {
        // given-when-then 패턴
//        given : test 를 위해 주어질 데이터 (ex. parameter)

//        when : test 실제 상황
        List<Score> scoreList = repository.findAll();

//        then : test 결과 확인
        System.out.println(scoreList.size() == 3);

//        나는 scoreList 의 size 가 3인 것이 참이라고 단언한다.
//        assertTrue(scoreList.size() == 3);
        assertEquals(3, scoreList.size());

//        나는 List 의 첫 번째 객체의 이름이 뽀로로라고 단언한다.
        assertEquals("뽀로로", scoreList.get(0).getName());
    }

    @Test
    @DisplayName("저장소에서 findByStuNum 을 호출하여 학번이 2인 학생을 조회하면 " +
            "그 학생의 국어 점수가 33점이고, " +
            "이름이 춘식이어야 한다.")
    void findByStuNumTest() {

    }

}