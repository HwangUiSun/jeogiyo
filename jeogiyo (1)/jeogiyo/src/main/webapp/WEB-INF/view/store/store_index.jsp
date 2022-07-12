<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>store_index</title>
<script defer src='./js/store.js'></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
%애 나 index<br/>

<% String inc = request.getParameter("inc"); %>

<form name='frm_menubar' class='frm_menubar' method='post'>
	<a href='noti'>공지사항</a><br/>
	<a href='order'>발주</a><br/>
	<a href='store_sale'>매출관리</a><br/>
	<a href='store_orderStatus'>주문현황</a><br/>
</form>

<div id="section">
	<jsp:include page="${inc}"></jsp:include>
</div>


</body>
</html>