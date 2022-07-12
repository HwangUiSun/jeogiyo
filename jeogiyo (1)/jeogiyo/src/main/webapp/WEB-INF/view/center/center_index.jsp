<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_index</title>
</head>
<body>
center_index<br/>
<a href='center_noti'>공지사항</a><br/>
<a href='center_order'>발주</a><br/>
<a href='center_storeM'>가맹관리</a><br/>
<a href='center_storeSale'>매출현황</a><br/>
<a href='center_consumerList'>회원목록</a><br/>

<div id="section">
	<jsp:include page="${inc}"></jsp:include>
</div>
</body>
</html>