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
	       <span class = 'foodImg'><img src='../img/chicken1.png'width='240px' height='240px'/></span>
	     
	       <span class = 'foodInfo'>발사믹치킨</span>
	       <span class = 'ea'>1개</span>
	        <span class = ' menuEaPrice'>18500원</span><br/><br/>
	       <button type='button'onclick="javascript:callInfoBtn()" class='callInfoBtn'>☎ 전화걸기</button>
	       
	       <div id = 'totaPayInfo'>
	          <div class = 'msg'>
	       <span class = 'foodInfo'>발사믹치킨</span>
	       <span class = 'ea'>1개</span>
	       <span class = ' menuEaPrice'>18500원</span><br/>
	       <label>배송 금액</label>
	       <hr/>
	       <span class = 'riderPrice'>2000원</span><br/>
	       <span class = 'menuPrice'>총 결제금액 18500원</span><br/>
	        </div>
	       </div>
	 </div>
	 <div id='ridertime'>
	        <div class='sub'>배송상태</div>
	 
	 </div>  
	 <a href='endBtn'><button type='button' class='endBtn'>확인</button></a>
</div>
</body>
<script>
  function callInfoBtn(){
		alert("서울 강남점 : 02-1234-1234");
	}

</script>
</html>