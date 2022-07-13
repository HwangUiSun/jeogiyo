<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = 'stylesheet' type='text/css' href = './css/consumer.css'>
<script src = './js/consumer.js'></script>
<title>JstoreSelect</title>
</head>
<body>
<div id='JstoreSelect'>
	<div id='main'>
	     <a href='homeBtn'><span  id='homeBtn' >HOME</span></a>
	     <h1>저기요</h1>
	</div>
	<div id='top'>
	          <ul>
	             <a href='JstoreSelect'>주문하기  |</a>
	             <a href='MyPage'>내정보  |</a>
	             <a href='JorderList'>주문내역  |</a>
	             <a href='FAQ'>FAQ</a>   
	          </ul>
	</div>
	<div id= 'Jstore_list'>
	        <h3>주문하기</h3><br/>
	        <h1>매장찾기</h1><br/>
		<form name='frm_Jstore' method='post' id='frm_Jstore'>
	             
	            
				<select class='mapFind' id='mapFindStr' name='mapFindStr' onchange='cityFindChange(this)'>
				
				<option value='seoul'>서울</option>
				<option value='gyeonggi'>경기</option>
				<option value='pusan'>부산</option>
				</select>
				
				
				<select class='mapFindcity' id='storeFindStr' name='storeFindStr' onchange='mapFindChange(this)' >
				<option>선택해주세요</option>
				
				</select>
				<input type='text' id='findStore'/>
				<button type='button' id='storeListBtn' onclick="test()">매장찾기</button>
				<input type='hidden' name='nowPage' value='${page.nowPage }'/>
		</form>
	</div>
	
		
		 						
	
	<div id='list'>
		<div class='title'>
			<span class='sno'>No</span>
			<span class='storeName'>매장명</span>
			<span class='storeaddress'>주소</span>
			<span class='storecall'>전화번호</span>
			
		</div>
		<div class='items'>
			<c:set var='num' value='${page.startNo }' />
			<c:forEach var='v' items='${list }'>
				<div class='item' onclick="modify('${v.id}')">
					<span class='no'     >${num }</span>
					<span class='storeName'     >${v.id }</span>
					<span class='storeaddress'  >${v.mName}</span>
					<span class='genstorecall' >${v.gender}</span>
			<a href='orderBtn'><button type='button' class='orderBtn'>주문하기</button></a>
			<a href='checkReviewBtn'><button type='button' class='checkReviewBtn'>리뷰보기</button></a>
				
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
	</div>
</div>

</body>
</html>