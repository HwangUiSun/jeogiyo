<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage</title>
<link rel = 'stylesheet' type='text/css' href = './css/consumer.css'>
<script src = './js/consumer.js'></script>
</head>
<body>
<div id='MyPage'>
  <h1>내정보</h1>
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
    
   <label>사용가능 포인트</label>
   <input type='text' class='usePoint' value='2000p' readonly/>
   <br/>
   <label>소멸예정 포인트</label>
    <input type='text' class='havePoint' value='2000p' readonly/>
    <br/>
  
  <label></label>
  <a href ='change_1Btn'><button type='button' id='change_1Btn'>수정완료</button></a>
  <a href='joinOutBtn'><button type='button' id='joinOutBtn()'>회원탈퇴</button></a>
  <input type='hidden' name='findStr' value='${param.findStr}'/>
  <input type='hidden' name='nowPage' value='${param.nowPage}'/>
  </form>
<script src='js/member.js'></script>
</div>

<script>
  function joinOutBtn(){
		var returnValue = prompt('정말 탈퇴하시겠습니까?','비밀번호를 입력해 주세요');
	}

</script>
</body>
</html>