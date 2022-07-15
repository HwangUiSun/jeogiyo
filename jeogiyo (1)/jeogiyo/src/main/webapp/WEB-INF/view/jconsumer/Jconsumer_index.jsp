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
		<button type='button' id='homeBtn'>로그아웃</button>
	</header>
	
	<div id="title_menu">
		<ul>
			<a href='JstoreSelect'><li>주문하기&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='MyPage'><li>내정보&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='JorderList'><li>주문내역&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='FAQ'><li>FAQ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			
		</ul>
	</div>
	
	<div id="section">
		<jsp:include page="${inc}"></jsp:include>
	</div>
	
</div>


</body>
</html>