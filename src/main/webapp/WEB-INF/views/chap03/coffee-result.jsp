<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>

<body>

  <h1>주문 내역입니다.</h1>

  <ul>
    <!-- 동적 html -->
    <li># 주문하신 메뉴 : ${menu}</li>
    <li># 지불하실 가격 : ${p}원</li>
  </ul>

</body>

</html>