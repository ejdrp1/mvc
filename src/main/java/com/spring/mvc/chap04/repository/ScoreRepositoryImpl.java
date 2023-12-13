package com.spring.mvc.chap04.repository;

import com.spring.mvc.chap04.entity.Score;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.spring.mvc.chap04.entity.Grade.A;

public class ScoreRepositoryImpl implements ScoreRepository{

//    key : 학번, value : 성적 정보
    private static final Map<Integer, Score> scoreMap;

//    학번에 사용할 일련 번호
    private static int sequence;

    static {
        scoreMap = new HashMap<>();
        Score stu1 = new Score("뽀로로", 100, 50, 70, ++sequence, 0, 0, A);
        Score stu2 = new Score("춘식이", 33, 56, 12, ++sequence, 0, 0, A);
        Score stu3 = new Score("대길이", 88, 12, 0, ++sequence, 0, 0, A);

        scoreMap.put(stu1.getStuNum(), stu1);
        scoreMap.put(stu2.getStuNum(), stu2);
        scoreMap.put(stu3.getStuNum(), stu3);
    }

    @Override
    public List<Score> findAll() {
        return new ArrayList<>(scoreMap.values());
    }

    @Override
    public boolean save(Score score) {
        if (scoreMap.containsKey(score.getStuNum())) return false;
        scoreMap.put(score.getStuNum(), score);
        return true;
    }

    @Override
    public boolean deleteByStuNum(int stuNum) {
        if (!scoreMap.containsKey(stuNum)) return false;
        scoreMap.remove(stuNum);
        return true;
    }

    @Override
    public Score findByStuNum(int stuNum) {
        return scoreMap.get(stuNum);
    }
}
