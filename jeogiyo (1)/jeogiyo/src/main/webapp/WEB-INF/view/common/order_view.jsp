<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	
	<div id="subject">발주 상세보기</div>
	<a href='store_orderUpdate'>저장</a>
	<a href='store_orderDelete'>삭제</a>
	<a href='store_orderCancel'>취소</a>
	<a href='center_orderAccept'>승인</a>
	<a href='center_orderWait'>대기</a>
	<a href='storeCenter'>Home</a>
	<form name = 'frm_order_view' class = 'frm_order_view' method = 'post'>
		<label>가맹점명</label>
		<input type = 'text' name = 'jcenterName' value = '${param.id}점' readonly><br/>
		<label>날짜</label>
		<input type = 'date' name = 'nal' readonly><br/>
		<label>발주품목</label>
		
		<div class="itemsWrap" id="orderlist">	
			<div class='items'>		
				<span>제품이름</span>
				<span>발주 가맹점</span>
				<span>수량</span>
			</div>
			<c:forEach var='v' items='${selectSubOne}'>		
			<div class="items " >
					<span id="productName">${v.productName}</span>
					<span>${param.id}</span>
					<span><input type="text" value="${v.ea}" name="ea" id="ea${v.sno}"></span>
					
					<span><button type="button"  onclick="add('${v.sno}', 'ea${v.sno}')">수정</button></span>
					
					<input type="hidden" value="${v.sno}" name="sno" id="sno">
				</div>
			</c:forEach>
		</div> 
	</form>
	<div class = 'btns'>
	
		<button type = 'button' value = 'btn_delete' name = 'delete' onclick="accept('${param.title}')">주문접수</button>

		<button type = 'button' value = 'btn_back' name = 'back' onclick="location.href='order'">돌아가기</button>
	</div>
</div>
<script src="js/store.js"></script>
</body>
</html>