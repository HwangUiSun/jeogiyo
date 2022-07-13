<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = 'stylesheet' type='text/css' href = './css/consumer.css'>
<script src = './js/consumer.js'></script>
<title>Jpayhistory</title>

</head>
<body>
<h1>Jpayhistory</h1>

<div id='Jpayhistory'>
	<div id='main'>
	     <a href='homeBtn'><span  id='homeBtn' >HOME</span></a>
	     <h1>저기요</h1>
	</div>
	<div id='top'>
	          <ul>
	             <a href='JstoreSelect'>주문하기</a>
	             <a href='MyPage'>내정보</a>
	             <a href='JorderList'>주문내역</a>
	             <a href='FAQ'>FAQ</a>   
	          </ul>
	</div>
	<div id= 'Jpayhistory_list'>
	        <h1>주문하기</h1><br/>
	   <div id='payInfo'>
	        <h3>결제정보</h3>
	        <label>수령인정보</label><br/>
	        <label>이름</label>
	        <input type='text' class='name'/><br/>
	        <label>연락처</label>
	        <input type='text' class='phone'/><br/>
	        <label>주소</label>
	        <input type='text' class='address'/>
	        <button type='button' class='apiBtn'>주소변경</button><br/>
	        <label>상세주소</label>
	        <input type='text' class='apiAddressDetail'/><br/>
	        <label>요청사항</label>
	        <input type='text' class='request'/>
	   </div>
	   <div id='priceInfo'>
	       <h3>주문내역</h3>
	       <span class = 'foodImg'><img src='./Jimages/chicken1.png'width='240px' height='240px'/></span>
	     
	       <span class = 'foodInfo'>발사믹치킨</span>
	       <span class = 'ea'>1개</span>
	       <span class = ' menuEaPrice'>18500원</span><br/>
	       <hr/>
	       <span class = 'menuPrice'>총 결제금액 18500원</span><br/>
	   </div>
	   <div id='paySelect'>
	        <h3>결제방법</h3>
		    <input type='button' class='meetPayBtn' value='만나서결제' />
		    <input type='button' class='cardPayBtn' value='카드결제' />
			
	   </div>
	   <div id='point'>
	         <h3>포인트사용</h3>
	         <label>포인트사용</label>
	        <input type='text' class='usePoint' value='2000p'/>
	        <button type='button' class='usePointBtn'>포인트 전액 사용</button><br/>
	        <label>보유포인트</label>
	        <input type='text' class='havePoint' readonly/><br/>
	   
	   </div>
	   <div id='payPrice'>
	         <h3>최종결제금액</h3>
	         <label>총 상품 금액</label><br/>
	         <span class = 'menuprice'>18500원</span><br/>
	          <label>+</label><br/>
	         <label>배송 금액</label><br/>
	         <span class = 'riderPrice'>2000원</span><br/>
	         <label>=</label><br/>
	         <label>결제 금액</label><br/>
	         <span class = 'totalPrice'>2000원</span> 
	   </div>
	        <hr/>
	        <a href='payBtn'><button type='button' class='payBtn'>결제</button></a>
	        <a href='paycancelBtn'><button type='button' class='paycancelBtn'>취소하기</button></a>
	</div>
</div>
</body>
</html>