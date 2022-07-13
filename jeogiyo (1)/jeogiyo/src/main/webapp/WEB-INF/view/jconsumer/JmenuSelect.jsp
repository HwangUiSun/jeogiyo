<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = 'stylesheet' type='text/css' href = './css/consumer.css'>
<script src = './js/consumer.js'></script>
<title>JmenuSelect</title>

</head>
<body>
<h1>JmenuSelect</h1>
<div id='JmenuSelect'>
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
	<div id= 'Jmenu_list'>
	        <h1>메뉴보기</h1><br/>
	        <a href='menuNew'> <input type='button' class='menuNew' value='신메뉴' /></a>
	        <a href='menuDal'> <input type='button' class='menuDal' value='달콤메뉴' /></a>
	        <a href='menuMae'> <input type='button' class='menuMae' value='매콤메뉴' /></a>
	        <a href='menuSide'> <input type='button' class='menuSide' value='사이드메뉴' /></a>
	        <a href='menuDrink'> <input type='button' class='menuDrink' value='음료' /></a>
	    
	        <br/><span class = 'foodImg'><img src='./Jimages/chicken1.png'width='240px' height='240px'/></span>
	     
	       <span class = 'foodInfo'><h3>발사믹치킨</h3></span>
	       <span class = 'foodInfo2'>발사믹 비네거의 풍미와 달콤함의 기막힌 조화</span><br/>
	       <span class = 'menuPrice'>소비자가격 : 18500원</span><br/>
	   
		    <a href='addBtn'><input type='button' class='addBtn' value='담기' /></a><br/>
			<a href='bagBtn'><button type='button' class='bagBtn'>장바구니</button></a>
	</div>
</div>
	
</body>
</html>