<%@ taglib prefix = 'c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FAQ</title>
</head>
<body>

<h1>FAQ</h1>

<div id=question>
    <div id='subject'>배달 주문 팁</div>
    <button id='btnToggle' onclick='Toggle()'>확인</button><br/>
      <div id='Toggle' style='display:none'>배달 주문 팁은 2000원입니다.</div><br/>
      <hr/>
</div>

<div id=question_1>
    <div id='subject'>라이더는 언제오나요</div>
    <button id='btnToggle_1' onclick='Toggle_1()'>확인</button><br/>
      <div id='Toggle_1' style='display:none'>보통 60분 내로 도착합니다.</div><br/>
      <hr/>
</div>

<div id=question_2>
    <div id='subject'>리뷰는 어떻게 쓰나요</div>
    <button id='btnToggle_2' onclick='Toggle_2()'>확인</button><br/>
      <div id='Toggle_2' style='display:none'>리뷰작성 페이지에서 리뷰 작성 버튼을 클릭하세요</div><br/>
      <hr/>
</div>


</body>
<script>
function Toggle(){
	var Toggle = document.getElementById('Toggle');
	
	if(Toggle.style.display !== 'none'){
		Toggle.style.display = 'none';
	}else{
		Toggle.style.display = 'block';
	}
}

function Toggle_1(){
	var Toggle_1 = document.getElementById('Toggle_1');
	
	if(Toggle_1.style.display !== 'none'){
		Toggle_1.style.display = 'none';
	}else{
		Toggle_1.style.display = 'block';
	}
}

function Toggle_2(){
	var Toggle_2 = document.getElementById('Toggle_2');
	
	if(Toggle_2.style.display !== 'none'){
		Toggle_2.style.display = 'none';
	}else{
		Toggle_2.style.display = 'block';
	}
}
</script>
</html>