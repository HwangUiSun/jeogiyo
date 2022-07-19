<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_storeM</title>
<link href="/css/store_Drop.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
center_storeM<br/>
<div id = "subject">가맹 탈퇴신청 현황</div>
<div id ='center_Drop'>
<a href='center_storeDropView'>가맹 탈퇴 상세보기</a>
<a href='storeCenter'>Home</a>
</div>
<div id='Drop'>
<form name='frm_Drop' class='frm_Drop' method='post'>
	<input type = 'text' name='findStr' value='${storepage.findStr}'>
	<input type = 'hidden' name='nowPage' value='${page.nowPage}'>
	<button type= 'button' onclick ='btnDrop(this.form)'>조회</button>
</form>
</div>

<div class='title'>
	<span>NO</span>
		<span>제목</span>
		<span>작성자</span>
		<span>상태</span>
</div>	


	<div class="center_Drop">
	<c:set var='num' value='${page.startNo }' />
	<c:forEach var='v' items='${storelist}'>
		<div class='items' onclick="center_storeView(${num})"><!-- 완료 -->
			<span>${num}</span>
			<span>${v.subject}</span>
			<span>${v.storeName }</span>
			<span>${v.nal}</span>
		</div>
	<c:set var='num' value='${num=num+1 }'/>
	</c:forEach>
	<div class='paging'>
		
			<c:if test="${storepage.startPage>1 }">
				<button type='button' class='btnFirst'  onclick='movePage(1)'>맨첨</button>
				<button type='button' class='btnPrev'   onclick='movePage(${storepage.startPage-1})' >이전</button>
			</c:if>		
			
			
			<c:forEach var='i' begin='${storepage.startPage }' end='${storepage.endPage }'>
				<button type='button' class='first'  onclick = 'movePage(${i})' >${i}</button>
			</c:forEach>				


			<c:if test="${storepage.endPage < storepage.totPage }">
				<button type='button' class='btnNext'  onclick='movePage(${storepage.endPage+1})'>다음</button>
				<button type='button' class='btnLast'  onclick='movePage(${storepage.totPage})'>맨끝</button>
			</c:if>		
		</div>	
	</div>
<script src='./js/centerstoreDrop.js'></script>
</body>
</html>