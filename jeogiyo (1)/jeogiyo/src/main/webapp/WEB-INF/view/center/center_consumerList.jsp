<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_consumerList</title>
<link href="css/center_consumerList.css" rel="stylesheet">
</head>
<body>
<div id="subject">회원 목록</div>
<div id="wrap">
	
	<div class="title">
		<span>No.</span>
		<span>성명.</span>
		<span>아이디</span>
		<span>연락처</span>
		<span>주소</span>
	</div>
	<div class='itemsWrap'>
		<c:set var='num' value='${page.startNo }' />
			<c:forEach var='v' items='${list}'>
			<div class="items">
				<span>${num}</span>
				<span>${v.name}.</span>
				<span>${v.mid}</span>
				<span>${v.phone}</span>
				<span>${v.address}</span>
			</div>
			<c:set var='num' value='${num=num+1 }'/>
		</c:forEach>	
		<div class='paging'>		
			<c:if test="${page.startPage>1 }">
				<button type='button' class='btnFirst'  onclick='movePage(1)'  >맨첨</button>
				<button type='button' class='btnPrev'   onclick='movePage(${page.startPage-1})' >이전</button>
			</c:if>		
			
			
			<c:forEach var='i' begin='${page.startPage }' end='${page.endPage }'>
				<button type='button' class='first'  onclick = 'movePage(${i})' >${i }</button>
			</c:forEach>				


			<c:if test="${page.endPage < page.totPage }">
				<button type='button' class='btnNext'  onclick='movePage(${page.endPage+1})'>다음</button>
				<button type='button' class='btnLast'  onclick='movePage(${page.totPage})'>맨끝</button>
			</c:if>		
		</div>	
	</div>
	<form name="frm_consumer" method="post">
		<input type="hidden" name="nowPage" value="${page.nowPage}">
	</form>		
</div>
<script src="/js/center_consumerList.js"></script>
</body>
</html>