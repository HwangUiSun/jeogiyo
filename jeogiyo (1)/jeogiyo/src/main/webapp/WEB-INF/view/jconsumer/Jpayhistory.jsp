<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/Jpayhistory.css" rel="stylesheet">
<script src="/js/Jpayhistory.js"></script>
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
	   <div id='payInfo'>
	        <div class='sub'>결제정보</div>
	         
	        <br/><h2><label>수령인정보</label></h2><br/>
	  </div>
	        
	        <div class="fieldlabel"><label>이름</label></div>
	        <input type='text' class='name'/><br/>
	        
	        <div class="fieldlabel"><label>연락처</label></div>
	        <input type='text' class='phone'/><br/>
	        
		    <div class="fieldlabel"><label>우편번호</label></div>
		    <input type='text' id='zipcode' size='12'>
		    
		   	<button type='button' id='btnZipFind'>주소변경</button>
			<br/>
    
	       <div class="fieldlabel"><label>주소</label></div>
	        <input type='text' id='address'/>
	        <br/>
	        	       
	        <div class="fieldlabel"><label>상세주소</label></div>
	        <input type='text' id='apiAddressDetail'/><br/>
	        
	        <div class="fieldlabel"><label>요청사항</label></div>
	        <input type='text' class='request'/>
	  
	   
	   <div id='priceInfo'>
	        <div class='sub'>주문내역</div>
	       <span class = 'foodImg'><img src='../img/chicken1.png'width='240px' height='240px'/></span>
	     
	       <span class = 'foodInfo'>발사믹치킨</span>
	       <span class = 'ea'>1개</span>
	       <span class = ' menuEaPrice'>18500원</span><br/>
	       <img src='../img/line.png'width='600px' height='20px'/><br/>
	       <span class = 'menuPrice'>총 결제금액 18500원</span><br/>
	   </div>
	   
	   <form action="/status">
	     <label class='paySelect'>결제방법
		       <br/>
		         <input type='radio' name='radioSelect' id='meetPayBtn' value='1'/>만나서 결제
		         <input type='radio' name='radioSelect' id='cardPayBtn' value='2' />카드 결제
		       <br/>
         </label>	
	   </form>
	   
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
	         <span class = 'menuprice'>18500원</span>
	          <span>+</span>
	         <span class = 'riderPrice'>2000원</span>
	         <span>=</span>
	         <span class = 'totalPrice'>2000원</span> 
	         </div>
	   </div>
	   
	   <div id='Btns'>
	        <hr/>
	        <a href='payBtn'><button type='button' class='payBtn'>결제</button></a>
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
</script>

<script>
$("input[type=radio]").click(function(){
	$(this).prop("checked", true);
	$("form").submit();
})

String radioSelect[] = request.getParameterValues("radioSelect");
// X

</script>
</html>