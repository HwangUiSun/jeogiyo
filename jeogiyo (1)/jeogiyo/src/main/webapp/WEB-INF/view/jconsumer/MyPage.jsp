<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
<link rel = 'stylesheet' type='text/css' href = 'css/MyPage.css'>
<!-- <script src = './js/consumer.js'></script> -->
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
<div id = 'subject'>내정보 </div>
<div id='MyPage'>
 
  <form action='' name='frm_MyPage' method='post' id='frm_MyPage'>
  
    <label>아이디</label>
    <input type='text' name='mid' id='mid' value='${mid }' readonly size='15'><br/>
    
    <label>성명</label>
    <input type='text' name='name' id='name'value='${name }'size='12'><br/>
    
    <label>연락처</label>
    <input type='text' name='phone' id='phone' value='${phone }' size='12'><br/>
    
    <label>우편번호</label>
    <input type='text' id='zipcode'  name='zipcode' value='${zipcode }' size='12'>
    
    <button type='button' id='btnZipFind'>우편번호 검색</button>
    <br/>
    
    <label>주소</label>
    <input type='text' id='address'  name='address' value='${address }'size='40'/><br/>
    
    <label>이메일</label>
    <input type='text' name='email' name='email' value='${email }' size='30'><br/>
    <br/>
    
   <label>사용가능 포인트</label>
   <input type='text' class='usePoint' value='2000p' readonly/>
   <br/>
   <label>소멸예정 포인트</label>
    <input type='text' class='havePoint' value='2000p' readonly/>
    <br/>
    <br/>
  
  <label></label>
  <button type='button' id='change_1Btn'onclick='change_1Btn2();'>수정하기</button>
  <a href='joinOutBtn'><button type='button' id='joinOutBtn' onclick='joinOutBtn()'>회원탈퇴</button></a>
  <input type='hidden' name='findStr' value='${param.findStr}'/>
  <input type='hidden' name='nowPage' value='${param.nowPage}'/>
  </form>
</div>

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
            
                document.getElementById("zipcode").value = data.zonecode;
                document.getElementById("address").value = addr;
                
                document.getElementById("detailAddress").focus(); //상세입력 포커싱
            }
        }).open();
    });
}
    function change_1Btn2(){
		console.log("1");
		var form = document.frm_MyPage;
		console.log("2");
	
		
		console.log(form);
		form.action = 'change_1Btn';
		form.submit(); 
	} 
</script>

<script>
  function joinOutBtn(){
		var returnValue = prompt('정말 탈퇴하시겠습니까?','비밀번호를 입력해 주세요');
	}
  

</script>
</body>
</html>