<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<link href="css/center_storeMview.css" rel="stylesheet">
<script src="/js/center_storeMview.js"></script>
</head>
<body>
<div id='center_storeMview'>
	<div id='subject'>가맹 상세보기</div>
	<div id='im'></div>
	
	<div id='container'>
		<form name='frm_center_storeMview' method='post' id='frm_center_storeMview'>
			<div id='personal'>
				<div id='img'></div>
				<div id='storeName'>${vo.storeName}</div><br/>
				<label>성명</label>
				<input type='text' name='mid' value='${vo.mid }'><br/>
				
				<label>연락처</label>
				<input type='text' name='phone' value='${vo.phone }'><br/>
				
				<label>이메일</label>
				<input type='text' name='email' value='${vo.email }'><br/>
				
				<label>주소</label>
				<input type='text' name='address' id='address' value='${vo.address }'><br/>
				
				<label>상세주소</label>
				<input type='text' name='zipcode' id='zipcode' value='${vo.zipcode }'><br/>
			</div>
		</form>
		<form method='post' id='ff'>		
			<div id='sales'>
				<label id='sizeup'>매출 조회</label><br/>
				<input type='hidden' name='storeName' value='${vo.storeName }'>
				<input type='hidden' name='mid' value='${vo.mid }'>
				<input type='date' name='startNal' value='${startNal }'> ~
				<input type='date' name='endNal' value='${endNal }'>
				<button type = 'button' onclick = "btn_lookUp('${vo.storeName}')" name = 'lookUp'>조회</button><br/>
			<c:forEach var="doc" items="${saleList}">
				<div class='ff'>${doc.nal} => ${doc.saleSum} / ${doc.saleTotal}</div>
			</c:forEach>
			</div>
		</form>
	</div>	
	
	
	
		
	<div class = 'btns'>
		<button type = 'button' onclick = 'btn_drop()' name = 'drop' id = 'drop'>가맹해지</button>
		<button type = 'button' onclick = 'btn_back()' name = 'back' id = 'back'>돌아가기</button>
	</div>


</div>
</body>
</html>