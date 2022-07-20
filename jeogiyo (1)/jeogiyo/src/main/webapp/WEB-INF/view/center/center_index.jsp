<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_index</title>
<link rel='stylesheet' type='text/css' href='/css/center_index.css'>
</head>
<body>
<div id='container'>
	<header id="top_logo">
		<h1>jeogiyo</h1>
		<div id="loginIdprint">◆ : ${sessionScope.id}님</div>
		<button type='button' id='center_logoutBtn' onclick="location.href='index'">로그아웃</button>
	</header>
	
	<div id="title_menu">
		<ul>
			<a href='center_noti'><li>공지사항&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='center_order'><li>발주&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='center_storeM'><li>가맹관리&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='center_storeSale'><li>매출현황&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='center_consumerList'><li>회원목록</li></a>
		</ul>
	</div>
	
	<div id="section">
		<jsp:include page="${inc}"></jsp:include>
	</div>
	
</div>

<div id="section2">
	<jsp:include page="${inc2}"></jsp:include>
</div>
</body>
</html>