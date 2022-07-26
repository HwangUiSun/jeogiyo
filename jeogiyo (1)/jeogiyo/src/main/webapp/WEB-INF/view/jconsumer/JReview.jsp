<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noti_main</title>
<link href="/css/JReview.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
<div id="subject">리뷰보기</div>
<div id='Jreview'>

<div id='menuTitle'>
	
	<form name="frm_review" id="frm_review" method="post">
		
		
			
		<input type="hidden" name="sno" value="${v.sno }">
		<input type="hidden" name="nowPage" value="${reviewpage.nowPage}" >
		<input type="hidden" name="ioginId" id="ioginId" value="${sessionScope.id }" >
	</form>
</div>
<div class='title' onclick="">
		<span class='sno'>NO</span>
		<span class='subject'>제목</span>
		<span class='id'>작성자</span>
		<span class='ordertime' >날짜</span>
	</div>
	<div class="itemsWrap">
	<c:forEach var='v' items='${reviewlist}'>
		<div class='items' onclick="noti_view.view(${v.sno})">
			<span class='sno'>${v.sno-1}</span>
			<span  class='subject'>${v.subject}</span>
			<span class='id'>${v.mid }</span>
			<span  class='ordertime'>${v.ordertime}</span>
		</div>
	</c:forEach>
	<div class='paging'>
		
			<c:if test="${reviewpage.startPage>1 }">
				<button type='button' class='btnFirst'  onclick='movePage(1)' >맨첨</button>
				<button type='button' class='btnPrev'   onclick='movePage(${reviewpage.startPage-1})' >이전</button>
			</c:if>		
			
			
			<c:forEach var='i' begin='${reviewpage.startPage }' end='${reviewpage.endPage }'>
				<button type='button' class='first'  onclick = 'movePage(${i})' >${i }</button>
			</c:forEach>				


			<c:if test="${reviewpage.endPage < reviewpage.totPage }">
				<button type='button' class='btnNext'  onclick='movePage(${reviewpage.endPage+1})'>다음</button>
				<button type='button' class='btnLast'  onclick='movePage(${reviewpage.totPage})'>맨끝</button>
			</c:if>		
		</div>	
	</div>
</div>	
<script src='./js/Jreview.js'></script>
<script>
	button()
</script>
</body>
</html>
