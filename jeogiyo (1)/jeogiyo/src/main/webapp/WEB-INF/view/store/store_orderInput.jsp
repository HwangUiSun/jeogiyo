<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' type='text/css' href='/css/store_orderInput.css'>
<title>store_orderInput</title>
</head>
<body>
store_orderInput
<a href='order'>완료</a>
<a href='order'>취소</a>
<a href='storeCenter'>Home</a>
<div id='Input'>
 <div class='right'>
	<label>가맹점명</label>
	<input type='text' name='store' value='가맹점'>${mid}</br>
	<label>날짜</label>
	<input type='date' name='today' readonly>${nal}</br>
	<label>발주 품목</label></br>
	<textarea rows="30" cols="60" name='doc'>
		닭                           1
		소스                         3
		파                           2
		양파                         5
		
	</textarea>

	<div class = 'btn'>
		<button type='button' name='btnInsert'>완료</button>
		<button type='button' name='btnCancel'>취소</button>
	</div>
  </div>

<div id='orderInput'>
	<div class='title' onclick="">
		<span>NO.</span>
		<span>이름</span>
		<span>수량</span>
	</div>
</div>

<div class='orderInput_list'>

	<c:set var='num' value='${orderpage.startNo}'/>
			<c:forEach var='v' items='${orderlist}'>
			<div class="items">
				<span>${num}.</span>
				<span>이름</span>
				<span>수량</span>
			</div>
			<c:set var='num' value='${num=num+1 }'/>
			</c:forEach>
</div>


</div>
<script src="/js/noti.js"></script>

</body>
</html>