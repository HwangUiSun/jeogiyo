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
<a href='storeCenter'>Home</a>
<div id = 'subject'>주문 현황</div>
<c:forEach var = 'status' begin = '1' end = '3'>
	<div id = 'orderStatus'>
		<div class = 'time'>11 : 20</div>
		<div class = 'info'>
			<div class = 'amount'>총 금액 XX,XXX원</div>
			<div class = 'method'>만나서 결제</div>
			<div class = 'menu'>자바치킨 1개 / 콜라 500ml 1개</div>
			<div class = 'address'>서울시 관악구 남부순환로 1820 에그옐로우빌딩 14층</div>
		</div>
		<div class = 'btns'>
			<button type = 'button' name = 'accept' onclick = 'btnAccept()'>접수</button>
			<button type = 'button' name = 'deny' onclick = 'btnDeny()'>거부</button>
		</div>
		<div class = 'order_expected_time'><h1></h1><br/><h3></h3></div>
		<div class = 'end_time'>배달 완료!</div>
	</div>
	<hr/>
</c:forEach>
</body>
</html>