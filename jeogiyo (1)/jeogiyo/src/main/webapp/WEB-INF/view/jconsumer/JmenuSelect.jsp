<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/JmenuSelect.css" rel="stylesheet">
<title>JmenuSelect</title>

</head>
<style>
ul.tabs{
   margin:0px;
   padding:0px;
   list-style:none;
}

ul.tabs li{
   display:inline-block;
 	background: #898989;
	color: white;
	padding: 10px 15px;
	cursor: pointer;
}

ul.tabs li.current{
	background: #e0e0e0;
	color: #222;
}

.tab-content{
    display: none;
	background: #e0e0e0;
	padding: 12px;
}

.tab-content.current{
    display : inherit;
}


</style>
<body>
	
	<div class= "container">
	  <h2>메뉴보기</h2>
	   <ul class= "tabs">
	         <li class="tab-link current" data-tab="tab-1">신메뉴</li>
	         <li class="tab-link"         data-tab="tab-2">달콤메뉴</li>
	         <li class="tab-link"         data-tab="tab-3">매콤메뉴 </li>
	         <li class="tab-link"         data-tab="tab-4">사이드메뉴</li>
	         <li class="tab-link"         data-tab="tab-5">음료</li>	         
	   </ul>
	          
		<div id="tab-1" class="tab-content current">
		  <br/>
	       <a>발사믹치킨</a><br/>
	       <a>발사믹 비네거의 풍미와 달콤함의 기막힌 조화</a><br/>
	       <a>소비자가격 : 18500원</a><br/>
		   <a href='addBtn'><input type='button' class='addBtn' value='담기' /></a>
	    </div>
	    
		<div id="tab-2" class="tab-content">
	       <a>달콤 치킨</a><br/>
	       <a>발사믹 비네거의 풍미와 달콤함의 기막힌 조화</a><br/>
	       <a>소비자가격 : 18500원</a><br/>
		   <a href='addBtn'><input type='button' class='addBtn' value='담기' /></a>
	    </div>
	    
		<div id="tab-3" class="tab-content">
	       <a>매콤 치킨</a><br/>
	       <a>발사믹 비네거의 풍미와 달콤함의 기막힌 조화</a><br/>
	       <a>소비자가격 : 18500원</a><br/>
		   <a href='addBtn'><input type='button' class='addBtn' value='담기' /></a>
	    </div>
	    
		<div id="tab-4" class="tab-content">
	       <a>치즈스틱</a><br/>
	       <a>발사믹 비네거의 풍미와 달콤함의 기막힌 조화</a><br/>
	       <a>소비자가격 : 18500원</a><br/>
		   <a href='addBtn'><input type='button' class='addBtn' value='담기' /></a>
	    </div>
	    
		<div id="tab-5" class="tab-content">
	       <a>콜라</a><br/>
	       <a>발사믹 비네거의 풍미와 달콤함의 기막힌 조화</a><br/>
	       <a>소비자가격 : 18500원</a><br/>
		   <a href='addBtn'><input type='button' class='addBtn' value='담기' /></a>
	    </div>	 
	             
	  </div>

		    <a href='bagBtn'><button type='button' class='bagBtn'>장바구니</button></a>


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script>

if (typeof window === 'object') {
	// Check if document is finally loaded
	   document.addEventListener("DOMContentLoaded", function () {
	       alert('Finished loading')
	     });
	  }
	  
$(document).ready(function(){
	
	$('ul.tabs li').click(function(){
		var tab_id = $(this).attr('data-tab');
		
		$('ul.tabs li').removeClass('current'); //선택된 탭의 css 제거
		$('.tab-content').removeClass('current');
		
		$(this).addClass('current'); //선택된 탭의 css를 씌운다
		$("#"+tab_id).addClass('current');
		
	});
});
</script>
	
</body>
</html>