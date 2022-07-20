<%@ taglib prefix = 'c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>JorderList</title>
</head>
<body>
<div id = 'subject'>주문 내역</div>
<c:forEach var = 'status' begin = '1' end = '3'>
	<div id = 'JorderList'>
		<div class = 'time'>11 : 20</div>
		<div class = 'info'>
			<div class = 'amount'>총 금액 XX,XXX원</div>
			<div class = 'method'>만나서 결제</div>
			<div class = 'menu'>자바치킨 1개 / 콜라 500ml 1개</div>
			<div class = 'address'>서울시 관악구 남부순환로 1820 에그옐로우빌딩 14층</div>
		</div>
		
		<div class = 'btns'>
			<a href='reviewBtn'><button type = 'button' name = 'reviewBtn'>리뷰 작성</button></a>
		</div>
	</div>
	<hr/>
</c:forEach>
<div id='wrap'>
		<form name='frm_JorderList' method='post' id='frm_JorderList' action="JorderList">
		<div id = 'itemsWrap'>
			<c:set var='num' value='${consumerpage.startNo}' />
			<c:forEach var='v' items='${orderlist}'>
		       <div class='items'onclick="">
			        <span class='no'     >${num+1 }</span>
					<span class='ordertime'>${v.ordertime}</span>
					<span class='totalprice'  >${v.totalprice } ${v.howtopay}<br/>${ordermenu}<br/>${address} </span>					
					<a href='reviewBtn'><button type = 'button' name = 'reviewBtn'>리뷰 작성</button></a>
			 	</div>
				
		<hr/>
		<c:set var='num' value='${num=num+1 }'/>
		</c:forEach>
		</form>
		</div>
				
		
		<div class= 'paging'>	
	
	<c:if test="${consumerpage.startPage>1}">
		<button type= 'button' class= 'btnFirst' onclick='movePage(1)'>맨처음</button>
		<button type= 'button' class= 'btnPrev' onclick='movePage(${consumerpage.startPage-1})'>이전</button>
	</c:if>
		

		<c:forEach var='i' begin='${consumerpage.startPage}' end='${consumerpage.endPage}'>
		<button type= 'button' class= 'first' onclick ='movePage(${i})'>${i}</button>
		</c:forEach>

		<c:if test ="${consumerpage.endPage<consumerpage.totPage}">
		<button type= 'button' class= 'btnNext' onclick = 'movePage(${consumerpage.endPage+1})'>다음</button>
		<button type= 'button' class= 'btnLast' onclick = 'movePage(${consumerpage.totPage})'>맨끝</button>
		</c:if>
	</div>
	</div>
</body>
<script src="/js/Jorderlist.js"></script>
</html>