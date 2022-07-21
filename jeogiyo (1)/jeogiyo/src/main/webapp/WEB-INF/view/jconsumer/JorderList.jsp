<%@ taglib prefix = 'c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>JorderList</title>
<link rel = 'stylesheet' type='text/css' href = 'css/JorderList.css'>
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
<div id='JorderList'>
<div id = 'subject'>주문 내역</div>

<div id='wrap'>
		<form name='frm_JorderList' method='post' id='frm_JorderList' action="JorderList">
		<div id = 'itemsWrap'>
			
			<c:forEach var='v' items='${orderlist}'>
		       <div class='items'onclick="">
			      
					<span class='ordertime'>${v.ordertime}</span>
					<span class='totalprice'  >총금액  ${v.totalprice}원 ${v.howtopay}<br/>${v.ordermenu}<br/>${v.address} </span>					
					<a href='reviewBtn'><button type = 'button' name = 'reviewBtn'>리뷰 작성</button></a>
			 	</div>
				
		<hr/>
		
		</c:forEach>
		  </div>
		</form>
		
		
				
		
		<div class= 'paging'>	
	
	<c:if test="${orderlistpage.startPage>1}">
		<button type= 'button' class= 'btnFirst' onclick='movePage(1)'>맨처음</button>
		<button type= 'button' class= 'btnPrev' onclick='movePage(${orderlistpage.startPage-1})'>이전</button>
	</c:if>
		

		<c:forEach var='i' begin='${orderlistpage.startPage}' end='${orderlistpage.endPage}'>
		<button type= 'button' class= 'first' onclick ='movePage(${i})'>${i}</button>
		</c:forEach>

		<c:if test ="${orderlistpage.endPage<orderlistpage.totPage}">
		<button type= 'button' class= 'btnNext' onclick = 'movePage(${orderlistpage.endPage+1})'>다음</button>
		<button type= 'button' class= 'btnLast' onclick = 'movePage(${orderlistpage.totPage})'>맨끝</button>
		</c:if>
		
	</div>
	</div>
	<form name="frm_Jorder" method="post">
		<input type="hidden" name="nowPage" value="${orderlistpage.nowPage}">
	</form>
	</div>
     
</body>
<script src="/js/Jorderlist.js"></script>
</html>