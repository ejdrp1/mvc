package com.spring.mvc.chap05.service;

import com.spring.mvc.chap05.dto.detail.BoardDetailResponseDTO;
import com.spring.mvc.chap05.dto.response.BoardListResponseDTO;
import com.spring.mvc.chap05.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

//    중간 처리 기능 자유롭게 사용
//    목록 처리
    public List<BoardListResponseDTO> getList() {
        return boardRepository.findAll()
                .stream()
                .map(BoardListResponseDTO::new)
                .collect(Collectors.toList());
    }

//    상세 조회 처리
    public BoardDetailResponseDTO getDetail(int bno) {
        return new BoardDetailResponseDTO(boardRepository.findOne(bno));
    }



//    삭제 처리
    public boolean delete(int bno) {
        return boardRepository.deleteByNo(bno);
    }

}
