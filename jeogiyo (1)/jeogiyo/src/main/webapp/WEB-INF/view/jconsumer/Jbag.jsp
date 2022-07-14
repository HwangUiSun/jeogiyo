<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jbag</title>
<link rel = 'stylesheet' href = './css/consumer.css'>
<script src = './js/consumer.js'></script>
</head>
<body>
<h1>Jbag</h1>


<div id='Jbeg'>
	<div id='main'>
	     <a href='homeBtn'><span  id='homeBtn' >HOME</span></a>
	     <h1>저기요</h1>
	</div>
	<div id='top'>
	          <ul>
	             <a href='JstoreSelect'>주문하기</a>
	             <a href='MyPage'>내정보</a>
	             <a href='JorderList'>주문내역</a>
	             <a href='FAQ'>FAQ</a>
	          </ul>
	</div>
	<div id= 'Jbeg_list'>
	        <h1>장바구니</h1><br/>
	    <div id='list'>	
			<span class='sno'>No</span>
			<span class='foodImg'>상품정보</span>
			<span class='foodInfo'>추가특성</span>
			<span class='ea'>수량</span>
			
		</div>
		<div class='items'>
			<c:set var='num' value='${page.startNo }' />
			<c:forEach var='v' items='${list }'>
				<div class='item' onclick="modify('${v.id}')">
					<a href='cancelBtn'><button type='button' class='cancelBtn'>삭제</button></a>
					<span class='sno'     >${num }</span>
					<span class='foodImg'     >${v.foodImg }</span>
					<span class='foodInfo'  >${v.foodInfo}</span>
					<span class='ea' >${v.ea}</span>				
				
				</div>
				<c:set var='num' value='${num=num+1 }'/>
			</c:forEach>
			
		</div>
		<div class= 'paging'>	
	
	<c:if test="${page.startPage>1}">
		<button type= 'button' class= 'btnFirst' onclick='movePage(1)'>맨처음</button>
		<button type= 'button' class= 'btnPrev' onclick='movePage(${page.startPage})'>이전</button>
	</c:if>
		

		<c:forEach var='i' begin='${page.startPage}' end='${page.endPage}'>
		<button type= 'button' class= 'first' onclick ='movePage(${i})'>${i}</button>
		</c:forEach>

		<c:if test ="${page.endPage<page.totPage}">
		<button type= 'button' class= 'btnNext' onclick = 'movePage(${page.endPage+1})'>다음</button>
		<button type= 'button' class= 'btnLast' onclick = 'movePage(${page.totPage})'>맨끝</button>
		</c:if>
		</div>
		<span class='menuPrice'>총 금액 : 18500원</span><br/>
		<a href='menuAddBtn'><button type='button' class='menuAddBtn'>메뉴추가</button></a>
		<a href='jorderBtn'><button type='button' class='jorderBtn'>주문하기</button></a>
  </div>
  
	
	
</div>
</body>
</html>