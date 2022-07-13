<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order_main</title>
<link rel='stylesheet' type='text/css' href='/css/order_main.css'>
</head>
<body>
<div id="subject">발주</div>

<a href='store_orderInput'>발주 작성 페이지</a>
<a href='order_view'>발주리스트 상세보기</a>
<a href='center_orderView'>(본사)발주리스트 상세보기</a>
<a href='storeCenter'>Home</a>

<div class='title' onclick="">
		<span>NO</span>
		<span>제목</span>
		<span>작성자</span>
		<span>날짜</span>
	</div>
	<div class="itemsWrap">
	<c:set var='num' value='${orderpage.startNo }' />
	<c:forEach var='v' items='${orderlist}'>
		<div class='items' onclick="">
			<span >${num}</span>
			<span>${v.subject}</span>
			<span>본사</span>
			<span>${v.nal}</span>
		</div>
	<c:set var='num' value='${num=num+1 }'/>
	</c:forEach>
	<div class='paging'>
		
			<c:if test="${orderpage.startPage>1 }">
				<button type='button' class='btnFirst'  onclick='movePage(1)'  >맨첨</button>
				<button type='button' class='btnPrev'   onclick='movePage(${orderpage.startPage-1})' >이전</button>
			</c:if>		
			
			
			<c:forEach var='i' begin='${orderpage.startPage }' end='${orderpage.endPage }'>
				<button type='button' class='first'  onclick = 'movePage(${i})' >${i }</button>
			</c:forEach>				


			<c:if test="${orderpage.endPage < orderpage.totPage }">
				<button type='button' class='btnNext'  onclick='movePage(${orderpage.endPage+1})'>다음</button>
				<button type='button' class='btnLast'  onclick='movePage(${orderpage.totPage})'>맨끝</button>
			</c:if>		
		</div>	
	</div>
	<form name="frm_order" method="post">
		<input type="hidden" name="nowPage" value="${orderpage.nowPage}">
	</form>
<script src="./js/order_main.js"></script>
</body>
</html>