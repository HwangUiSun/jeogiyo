<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noti_main</title>
<link href="/css/noti.css" rel="stylesheet">
</head>
<body>
<div id="subject">공지 사항</div>
<div id='menuTitle'>
	
	<form name="frm_noti" method="post">
		<a href='storeCenter'>Home</a>
		<div id="inputbutton">
			<button type='button' onclick="noti_view.input(this.form)" >
				(본사)공지사항<br/>작성하기
			</button>
		</div>	
		<input type="text" name="sno" value="${vo.sno }">
		<input type="text" name="nowPage" value="${notipage.nowPage}" >
		<input type="text" name="findStr" value="${notipage.findStr}" >
		<button type='button' onclick="noti_view.find(this.form)">검색</button>
	</form>
</div>
<div class='title' onclick="">
		<span>NO</span>
		<span>제목</span>
		<span>작성자</span>
		<span>날짜</span>
	</div>
	<div class="itemsWrap">
	<c:set var='num' value='${notipage.startNo }' />
	<c:forEach var='v' items='${notilist}'>
		<div class='items' onclick="noti_view.view(${num})">
			<span >${num}</span>
			<span>${v.subject}</span>
			<span>본사</span>
			<span>${v.nal}</span>
		</div>
	<c:set var='num' value='${num=num+1 }'/>
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
</body>
</html>
