<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>store_sale</title>
<link rel='stylesheet' type='text/css' href='/css/store_sale.css'>
</head>
<body>
<a href='storeCenter'>Home</a>
<div id='subject'>매출관리</div>
<div id='store_sale'>
	
	
	<div id='left_area'>
		<div id='storeName'>서울대입구 1호점</div>
		<div id='left_area_dateSales'>
			<label>판매 기간</label><br/>
			<input type='text' readonly value=''><br/>~<br/>
			<input type='text' readonly value=''><br/>
			<div id='left_area_dateSales_down'>
				<label>총 판매건수</label>&nbsp;&nbsp;: <br/>
				<label>총 매출</label>&nbsp;&nbsp;:
			</div>
		</div>	
	</div>
	
	<div id='right_area'>
		<form method='post' name='frm_store_sale' id='frm_store_sale'>
			<input type='date'></input>~
			<input type='date'></input>
			<button type = 'button' value = 'btn_lookUp' name = 'lookUp'>조회</button><br/>
		</form>
		
		
		
		<div id='wrap'>
			<div class="title">
				<span>No.</span>
				<span>매출</span>
			</div>
			<div class='itemsWrap'>
				<c:forEach var='num' begin="1" end="10">
						<div class="items">
							<span>${num}.</span>
							<span>매출</span>
						</div>
						
				</c:forEach>
			
				<div class='paging'>		
					<c:if test="${page.startPage>1 }">
						<button type='button' class='btnFirst'  onclick='movePage(1)'  >맨첨</button>
						<button type='button' class='btnPrev'   onclick='movePage(${page.startPage-1})' >이전</button>
					</c:if>		
					
					
					<c:forEach var='i' begin='1' end='5'>
						<button type='button' class='first'  onclick = 'movePage(${i})' >${i }</button>
					</c:forEach>				
		
		
					<c:if test="${page.endPage < page.totPage }">
						<button type='button' class='btnNext'  onclick='movePage(${page.endPage+1})'>다음</button>
						<button type='button' class='btnLast'  onclick='movePage(${page.totPage})'>맨끝</button>
					</c:if>		
				</div>	
			</div>
		</div>
	
	
	</div>
</div>
</body>
<script src="/js/center_consumerList.js"></script>
</html>