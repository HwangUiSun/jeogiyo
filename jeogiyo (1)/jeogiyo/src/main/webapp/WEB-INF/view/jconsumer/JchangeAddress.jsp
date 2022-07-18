<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id='JchageAddress'>
     <div class='subject'>주소변경</div>
          <div class='sub'>
          <input type='text' value='내용을 입력해주세요'/>
          <button type='button' id='addApiBtn'>추가</button>
           <a href='backPayBtn'>  <button type='button' id='backPayBtn'>취소</button></a><br/>
          </div>
    <br>
    <div id="wrap">
	
	<div class="title">
		<span>No.</span>
		<span>주소</span>
		
	</div>
	<c:forEach var = 'status' begin = '1' end = '5'>
		<div id = 'itemsWrap'>
		       <div class='items'>
			        <span class='no'     >${num+1 }</span>
					<span class='address'  name='address' id='address'   >경기 성남시 분당구 대왕판교로 477 (낙생고등학교)</span>
					
			 </div>
			</div>
		
		<hr/>
		<c:set var='num' value='${num=num+1 }'/>
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
	<form name="frm_consumer" method="post">
		<input type="hidden" name="nowPage" value="${page.nowPage}">
	</form>	
</div>
          
</div>
</body>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
window.onload = function(){
    document.getElementById("addApiBtn").addEventListener("click", function(){ //주소입력칸을 클릭하면
        //카카오 지도 발생
        new daum.Postcode({
            oncomplete: function(data) { //선택시 입력값 세팅
                document.getElementById("address").value = data.address; // 주소 넣기
                document.querySelector("input[name=address]").focus(); //상세입력 포커싱
            }
        }).open();
    });
}
</script>
</html>