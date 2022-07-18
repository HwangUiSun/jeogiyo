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
					<span class="rid">${param.id}</span>
					<span><input type="text" value="${v.ea}" name="ea" id="ea${v.sno}"></span>
					<c:if test ="${mid == 'root'}">
					<span><button type="button"  onclick="addC('${v.sno}', 'ea${v.sno}','${param.title}')">수정</button></span>
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
let ids = [];
function addC(sno,eas,title){
	let ea = document.getElementById(eas)
	/* Javascript */
	// create element (form)
	var newForm = document.createElement('form');
	// set attribute (form) 
	newForm.name = 'newForm';
	newForm.method = 'post';
	newForm.action = '/addsC';	

	// create element (input)
	var eainput = document.createElement('input');
	var snoinput = document.createElement('input');
	var titleinput = document.createElement('input');
	// set attribute (input)
	eainput.setAttribute("type", "hidden");
	eainput.setAttribute("name", "ea");
	eainput.setAttribute("value", ea.value);
	snoinput.setAttribute("type", "hidden");
	snoinput.setAttribute("name", "sno");
	snoinput.setAttribute("value", sno);
	titleinput.setAttribute("type", "hidden");
	titleinput.setAttribute("name", "title");
	titleinput.setAttribute("value", title);
	console.log(title)
	// append input (to form)
	newForm.appendChild(snoinput);
	newForm.appendChild(eainput);
	newForm.appendChild(titleinput);
	
	// append form (to body)
	document.body.appendChild(newForm);

	
	
	// submit form
	newForm.submit();
	
}

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

frm = document.frm_order_view;
lastIndex = document.getElementById("title").value.length;	
idIndex = lastIndex - 9;
let sd = document.getElementById("title").value.slice(-9,lastIndex).split("_")
let id = document.getElementById("title").value.slice(0,idIndex)
let str = sd[0]+"-0"+sd[1]+"-"+sd[2]
document.getElementById("nal").value=str;
frm.jcenterName.value = id
ids = document.getElementsByClassName("rid")
for(let i = 0; i< ids.length;i++){
	ids[i].innerText=id;
}

</script>
</html>