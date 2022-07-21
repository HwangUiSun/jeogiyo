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
<div id = 'subject'>주문 내역</div>

<div id='wrap'>
		<form name='frm_JorderList' method='post' id='frm_JorderList' action="JorderList">
		<div id = 'itemsWrap'>
			<c:set var='num' value='${consumerpage.startNo}' />
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