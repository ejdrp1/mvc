<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>

<body>

  <h1>[${n}]님 취미 목록</h1>

  <ol>
    <!-- for (변수 : 배열이나 리스트) -->
    <c:forEach var="h" items="${hList}">
      <li>${h}ㅎ</li>
    </c:forEach>
  </ol>

</body>

</html>