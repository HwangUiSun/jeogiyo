<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<title>JstoreSelect</title>
<link href="css/JstoreSelect.css" rel="stylesheet">
<script>
function clickEffect(e){
  var d=document.createElement("div");
  d.className="clickEffect";
  d.style.top=e.clientY+"px";d.style.left=e.clientX+"px";
  document.body.appendChild(d);
  d.addEventListener('animationend',function(){d.parentElement.removeChild(d);}.bind(this));
}
document.addEventListener('click',clickEffect);
</script>
</head>
<body>
	       <div id = 'subject' >주문하기</div>
<div id='JstoreSelect'>
	
	<div id= 'Jstore_list'>
	        <div id = 'sub'>매장찾기</div>
			
		<form name='frm_Jstore' method='post' id='frm_Jstore' action="JstoreSelect">
	             
	            
				<select class='mapFind' id='mapFindStr' name='mapFindStr' onchange='cityFindChange(this)'>
				
				<option value=''>선택해주세요</option>
				<option value='서울'>서울</option>
				<option value='경기'>경기</option>
				<option value='인천'>인천</option>
				</select>
				
				<select class='mapFindcity' id='storeFindStr' name='storeFindStr' onchange='mapFindChange(this)' >
				<option value=''>선택해주세요</option>
				
				</select>
				<input type='text' id='findStore' name='findStore' value="${consumerpage.findStore }"/>
				<button type='submit' id='storeListBtn' action="storeList(this.form);">매장찾기</button>
				<input type='hidden' name='nowPage' value='${consumerpage.nowPage }'/>
				
				<input type="hidden" name="ioginId" id="ioginId" value="${sessionScope.id }" >
		</form>
	</div>
	
		
		 						
	
	<div id='wrap'>
		
			
		</div>
		<div id = 'itemsWrap'>
			<c:set var='num' value='${consumerpage.startNo}' />
			<c:forEach var='v' items='${storeSelectlist}'>
		       <div id='items' class='items'onclick="">
			        <div class='no'     >${num }</div>
					<div class='storeName'>${v.storeName} ${num }호점</div>
					<div class='storeaddress'  >${v.address } </div>
					<div class='genstorecall' >${v.phone} </div>
					<div id='btns'>
					<a href='writeBtn'><button type='button' class='checkReviewBtn'>리뷰보기</button></a>
					<a href='orderBtn'><button type='button' class='orderBtn'>주문하기</button></a>
					</div>
			 	</div>
				
		<hr/>
		<c:set var='num' value='${num=num+1 }'/>
		</c:forEach>
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
	
</div>

</body>
<script src="/js/JstoreSelect.js"></script>
<script>
</script>
</html>