<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>

<style>
  label {
    display: block;
    margin-bottom: 20px;
  }

  .wrap {
    width: 800px;
    margin: 100px auto;
    border: 1px dashed #000;
  }

  .wrap h1 {
    margin: 0 auto;
    padding-bottom: 20px;
    width: fit-content;
    border-bottom: 1px solid #000;
  }

  .wrap .menu {
    font-size: 24px;
    width: 80%;
    margin: 20px auto;
  }

  .wrap .menu select {
    width: 200px;
    height: 50px;
    font-size: 28px;
    margin-top: 10px;
  }

  .clearfix::after {
    content: '';
    display: block;
    clear: both;
  }
</style>

<body>


  <div class="wrap">
    <h1>커피 주문서</h1>

    <div class="menu">
      <form action="/coffee/result" method="post">
        <label>

          # 주문 목록 <br>
          <select name="menu" id="menu-sel">
            <option value="americano">아메리카노</option>
            <option value="cafeLatte">카페라떼</option>
            <option value="macchiato">카라멜 마끼아또</option>
          </select>

        </label>
        <label class="price"># 가격 : <span class="price-value">3000</span>원</label>

        <!-- hidden : 화면에 렌더링은 안되지만 서버로 보낼 수 있음 -->
        <input type="hidden" name="price" id="price-tag" value="3000">

        <label>
          <button type="submit">주문하기</button>
        </label>

      </form>

    </div>

  </div>


  <script>
    const coffeePrice = {
      americano: 3000,
      cafeLatte: 4500,
      macchiato: 5000
    }

    // change : Input이나 select 태그의 값이 변했을 때
    const $menu = document.getElementById('menu-sel');
    $menu.onchange = e => {
      // 커피를 선택하면 가격이 변해야 함!
      // console.log(e.target.value);
      // console.log(coffeePrice[e.target.value]);

      const price = coffeePrice[e.target.value]
      document.querySelector('.price-value').textContent = price;

      const $priceTag = document.getElementById('price-tag');
      $priceTag.value = price;

    };
  </script>

</body>

</html>