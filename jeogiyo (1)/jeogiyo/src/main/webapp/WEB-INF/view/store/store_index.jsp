<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>store_index</title>
<link rel='stylesheet' type='text/css' href='/css/store_index.css'>
<script defer src='./js/store.js'></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<style>
@import url('https://fonts.googleapis.com/css2?family=Poor+Story&display=swap');
</style>
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
<div id='container'>
	<header id="top_logo">
		<div id="Logo" onclick="location.href='store_home'"></div>
		<div id="loginIdprint">● : ${sessionScope.id}님</div>
		<button type='button' id='store_logoutBtn' onclick="location.href='index'">로그아웃</button>
	</header>
	
	<div id='title_menu'>
		<ul>
			<a href='noti'><li>공지사항&nbsp;&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='order'><li>발주&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='chart'><li>매출관리&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='store_orderStatus'><li>주문현황&nbsp;&nbsp;&nbsp;|</li></a>
			<a href='store_drop'><li>탈퇴신청</li></a>
		</ul>
	</div>
	
	<div id="section">
		<jsp:include page="${inc}"></jsp:include>
	</div>
	<form>
		<input type="hidden" name="mid" value="${mid}"/>
	</form>
</div>
</body>
</html>