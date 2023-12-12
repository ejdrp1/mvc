package com.spring.mvc.chap01;

import lombok.*;

//  DTO (Data Transfer Object)
//  클라이언트의 요청 데이터를 서버에서 받을 때
//  서버의 응답 데이터를 클라이언트로 보낼 때 사용하는 객체
@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {

//    필드명이 클라이언트가 보낸 쿼리 스트링 이름과 같아야 함
//    setter 와 기본 생성자가 있어야 정상 작동함
    private String oNum; // 주문 번호
    private String goods; // 상품명
    private int amount; // 주문 수량
    private int price; // 상품 가격




}
