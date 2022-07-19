<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' type='text/css' href='/css/store_orderInput2.css'>
<script src="/js/noti.js"></script>
<title>store_orderInput</title>
</head>
<body>
<a href='order'>완료</a>
<a href='order'>취소</a>
<a href='storeCenter'>Home</a>
<div id='Input'>
 	<div class='right'>
 		<input type='hidden' name='tableName' value='${tableName}' id="tableName">
		<label>가맹점명</label>
		<input type='text' name='store' value='${tableName}' id="store"></br>
		<label>날짜</label>
		<input type='date' name='today' id="today" readonly></br>
		<label>발주 품목</label></br>
		<div class='subList'>
		<c:set var='num' value='1'/>
			<c:forEach var='v' items='${baljulist3}'>
			<div class="items">
				<span>${num}.</span>
				<span id="productName">${v.productName }</span>
				<span><input type="text" value="${v.ea}" name="ea" id="ea${v.sno}"></span>
				<span><button type="button" id="add" onclick="sub(${v.sno},'ea${v.sno}')">취소</button></span>
				<input type="hidden" value="${v.sno}" name="sno" id="sno">
			</div>
			<c:set var='num' value='${num=num+1 }'/>
			</c:forEach>
		</div>	
		<div class = 'btn'>

			 <button type='button' name='btnInsert'onclick="complete()" id="comp">완료</button> 

			<!--<button type='button' name='btnCancel' onclick="drop()">완료</button>-->
		</div>
  </div>

	<div id='orderInput'>
		<div class='title' onclick="">
			<span>NO.</span>
			<span>이름</span>
			<span>수량</span>
			<span>추가</span>
		</div>
	</div>

	<div class='orderInput_list'>
	
		<c:set var='num' value='${baljupage2.startNo}'/>
				<c:forEach var='v' items='${baljulist2}'>
				<div class="items ex${num}">
					<span>${num}.</span>
					<span id="productName">${v.productName }</span>
					<span><input type="text" value="${v.ea}" name="ea" id="ea${v.sno}"></span>
					<span><button type="button" id="add" onclick="add(${v.sno},'ea${v.sno}')">추가</button></span>
					<input type="hidden" value="${v.sno}" name="sno" id="sno">
				</div>
				<c:set var='num' value='${num=num+1 }'/>
				</c:forEach>
	</div>

<input type="hidden" name="title" id="title" value="${param.title}">
<input type="hidden" name="nal" id="nal" value="">
</div>


</body>
</html>