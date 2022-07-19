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
		<div id='storeName' name="storeName">${stn }</div>
		<div id='left_area_dateSales'>
			<label>판매 기간</label><br/>
			<input type='text' readonly value='${date1}' id="startdate"><br/>~<br/>
			<input type='text' readonly value='${date2}' id="enddate"><br/>
			<div id='left_area_dateSales_down'>
				<label>총 판매건수</label>&nbsp;&nbsp;: ${hit }건<br/>
				<label>총 매출</label>&nbsp;&nbsp;: ${tot }₩
			</div>
		</div>	
	</div>
	
	<div id='right_area'>
		<form method='post' name='frm_store_sale' id='frm_store_sale'>
			<input type='date' id="startnal" name="date1" onchange="startday()" value="${date1 }"></input>~
			<input type='date' id="endnal"  name="date2"onchange="endday()" value="${date2 }"></input>
			<button type = 'button' value = 'btn_lookUp' name = 'lookUp' onclick="find(this.form)">조회</button><br/>
		</form>
		
		
		
		<div id='wrap'>
			<div class="title">
				<span>No.</span>
				<span>매출일자</span>
				<span>₩</span>
			</div>
			<div class='itemsWrap'>
				<c:set var='num' value='${page.startNo}'/>
				<c:forEach var='l' items="${list}" >
			
						<div class="items">
							<span>${num}.</span>
							<span>&nbsp;&nbsp;&nbsp;&nbsp;${l.nal}</span>
							<span>${l.harutotal}₩</span>
								
						</div>
				
				<c:set var='num' value='${num=num+1}'/>	

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
		</div>
		<form method="post" id="frm_store_sale" name="frm_store_sale">
			<input type="hidden" id="nowPage">
			<input type="hidden" id="mid" value="">
		
		</form>
	
	</div>
</div>
</body>
<script src="/js/store_sale.js"></script>
<script></script>
</html>