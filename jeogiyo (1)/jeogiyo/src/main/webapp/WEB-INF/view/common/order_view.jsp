<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order_view</title>
<link href="/css/order_view.css" rel="stylesheet">
</head>
<body>
<div id="order_view">
	<a href='store_orderUpdate'>저장</a>
	<a href='store_orderDelete'>삭제</a>
	<a href='store_orderCancel'>취소</a>
	<a href='center_orderAccept'>승인</a>
	<a href='center_orderWait'>대기</a>
	<a href='storeCenter'>Home</a>
	
	
	<div id="subject">발주 상세보기</div>
	<form name = 'frm_order_view' class = 'frm_order_view' method = 'post'>
		<label>가맹점명</label>
		<input type = 'text' name = 'jcenterName' value = '서울대입구역점' readonly><br/>
		<label>날짜</label>
		<input type = 'date' name = 'nal' readonly><br/>
		<label>발주품목</label>
		<input type='text' id='orderlist' name='jcenterOrder' value=' 닭 0' readonly>
	</form>
	<div class = 'btns'>
		<button type = 'button' value = 'btn_input' name = 'update'>수정</button>
		<button type = 'button' value = 'btn_delete' name = 'delete'>삭제</button>
		<button type = 'button' value = 'btn_back' name = 'back'>돌아가기</button>
	</div>

</div>
</body>
</html>