<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noti_main</title>
<link href="/css/noti.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<style>
@import url('https://fonts.googleapis.com/css2?family=Poor+Story&display=swap');
</style>
</head>
<body>
<div id="subject">공지 사항</div>

<div id='menuTitle'>
	
	<form name="frm_noti" id="frm_noti" method="post">
		
		<div id="findbox">
			<input type="text" name="findStr" id="findStr" value="${notipage.findStr}" >
			<button type='button' onclick="noti_view.find(this.form)">검색</button>
		</div>
		<div id="inputbutton">
			<button type='button' onclick="noti_view.input(this.form)"  >공지사항작성</button>	
		</div>		
		<input type="hidden" name="sno" value="${vo.sno }">
		<input type="hidden" name="nowPage" value="${notipage.nowPage}" >
		<input type="hidden" name="ioginId" id="ioginId" value="${sessionScope.id }" >
	</form>
</div>
<div class='title' onclick="">
		<span>NO</span>
		<span>제목</span>
		<span>작성자</span>
		<span>날짜</span>
	</div>
	<div class="itemsWrap">
	<c:forEach var='v' items='${notilist}'>
		<div class='items' onclick="noti_view.view(${v.sno})">
			<span >${v.sno}</span>
			<span>${v.subject}</span>
			<span>본사</span>
			<span>${v.nal}</span>
		</div>
	</c:forEach>
	<div class='paging'>
		
			<c:if test="${notipage.startPage>1 }">
				<button type='button' class='btnFirst'  onclick='movePage(1)' >맨첨</button>
				<button type='button' class='btnPrev'   onclick='movePage(${notipage.startPage-1})' >이전</button>
			</c:if>		
			
			
			<c:forEach var='i' begin='${notipage.startPage }' end='${notipage.endPage }'>
				<button type='button' class='first'  onclick = 'movePage(${i})' >${i }</button>
			</c:forEach>				


			<c:if test="${notipage.endPage < notipage.totPage }">
				<button type='button' class='btnNext'  onclick='movePage(${notipage.endPage+1})'>다음</button>
				<button type='button' class='btnLast'  onclick='movePage(${notipage.totPage})'>맨끝</button>
			</c:if>		
		</div>	
	</div>
	
<script src='./js/noti.js'></script>
<script>
	button()
</script>
</body>
</html>
