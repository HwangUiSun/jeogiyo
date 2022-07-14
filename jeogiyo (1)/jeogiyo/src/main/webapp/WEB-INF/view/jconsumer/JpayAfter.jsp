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
<h1>JpayAfter</h1>

<div id='JpayAfter'>
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
	<div id= 'JpayAfter_list'>
	        <div id='subject'>결제내역</div>
	</div>
	<div id='priceInfo'>
	       <div class='sub'>주문내역</div>
	       <span class = 'foodImg'><img src='../img/chicken1.png'width='240px' height='240px'/></span>
	     
	       <span class = 'foodInfo'>발사믹치킨</span>
	       <span class = 'ea'>1개</span>
	       <span class = ' menuEaPrice'>18500원</span><br/>
	       <button type='button' class='callInfoBtn'>전화걸기</button>
	       <hr/>
	       <span class = 'foodInfo'>발사믹치킨</span>
	       <span class = 'ea'>1개</span>
	       <span class = ' menuEaPrice'>18500원</span><br/>
	       <label>배송 금액</label>
	       <span class = 'riderPrice'>2000원</span><br/>
	       <span class = 'menuPrice'>총 결제금액 18500원</span><br/>
	 </div>
	 <div id='ridertime'>
	       <h3>배송상태</h3>
	 
	 </div>  
	 <a href='endBtn'><button type='button' class='endBtn'>확인</button></a>
</div>
</body>
</html>