<%@ taglib prefix ='c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/JpayAfter.css" rel="stylesheet">
<script src = './js/consumer.js'></script>
<title>JpayAfter</title>
</head>
<body>

<div id='JpayAfter'>
	
	<div id= 'JpayAfter_list'>
	        <div id='subject'>결제내역</div>
	</div>
	<div id='priceInfo'>
	       <div class='sub'>주문내역</div>
	       <c:forEach var="v" items="${menus}" varStatus="status">
		    	<div id='pay'>
		       		<span class = 'foodImg'><img src='${imgArray[status.index]}' width='240px' height='240px'/></span>
		       		<span class = 'foodInfo'>${v}</span>
		       		<span class = 'ea'>${eaArray[status.index]}개</span>
		      		<span class = ' menuEaPrice'>
		      		<fmt:parseNumber var="i" value="${priceArray[status.index]*eaArray[status.index]}" />
		       		<fmt:formatNumber value="${i}" pattern="#,###" />원
		       		</span><br/><br/>
		      	</div>
		    </c:forEach>
	       <button type='button'onclick="javascript:callInfoBtn()" class='callInfoBtn'>☎ 전화걸기</button>
	       <hr>
	       <div id = 'totaPayInfo'>	       
	       <span class = 'menuPrice'>결제방법 :  ${howToPay}</span><br/>	       	      
	       <span class = 'menuPrice'>총 결제금액 :  ${totalPrice}원</span><br/>
	       <span class = 'menuPrice'>요청사항:  ${consumerRequest}</span><br/>
	        
	        </div>
	       </div>
	 </div>
	 <div id='ridertime'>
	        <div class='sub'>배송상태</div>
	 
	 </div> 
	 <form id="payAfter" name="payAfter" class=""payAfter"">
	<button type='button' class='endBtn' onclick="end();">확인</button>>
	</form> 
</div>
</body>
<script>
  function callInfoBtn(){
		alert("서울 강남점 : 02-1234-1234");
	}
  
  function end(){
		console.log("1");
		var form = document.payAfter;
		console.log("2");
		form.action = 'JstoreSelect';
		form.submit(); 
	}

</script>
</html>