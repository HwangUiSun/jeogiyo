<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel ='stylesheet' href = './css/center_storeDrop_view.css'>
<script src = './js/center_storeDrop_view.js'></script>
</head>
<body>
<div id = 'center_storeDrop_view'>
	<div id = 'subject'>탈퇴 신청 상세보기</div>
	<form name = 'frm_storeDrop_view' class = 'frm_storeDrop_view' method = 'post'>
		<input type = 'hidden' name='findStr' value='${storepage.findStr}'>
		<input type = 'hidden' name='nowPage' value='${page.nowPage}'>
		<input type = 'hidden' name='storeName' value=''>
		
		<label>아이디</label>
		<input type = 'text' name = 'mid' value='${vo.mid}' readonly><br/>
		<label>성명</label>
		<input type = 'text' name ='name' value='${vo.name}' readonly><br/>
		<label>가맹점명</label>
		<input type = 'text' name = 'storeName' value='${vo.storeName}' readonly><br/>
		<label>연락처</label>
		<input type = 'text' name = 'phone' value='${vo.phone}' readonly><br/>
		<label name = 'l_doc'>탈퇴 사유</label>		
		<textarea name = 'doc' readonly>${vo.doc}</textarea>
		<div class = 'btns'>
			<button type = 'button' value = 'btn_accept' name = 'accept'>승인</button>
			<button type = 'button' value = 'btn_back' name = 'back' onclick="location.href='center_storeDrop'">돌아가기</button>
		</div>
	</form>
</div>
</body>
</html>