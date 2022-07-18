<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			
		<form name='frm_Jstore' method='post' id='frm_Jstore'>
	             
	            
				<select class='mapFind' id='mapFindStr' name='mapFindStr' onchange='cityFindChange(this)'>
				
				<option>선택해주세요</option>
				<option value='seoul'>서울</option>
				<option value='gyeonggi'>경기</option>
				<option value='pusan'>부산</option>
				</select>
				
			<a href='orderBtn'><button type='button' class='orderBtn'>주문하기</button></a></span>
				
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
		<div id = 'itemsWrap'>
		<c:set var='num' value='${consumerpage.startNo }' />
		<c:forEach var='v' items='${storeSelectlist}'>
		       <div class='items'onclick="">
			        <span class='no'     >${num+1 }</span>
					<span class='storeName'     >${v.sotreName} }</span>
					<span class='storeaddress'  >${v.address } </span>
					<span class='genstorecall' >${v.phone} &nbsp;&nbsp;
			<a href='checkReviewBtn'><button type='button' class='checkReviewBtn'>리뷰보기&nbsp;&nbsp;</button></a>
			 </div>
			</div>
		
		<hr/>
		<c:set var='num' value='${num=num+1 }'/>
	</c:forEach>
		
				
		
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
	
</div>

</body>
</html>