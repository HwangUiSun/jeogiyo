<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order_main</title>
<link rel='stylesheet' type='text/css' href='/css/order_main.css'>
</head>
<body>
<div id="subject">발주</div>

<a href='storeCenter'>Home</a>
<div id='menuTitle'>
	<c:if test="${mid != 'root'  }">
	<button type='submit' onclick="moveUrl()">
	
		발주 작성<br/>페이지

	</button>
	</c:if>
</div>
<div class='title' onclick="">
		<span>NO</span>
		<span>Title</span>
		<span>작성자</span>
		<span>상태</span>
	</div>
	<div class="itemsWrap">
	<c:set var='num' value='${baljupage.startNo }' />
	<c:forEach var='v' items='${baljulist}'>
			<form name="frm_sno" method="post" id="${v.sno}">
				<input type="hidden" name="sno" value="${v.sno}">
				<input type="hidden" name="title" value="${v.title}">
				<input type="hidden" name="id" value="${v.id}">
				<input type="hidden" name="mid" value="${mid}">
				<input type="hidden" name="nowPage" value="${baljupage.nowPage}">
			</form>
		
		<c:if test="${mid == 'root' }">
			<div class='items' onclick="orderViewC(${v.sno})">
		</c:if>
		<c:if test="${mid != 'root' }">
			<div class='items' onclick="orderView(${v.sno})">
		</c:if>
			<span >${num}</span>
			<span>${v.title}</span>
			<span>${v.id}</span>
			<span>
			<c:set var = "status" scope = "session" value = "${v.status}"/>
			 <c:choose>
         		<c:when test = "${status == true}">
           		 승인
        		</c:when>
         		<c:when test = "${status == false}">
          		 대기
        		</c:when>
     		 </c:choose></span>			
		</div>
	<c:set var='num' value='${num=num+1 }'/>
	</c:forEach> 
	<div class='paging'>
		
			<c:if test="${baljupage.startPage>1 }">
				<button type='button' class='btnFirst'  onclick='movePage(1)'  >맨첨</button>
				<button type='button' class='btnPrev'   onclick='movePage(${baljupage.startPage-1})' >이전</button>
			</c:if>		
			
			
			<c:forEach var='i' begin='${baljupage.startPage }' end='${baljupage.endPage }'>
				<button type='button' class='first'  onclick = 'movePage(${i})' >${i }</button>
			</c:forEach>				


			<c:if test="${baljupage.endPage < baljupage.totPage }">
				<button type='button' class='btnNext'  onclick='movePage(${baljupage.endPage+1})'>다음</button>
				<button type='button' class='btnLast'  onclick='movePage(${baljupage.totPage})'>맨끝</button>
			</c:if>		
		</div>	
	</div>
	<form name="frm_order" method="post">
		<input type="hidden" name="nowPage" value="${baljupage.nowPage}">
		<input type="hidden" name="title" id="title" value="${param.title}">
		<input type="hidden" name="nal" id="nal" value="">
	</form>
<script src="./js/order_main.js"></script>
</body>
</html>