<%@ taglib prefix ='c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/Jpayhistory.css" rel="stylesheet">
<!-- <script src="/js/Jpayhistory.js"></script> -->
<title>Jpayhistory</title>
<link rel = 'stylesheet' type='text/css' href = 'css/Jpayhistory.css'>
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

	<div id= 'Jpayhistory_list'>
	        <div id='subject'>주문하기</div>
	   <form action='' method='post' id="frmPay" name="frmPay">
	   <input type="hidden" name="totalPrice" id='totalPrice' value="${totalPrice+3000}"/>
	   <div id='payInfo'>
	        <div class='sub'>결제정보</div>
	         
	        <br/><h2><label>수령인정보</label></h2><br/>
	  </div>
	        
	        <div class="fieldlabel"><label>이름</label></div>
	        <input type='text' class='name' /><br/>
	        
	        <div class="fieldlabel"><label>연락처</label></div>
	        <input type='text' class='phone' name="phone" id="phone"/><br/>
	        
		    <div class="fieldlabel"><label>우편번호</label></div>
		    <input type='text' id='zipcode' size='12'>
		    
		   	<button type='button' id='btnZipFind'>주소변경</button>
			<br/>
    
	       <div class="fieldlabel"><label>주소</label></div>
	        <input type='text' name='address' id='address'/>
	        <br/>
	        	       
	        <div class="fieldlabel"><label>상세주소</label></div>
	        <input type='text' id='apiAddressDetail' name='apiAddressDetail'/><br/>
	        
	        <div class="fieldlabel"><label>요청사항</label></div>
	        <input type='text' class='request'/>
	  
	   
	   <div id='priceInfo'>
	        <div class='sub'>주문내역</div>
		        <c:forEach var ="v" items="${menus}" varStatus="status">
		       		<img src='../img/chicken1.png'width='240px' height='240px'/>		     
		       		<span class = 'foodInfo'>${v}</span>
		       		<span class = 'ea'>1개</span>
		       		<span class = ' menuEaPrice'>
		       		<fmt:parseNumber var="i" value="${priceArray[status.index]}" />
		       		<fmt:formatNumber value="${i}" pattern="#,###" />원
					</span><br/>
		       		<img src='../img/line.png'width='600px' height='20px'/><br/>
		       </c:forEach>
		    </div>
	       <span class = 'menuPrice'> 총 금액 : 
	       <fmt:parseNumber var="i" value="${totalPrice}" />
		    <fmt:formatNumber value="${i}" pattern="#,###" />원</span><br/>
	  
	   
	   <!-- <form action="/status"> -->
	     <label class='paySelect'>결제방법
		       <br/>
		         <input type='radio' name='radioSelect' id='meetPayBtn' value='만나서결제'/>만나서 결제
		         <input type='radio' name='radioSelect' id='cardPayBtn' value='카드결제' />카드 결제
		       <br/>
         </label>	
	  <!--  </form> -->
	   
	   <div id='point'>
	          <div class='sub'>포인트사용</div>
	          <div class='msg'>
	        <label>보유포인트</label>
	        <input type='text' class='havePoint' value='10000p' readonly/><br/>
	         <label>포인트사용</label>
	        <input type='text' class='usePoint'/>
	        <button type='button' class='usePointBtn'>포인트 전액 사용</button><br/>
	        </div>
	   </div>
	   
	   <div id='payPrice'>
	         <div class='sub'>최종결제금액</div>
	         <div class='font'>
	         <br/><label>총 상품 금액&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
	         <label>배송 금액&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
	         <label>결제 금액&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label><br/>
	         </div>
	         
	         <div class='font2'>
	         <span class = 'menuprice'>${totalPrice}</span>
	          <span>+</span>
	         <span class = 'riderPrice'>3000원</span>
	         <span>=</span>
	         <span class = 'totalPrice'>
	         <fmt:parseNumber var="i" value="${totalPrice+3000}" />
		     <fmt:formatNumber value="${i}" pattern="#,###" />원
	         원</span> 
	         </div>
	   </div>
	   </form>
	   
	   <div id='Btns'>
	        <hr/>
	        <button type='button' class='payBtn' onclick='payBtn();'>결제</button>
	        <a href='paycancelBtn'><button type='button' class='paycancelBtn'>취소하기</button></a>
	   </div>
	</div>
</body>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
window.onload = function(){
    document.getElementById("btnZipFind").addEventListener("click", function(){ //주소입력칸을 클릭하면
        //카카오 지도 발생
        new daum.Postcode({
            oncomplete: function(data) { //선택시 입력값 세팅
            	
            var addr = '';
            
            if(data.userSelectedTyp === 'R'){
            	addr = data.roadAddress;
            }else{
            	addr = data.jibunAddress;
            }
            
                //document.getElementById("btnZipFind").value = data.zipcode; // 주소 넣기
                document.getElementById("zipcode").value = data.zonecode;
                document.getElementById("address").value = addr;
                
                document.getElementById("detailAddress").focus(); //상세입력 포커싱
            }
        }).open();
    });
}
function payBtn(){
	console.log("1");
	var form = document.frmPay;
	console.log("2");
	
	
	
	var menu = '${menus}';
	menu = menu.replace('[', '');
	menu = menu.replace(']', '');
	
	let menuInput = document.createElement('input')
	menuInput.setAttribute("name","menu")
	menuInput.setAttribute("type","hidden")
	menuInput.setAttribute("value",menu)
	
	form.appendChild(menuInput);
	
	console.log(form);
	form.action = 'payBtn';
	form.submit(); 
}
</script>

<script>
/* $("input[type=radio]").click(function(){
	$(this).prop("checked", true);
	$("form").submit();
})
 */
//String radioSelect[] = request.getParameterValues("radioSelect");
// X
/* function test(){
	let strnal = nalArray.join()
	let strtotalPrice = totalPriceArray.join()
	let strpaySelect = paySelectArray.join()
	let strMenu = menuArray.join()
	let straddress = addressArray.join()
	let form = document.createElement('form')
	form.action ="payBtn"
	form.name="jpayInfo"
	form.method="post"
	
	let strnalinput = document.createElement('input')
	strnalinput.setAttribute("name","values")
	strnalinput.setAttribute("type","hidden")
	strnalinput.setAttribute("value",strnal)
	
	let priceinput = document.createElement('input')
	priceinput.setAttribute("name","prices")
	priceinput.setAttribute("type","hidden")
	priceinput.setAttribute("value",strtotalPrice)
	
	let strpaySelect = document.createElement('input')
	strpaySelect.setAttribute("name","values")
	strpaySelect.setAttribute("type","hidden")
	strpaySelect.setAttribute("value",strpaySelect)
	
	form.appendChild(valueinput);
	form.appendChild(priceinput);
    document.body.appendChild(form);
    
    form.submit();
} */



</script>
</html>