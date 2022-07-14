<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/JmenuSelect.css" rel="stylesheet">
<script src = './js/consumer.js'></script>
<title>JmenuSelect</title>

</head>
<body>

<div id='JmenuSelect'>
	
	<div id= 'Jmenu_list'>
	       <div id='subject' >메뉴보기</div>
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