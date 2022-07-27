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
		<div id='frm_JorderList'>
		<div id = 'itemsWrap'>
			
			<c:forEach var='v' items='${orderlist}'>
		       <div id='items'class='items'onclick="">
			      
					<span class='ordertime'>${v.ordertime}</span>
					<div class='info'>
					
					<div class = 'amount'>총 금액 ${v.totalprice}원</div>
					<div class = 'method'>${v.howtopay}</div>
					<div class = 'menu'>${v.ordermenu}</div>
					<div class = 'address'>${v.address} </div>										
					</div>
				
					<form name='frm_items${v.sno}' method='post'  action="reviewBtn">
					<button type = 'submit' class='reviewBtn'name = 'reviewBtn'>리뷰쓰기</button>
					<input type="hidden" value ="${v.sno}" name="sno" >
					</form>
			 	</div>
				<hr/>
		
		</c:forEach>
		  </div>
		</div>
		
		
				
		
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