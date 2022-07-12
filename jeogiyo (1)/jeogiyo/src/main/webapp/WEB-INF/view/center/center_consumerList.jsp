<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_consumerList</title>
</head>
<body>
center_consumerList<br/>
<a href='storeCenter'>Home</a>
<div id="wrap">
	<h1>회원 목록</h1>
	<div class="title">
		<span>No.</span>
		<span>성명.</span>
		<span>아이디</span>
		<span>연락처</span>
		<span>주소</span>
	</div>
	<div class='itemsWrap'>
		<c:set var='num' value='${page.startNo }' />
			<c:forEach var='v' items='${list}'>
			<div class="items">
				<span>No.</span>
				<span>성명.</span>
				<span>아이디</span>
				<span>연락처</span>
				<span>주소</span>
			</div>
			<c:set var='num' value='${num=num+1 }'/>
		</c:forEach>			
	</div>

</div>
</body>
</html>