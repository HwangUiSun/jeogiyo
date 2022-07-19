<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form_login.jsp</title>
<style>

</style>
</head>
<body>
<form name ='form_login' id='form_login' method='post'>
 <h1>로그인</h1>
      <label>아 이 디 </label>
      <input type='text' name='id' size='14'/>
     <br/>
     
     <label>비밀번호</label>
     <input type='password' name='pwd' size='14'/>
     <br/>
     
    <a href='loginBtn'> <input type='button' id='loginBtn' value='로그인' /></a>
     <label></label>
     <a href='findId'>아이디</a> |
     <a href='findPwd'>암호 찾기</a>
     <a href='JsignUp'>회원가입</a>

</form>

</body>
</html>