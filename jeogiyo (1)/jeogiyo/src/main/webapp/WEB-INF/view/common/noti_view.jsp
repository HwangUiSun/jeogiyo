<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noti_view</title>
</head>
<body>
noti_view
<a href='noti'>돌아가기</a>
<a href='center_noti'>(본사)돌아가기</a>
<a href='storeCenter'>Home</a>
<div class='title' onclick="">
		<span>NO</span>
		<span>제목</span>
		<span>작성자</span>
		<span>날짜</span>
	</div>
	<div class="itemsWrap">
	<c:set var='num' value='${notipage.startNo }' />
	<c:forEach var='v' items='${notilist}'>
		<div class='items' onclick="">
			<span >${num}</span>
			<span>${v.subject}</span>
			<span>본사</span>
			<span>${v.nal}</span>
		</div>
	<c:set var='num' value='${num=num+1 }'/>
	</c:forEach>
	<div class='paging'>
		
			<c:if test="${notipage.startPage>1 }">
				<button type='button' class='btnFirst'  onclick='movePage(1)'  >맨첨</button>
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
	<form name="frm_noti" method="post">
		<input type="hidden" name="nowPage" value="${notipage.nowPage}">
	</form>
<script src="./js/noti.js"></script>
</body>
</html>