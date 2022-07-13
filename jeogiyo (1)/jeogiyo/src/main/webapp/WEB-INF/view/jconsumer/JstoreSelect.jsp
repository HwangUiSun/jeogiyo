<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script src="/js/JstoreSelect.js"></script>
<title>JstoreSelect</title>
<link href="css/JstoreSelect.css" rel="stylesheet">
</head>
<body>
<div id='JstoreSelect'>
	
	<div id= 'Jstore_list'>
	       <div id = 'subject' >주문하기</div>
	        <div id = 'sub'>매장찾기</div>
			<a href='orderBtn'><button type='button' class='orderBtn'>주문하기</button></a>
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
	
		
		 						
	
	<div id='wrap'>
		<div class='title'>
			<span>No</span>
			<span>매장명</span>
			<span>주소</span>
			<span>전화번호</span>
			
		</div>
		<div class='itemsWrap'>
			<c:set var='num' value='${page.startNo }' />
			<c:forEach var='v' items='${list }'>
				<div class='items'>
					<span class='no'     >${num }</span>
					<span class='storeName'     >${v.Jname }</span>
					<span class='storeaddress'  >${v.Jname}</span>
					<span class='genstorecall' >${v.Jphone}</span>
			<a href='checkReviewBtn'><button type='button' class='checkReviewBtn'>리뷰보기</button></a>
				
				</div>
				<c:set var='num' value='${num=num+1 }'/>
			</c:forEach>
			
		</div>
		<div class= 'paging'>	
	
	<c:if test="${page.startPage>1}">
		<button type= 'button' class= 'btnFirst' onclick='movePage(1)'>맨처음</button>
		<button type= 'button' class= 'btnPrev' onclick='movePage(${page.startPage-1})'>이전</button>
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