<%@ taglib prefix = 'c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>store_orderStatus</title>
<link rel = 'stylesheet' href = './css/store_orderStatus.css'>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src = './js/store_orderStatus.js'></script>
</head>
<body>
<div id = 'subject'>주문 현황</div>
<form name = 'frm_orderStatus' id = 'frm_orderStatus' method = 'post'>
	<input type="hidden" name="nowPage" value="${statusPage.nowPage}" >
	<input type = 'hidden' name = 'sno' value = '${vo.sno }'>
</form>
<c:set var = 'num' value = '${statusPage.startNo }'/>
<c:forEach var = 'status' items= '${statuslist}'>
	<div id = 'orderStatus'>
		<div class = 'time'>${status.ordertime}</div>
		<div class = 'info'>
			<div class = 'amount'>총 금액 : ${status.totalprice}원</div>
			<div class = 'method'>${status.howtopay }</div>
			<div class = 'menu'>${status.ordermenu }</div>
			<div class = 'address'>${status.address }</div>
		</div>
		<div class = 'btns'	>
			<div class = 'btn'>
				<button type = 'button' name = 'accept' onclick = 'btnAccept(${num-1}%3)'>접수</button>
				<button type = 'button' name = 'deny' class = 'deny' onclick = 'btnDeny(${status.sno})'>거부</button>						
			</div>
		</div>
		<div class = 'order_expected_time'>
		</div>
		<div class = 'end_time'>
			<h1>배달 완료!</h1>	
		</div>
	</div>
	<hr/>
<c:set var = 'num' value = '${num=num+1}'/>	
</c:forEach>
<div class='paging'>
	<c:if test="${statusPage.startPage>1 }">
		<button type='button' class='btnFirst'  onclick='movePage(1)' >맨첨</button>
		<button type='button' class='btnPrev'   onclick='movePage(${statusPage.startPage-1})' >이전</button>
	</c:if>	
					
	<c:forEach var='i' begin='${statusPage.startPage }' end='${statusPage.endPage }'>
		<button type='button' class='first'  onclick = 'movePage(${i})' >${i }</button>
	</c:forEach>
	
	<c:if test="${statusPage.endPage < statusPage.totPage }">
		<button type='button' class='btnNext'  onclick='movePage(${statusPage.endPage+1})'>다음</button>
		<button type='button' class='btnLast'  onclick='movePage(${statusPage.totPage})'>맨끝</button>
	</c:if>	
</div>	
</body>
</html>