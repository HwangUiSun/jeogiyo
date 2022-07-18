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
	
	<input type="hidden" id="title" value="${param.title}">
	<div id="subject">발주 상세보기</div>
	<!-- 
	<a href='store_orderUpdate'>저장</a>
	<a href='store_orderDelete'>삭제</a>
	<a href='store_orderCancel'>취소</a>
	<a href='center_orderAccept'>승인</a>
	<a href='center_orderWait'>대기</a>
	<a href='storeCenter'>Home</a>
	-->
	<form name = 'frm_order_view' class = 'frm_order_view' method = 'post'>
		<label>가맹점명</label>
		<input type = 'text' name = 'jcenterName' value = '${param.id}점' readonly><br/>
		<label>날짜</label>
		<input type = 'date' name = 'nal' id = 'nal' readonly value=""><br/>
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
					<c:if test ="${mid == 'root'}">
					<span><button type="button"  onclick="add('${v.sno}', 'ea${v.sno}')">수정</button></span>
					</c:if>
					<input type="hidden" value="${v.sno}" name="sno" id="sno">
				</div>
			</c:forEach>
		</div> 
	</form>
	<div class = 'btns'>
	<c:if test ="${mid == 'root'}">
		<button type = 'button' value = 'btn_delete' name = 'delete' onclick="accept('${param.title}')">주문승인</button>
		<button type = 'button' value = 'btn_back' name = 'back' onclick="wait('${param.title}')">주문대기</button>
		<button type = 'button' value = 'btn_back' name = 'back' onclick="location.href='acceptOrderC'">돌아가기</button>
	</c:if>
	<c:if test ="${mid != 'root'}">
		<button type = 'button' value = 'btn_back' name = 'back' onclick="location.href='order'">돌아가기</button>
		</c:if>
	</div>
	</div>

</body>
<script>
function wait(title){
	var waitForm = document.createElement('form');
	waitForm.name = 'waitForm';
	waitForm.method = 'post';
	waitForm.action = '/waitOrderC';
	let tableName = document.getElementById("tableName");
	var titlesinput = document.createElement('input');
	titlesinput.setAttribute("type", "hidden");
	titlesinput.setAttribute("name", "title");
	titlesinput.setAttribute("value", title);
	waitForm.appendChild(titlesinput);
	// append form (to body)
	document.body.appendChild(waitForm);
	// submit form
	waitForm.submit();
	
}
function accept(title){
	var acceptForm = document.createElement('form');
	acceptForm.name = 'acceptForm';
	acceptForm.method = 'post';
	acceptForm.action = '/acceptOrderC';
	let tableName = document.getElementById("tableName");
	var titlesinput = document.createElement('input');
	titlesinput.setAttribute("type", "hidden");
	titlesinput.setAttribute("name", "title");
	titlesinput.setAttribute("value", title);
	acceptForm.appendChild(titlesinput);
	// append form (to body)
	document.body.appendChild(acceptForm);
	// submit form
	acceptForm.submit();
	
}
</script>
</html>