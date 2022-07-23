<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JsignUp</title>
<link rel = 'stylesheet' type='text/css' href = 'css/JsignUp.css'>
</head>
<body>

<div id='JsignUp'>
  <h1>회원가입</h1>
  <div id='main'>
  <form name='JsignUp' method='post' id='JsignUp' name='JsignUp'>
    <label>아이디</label>
    <input type='text' name='mid' id='mid' size='15'><br/>
    
    <label>성명</label>
    <input type='text' name='name' id='name' size='12'><br/>
    
    
    <label>비밀번호</label>
    <input type='password' name='pwd' id='pwd' maxlength='10' autocomplete="none"><br/>
    
    <label>연락처</label>
    <input type='text' name='phone' id='phone' size='12'/><br/>
    
    <label>우편번호</label>
    <input type='text' name='zipcode'  id='zipcod' size='12'/>
    
    <button type='button' id='btnZipFind'>우편번호 검색</button>
    <br/>
    
    <label>주소</label>
    <input type='text' name='address' id='address' size='40'/><br/>
    
    <label>이메일</label>
    <input type='text' name='email'id='email' size='30'><br/>
    <br/>
  
  </form>
  <label></label>
   <button type='button' id='signUpBtn'onclick='signUp();'>가입완료</button> 
  
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
            
            if(data.userSelectedType === 'R'){
            	addr = data.roadAddress;
            }else{
            	addr = data.jibunAddress;
            }
            
                document.getElementById("zipcode").value = data.zonecode;
                document.getElementById("address").value = addr;
                
                document.getElementById("apiAddressDetail").focus(); //상세입력 포커싱
            }
        }).open();
    })
};

function signUp(){
	console.log("1");
	var form = document.JsignUp;
	console.log("2");

	
	console.log(form);
	form.action = 'signUpBtn';
	alert("회원가입이 완료되었습니다.");
	form.submit(); 
	
} 


</script>
</html>