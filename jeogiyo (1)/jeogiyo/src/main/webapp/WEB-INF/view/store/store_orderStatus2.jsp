<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src = './js/store_orderStatus.js'></script>
</head>
<body>
	<div class = 'orderTime'>
		<input type = 'text' name = 'min' value = '${ sessionScope.min }'>
		<input type = 'text' name = 'sec' value = '${ sessionScope.sec }'>
	</div>
</body>
</html>