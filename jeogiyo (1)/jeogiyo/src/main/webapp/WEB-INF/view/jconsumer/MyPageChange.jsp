<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPageChange</title>
<link rel = 'stylesheet' type='text/css' href = 'css/MyPageChange.css'>
</head>
<body>
<h1>내 정보 수정</h1>

<div id='MyPageChange'>
  <div id='main'>
    <label>아이디</label>
    <input type='text' name='id' size='14' readonly/>
    <br>
    
    <label>비밀번호</label>
    <input type='password' name='pwd' size='14'/>
    <br>
    
    <label>성명</label>
    <input type='text' name='name' size='14'/>
    <br>
    
    <label>이메일</label>
    <input type='text' name='email' size='14'/>
    <br>
    
    <label>연락처</label>
    <input type='text' name='phone' size='14'/>
    <br>
    
    <label>우편번호</label>
    <input type='text' id='zipcode'  size='12'>
    
    <button type='button' id='btnZipFind'>우편번호 검색</button>
    <br/>
    
    <label>주소</label>
    <input type='text' id='address' size='40'/><br/>
    
    <label>상세주소</label>
    <input type='text' id='apiAddressDetail' size='40'/>
    <br>
    <!-- css 접근을 위해 버튼 id 생성 -->
    <a href='change_2Btn'><button type='button' name='change_2Btn' id='change_2Btn'>수정</button></a>
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
    });
}
</script>
</html>