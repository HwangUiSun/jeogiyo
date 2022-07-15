<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/Jpayhistory.css" rel="stylesheet">
<script src="/js/Jpayhistory.js"></script>
<title>Jpayhistory</title>

</head>
<body>

	<div id= 'Jpayhistory_list'>
	        <div id='subject'>주문하기</div>
	   <div id='payInfo'>
	        <div class='sub'>결제정보</div>
	        <br/><label>수령인정보</label><br/>
	        <label>이름</label>
	        <input type='text' class='name'/><br/>
	        <label>연락처</label>
	        <input type='text' class='phone'/><br/>
	        <label>주소</label>
	        <input type='text' class='address'/>
	       <a href='apiBtn'> <button type='button' class='apiBtn'>주소변경</button></a><br/>
	        <label>상세주소</label>
	        <input type='text' class='apiAddressDetail'/><br/>
	        <label>요청사항</label>
	        <input type='text' class='request'/>
	   </div>
	   
	   <div id='priceInfo'>
	        <div class='sub'>주문내역</div>
	       <span class = 'foodImg'><img src='../img/chicken1.png'width='240px' height='240px'/></span>
	     
	       <span class = 'foodInfo'>발사믹치킨</span>
	       <span class = 'ea'>1개</span>
	       <span class = ' menuEaPrice'>18500원</span><br/>
	       <img src='../img/line.png'width='600px' height='20px'/><br/>
	       <span class = 'menuPrice'>총 결제금액 18500원</span><br/>
	   </div>
	   
	   <form action="/status">
	     <label class='paySelect'>결제방법
		       <br/><input type='radio' name='radioSelect' id='meetPayBtn' value='1'/>만나서 결제
		            <input type='radio' name='radioSelect' id='cardPayBtn' value='2' />카드 결제
		 </label>	
	   </form>
	   
	   <div id='point'>
	          <div class='sub'>포인트사용</div>
	          <div class='msg'>
	         <label>포인트사용</label>
	        <input type='text' class='usePoint' value='2000p'/>
	        <button type='button' class='usePointBtn'>포인트 전액 사용</button><br/>
	        <label>보유포인트</label>
	        <input type='text' class='havePoint' readonly/><br/>
	        </div>
	   </div>
	   
	   <div id='payPrice'>
	         <div class='sub'>최종결제금액</div>
	         <div class='font'>
	         <br/><label>총 상품 금액&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
	         <label>배송 금액&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
	         <label>결제 금액&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><br/>
	         </div>
	         
	         <div class='font2'>
	         <span class = 'menuprice'>18500원</span>
	          <span>+</span>
	         <span class = 'riderPrice'>2000원</span>
	         <span>=</span>
	         <span class = 'totalPrice'>2000원</span> 
	         </div>
	   </div>
	   
	   <div id='Btns'>
	        <hr/>
	        <a href='payBtn'><button type='button' class='payBtn'>결제</button></a>
	        <a href='paycancelBtn'><button type='button' class='paycancelBtn'>취소하기</button></a>
	   </div>
	</div>
</body>

<script>
$("input[type=radio]").click(function(){
	$(this).prop("checked", true);
	$("form").submit();
})
</script>
</html>