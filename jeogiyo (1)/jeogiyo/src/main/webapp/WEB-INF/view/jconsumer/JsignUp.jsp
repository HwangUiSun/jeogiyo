<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='./css/member.css'>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</head>
<body>
<div id='JsignUp'>
  <h1>회원가입</h1>
  <form name='frm_member' method='post' id='frm_member'>
    <label>아이디</label>
    <input type='text' name='id' size='15'><br/>
    
    <label>성명</label>
    <input type='text' name='mName' size='12'><br/>
    
    
    <label>비밀번호</label>
    <input type='password' name='pwd' maxlength='10' autocomplete="none"><br/>
    
    <label>연락처</label>
    <input type='text' name='phone' size='12'><br/>
    
    <label>우편번호</label>
    <input type='text' name='zipcode'  size='12'>
    <button type='button' id='btnZipFind'>우편번호 검색</button>
    <br/>
    
    <label>주소</label>
    <input type='text' name='address' size='40' autocomplete="none"><br/>
    
    <label>이메일</label>
    <input type='text' name='email' size='30'><br/>
    <br/>
  
  <label></label>
  <a href ='signUpBtn'><button type='button' id='signUpBtn'>가입완료</button></a>
  
  <input type='hidden' name='findStr' value='${param.findStr}'/>
  <input type='hidden' name='nowPage' value='${param.nowPage}'/>
  </form>
<script src='js/member.js'></script>
</div>
</body>
</html>