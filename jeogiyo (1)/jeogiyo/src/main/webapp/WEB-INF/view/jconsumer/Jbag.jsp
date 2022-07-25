<%@ taglib prefix ='c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jbag</title>
<link href="css/Jbag.css" rel="stylesheet">
<script src = './js/consumer.js'></script>
<script src = './js/ordercancle.js'></script>
 <script>
function clickEffect(e){
  var d=document.createElement("div");
  d.className="clickEffect";
  d.style.top=e.clientY+"px";d.style.left=e.clientX+"px";
  document.body.appendChild(d);
  d.addEventListener('animationend',function(){d.parentElement.removeChild(d);}.bind(this));
}
document.addEventListener('click',clickEffect);
</script>
</head>
<body>



<div id='Jag'>
	
	<div id= 'Jbag_list'>
	        <div id='subject'>장바구니</div>
	   <div id='wrap'>
		<c:set var='num' value='0'/>
		<c:forEach var = 'v' items="${menus}" varStatus="status">
			<div id = 'itemsWrap'>
	     	  <div class='items'id='items'>
	     	  		<img src="${imgs[status.index]}" width='240px' height='240px'/>
<<<<<<< HEAD
					<span class = 'sno'>${num+1 }</span>
					<span class = 'menu'>${v}</span>						
					<span class = 'ea'>	${eas[status.index]}개 </span>		
=======
					<span class = 'sno'>${num+1 }  
					 ${v}
					</span>	
					<span class='ea'>	${eas[status.index]}개 </span>		
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> a2e8e4a222d65ba6a827f84dada3f23cccc88d8b
=======
>>>>>>> a2e8e4a222d65ba6a827f84dada3f23cccc88d8b
=======
>>>>>>> a2e8e4a222d65ba6a827f84dada3f23cccc88d8b
					<span class='price'> ${prices[status.index]*eas[status.index]}원</span>					
					<button type = 'button' class='cancelBtn'name = 'cancelBtn' 
					onclick ="cancle(this)">삭제</button>
				</div>
			</div>
			<hr/>
			<c:set var='num' value='${num=num+1 }'/>
		</c:forEach>
	
			
		
		<c:forEach var="p" items="${prices}" varStatus="status">
		<c:set var='num' value='${nums=nums+(p*eas[status.index])}'/>		
		</c:forEach>
		<span class='menuPrice'>총 금액 :		
		${nums}원
		</span><br/>
		<form name="jbag_frm" method="post" action="menuAddBtn">
			<button type='submit' class='menuAddBtn'>메뉴추가</button>		
		</form>
		<form name="jbag_frm" method="post" action="jorderBtn">
			<input type="hidden" name="totalPrice" value="${nums}" id="totalPrice">
			<input type="hidden" name="priceArray" value="${prices}" id="priceArray">
			<input type="hidden" name="eaArray" value="${eas}" id="eaArray">
			<input type="hidden" name="menus" value="${menus}" id="menus">
			<input type='hidden' name='imgArray' value="${imgs}" id="imgArray">
			<button type='submit' class='jorderBtn'>주문하기</button>
		</form>
		
  </div>

	
	
</div>
</body>
</html>