package com.spring.mvc.chap05.repository;

import com.spring.mvc.chap05.entity.Board;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardRepositoryImpl implements BoardRepository {

    private final static Map<Integer, Board> boardMap;

    static {
        boardMap = new HashMap<>();
    }

    @Override
    public List<Board> findAll() {
        return null;
    }

    @Override
    public Board findOne(int boardNo) {
        return null;
    }

    @Override
    public boolean save(Board board) {
        return false;
    }

    @Override
    public boolean deleteByNo(int boardNo) {
        return false;
    }
}
