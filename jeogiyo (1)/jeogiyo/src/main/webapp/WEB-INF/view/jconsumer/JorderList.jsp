<%@ taglib prefix = 'c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>JorderList</title>
</head>
<body>
<div id = 'subject'>주문 내역</div>
<c:forEach var = 'status' begin = '1' end = '3'>
	<div id = 'JorderList'>
		<div class = 'time'>11 : 20</div>
		<div class = 'info'>
			<div class = 'amount'>총 금액 XX,XXX원</div>
			<div class = 'method'>만나서 결제</div>
			<div class = 'menu'>자바치킨 1개 / 콜라 500ml 1개</div>
			<div class = 'address'>서울시 관악구 남부순환로 1820 에그옐로우빌딩 14층</div>
		</div>
		
		<div class = 'btns'>
			<button type = 'button' name = 'reviewBtn'>리뷰 작성</button>
		</div>
	</div>
	<hr/>
</c:forEach>
</body>
</html>