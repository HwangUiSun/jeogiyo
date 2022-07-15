<%@ taglib prefix ='c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jbag</title>
<link href="css/Jbag.css" rel="stylesheet">
<script src = './js/consumer.js'></script>
</head>
<body>



<div id='Jag'>
	<div id='main'>
	     <a href='homeBtn'><span  id='homeBtn' >HOME</span></a>
	     <h1>저기요</h1>
	</div>
	<div id='top'>
	          <ul>
	             <a href='JstoreSelect'>주문하기</a>
	             <a href='MyPage'>내정보</a>
	             <a href='JorderList'>주문내역</a>
	             <a href='FAQ'>FAQ</a>
	          </ul>
	</div>
	<div id= 'Jbeg_list'>
	        <div id='subject'>장바구니</div>
	   <div id='wrap'>
		<div class='title'>
			<span class='sno'>No</span>
			<span class='foodImg'>상품정보</span>
			<span class='foodInfo'>추가특성</span>
			<span class='ea'>수량</span>
			<hr/>
			
		</div>
		<c:forEach var = 'status' begin = '1' end = '3'>
	<div id = 'itemsWrap'>
	       <div class='items'>
		<span class = sno'>${num+1 }  <img src='../img/chicken1.png'width='240px' height='240px'/>
		 자바치킨 1개 <button type = 'button' name = 'cancelBtn'>삭제</button></div>
		</div>
	</div>
	<hr/>
	<c:set var='num' value='${num=num+1 }'/>
</c:forEach>

  		<div class= 'paging'>	
	
	<c:if test="${page.startPage>1}">
		<button type= 'button' class= 'btnFirst' onclick='movePage(1)'>맨처음</button>
		<button type= 'button' class= 'btnPrev' onclick='movePage(${page.startPage-1})'>이전</button>
	</c:if>
		

		<c:forEach var='i' begin='${page.startPage}' end='${page.endPage}'>
		<button type= 'button' class= 'first' onclick ='movePage(${i})'>${i}</button>
		</c:forEach>

		<c:if test ="${page.endPage<page.totPage}">
		<button type= 'button' class= 'btnNext' onclick = 'movePage(${page.endPage+1})'>다음</button>
		<button type= 'button' class= 'btnLast' onclick = 'movePage(${page.totPage})'>맨끝</button>
		</c:if>
	</div>
			
		

		<span class='menuPrice'>총 금액 : 18500원</span><br/>
		<a href='menuAddBtn'><button type='button' class='menuAddBtn'>메뉴추가</button></a>
		<a href='jorderBtn'><button type='button' class='jorderBtn'>주문하기</button></a>
  </div>
  
	
	
</div>
</body>
</html>