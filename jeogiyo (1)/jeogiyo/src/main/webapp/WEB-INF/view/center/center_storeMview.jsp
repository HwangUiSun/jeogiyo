<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/center_storeMview.css" rel="stylesheet">
</head>
<body>
<div id='center_storeMview'>
	<div id='subject'>가맹 상세보기</div>
	
	
	<form name='frm_center_storeMview' method='post' id='frm_center_storeMview'>
		<div id='container'>
			<div id='personal'>
				<div id='storeName'>[서울대입구역 1호점]</div><br/>
				<label>성명</label>
				<input type='text' name='mid'><br/>
				
				<label>연락처</label>
				<input type='text' name='phone'><br/>
				
				<label>이메일</label>
				<input type='text' name='email'><br/>
				
				<label>주소</label>
				<input type='text' name='address' id='address'><br/>
				
				<label>상세주소</label>
				<input type='text' name='address' id='address'><br/>
			</div>
			
			<div id='sales'>
				<label id='sizeup'>매출 조회</label><br/>
				<input type='date' name='startNal'> ~
				<input type='date' name='endNal'>
				<button type = 'button' value = 'btn_lookUp' name = 'lookUp'>조회</button><br/>
				<input type='text' name='sellingCount' value='기간별 매출 현황 / 판매건수' id='sellingCount'>
			</div>
		</div>
	</form>
	<div class = 'btns'>
		<button type = 'button' value = 'btn_drop' name = 'drop'>가맹해지</button>
		<button type = 'button' value = 'btn_back' name = 'back'>돌아가기</button>
	</div>


</div>
</body>
</html>