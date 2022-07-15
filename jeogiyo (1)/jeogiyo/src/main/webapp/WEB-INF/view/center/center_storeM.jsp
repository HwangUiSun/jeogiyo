<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_storeM</title>
<link rel='stylesheet' type='text/css' href='/css/center_storeM.css'>
</head>
<body>
<div id='subject'>가맹관리</div>
<button type='button' id='go_storeDropBtn' onclick="location.href='center_storeDrop'">탈퇴신청 현황</button>
<a href='storeCenter'>Home</a>
<div id='center_storeM'>
	<div id='select1'>서울</div>
	<div id='select2'>경기</div>
	<div id='select3'>인천</div>
</div>
<br/><br/><br/><br/><hr/>
<c:forEach var='list' begin='1' end='3'>
		<div id='storeName'>
			서울대입구<br/>1호점
		</div>
		
		<div id='storeAddressPhone'>
			<label>주소</label>
			<span>힘들어 힘들어 힘들어 힘들어</span>
			<br/><br/>
			<label>연락처</label>
			<span>010-0000-0000</span>
		</div>
		
		<div id='store_view' onclick="location.href='center_storeMview'"></div>
	<br/><br/><hr/>
</c:forEach>

<div id='paging'>
	<c:forEach var='page' begin='1' end='5'>
		<button type='button' id='pageBtn'>
			${page }
		</button>
	</c:forEach>
</div>
</body>
</html>