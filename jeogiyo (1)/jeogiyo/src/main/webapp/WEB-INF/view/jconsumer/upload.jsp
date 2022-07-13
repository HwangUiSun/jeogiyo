<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upload</title>
</head>
<script>
var today = new Date();

var year = today.getFullYear(); // 년도
var month = today.getMonth() + 1;  // 월
var date = today.getDate();  // 날짜
var day = today.getDay();  // 요일

var dateString = year + '-' + month + '-' + day;
</script>

<body>
<h1>리뷰작성</h1>

<div>
  <label>제목</label>
  <input type='text' name='subject' size='14'/>
  <br>
  
  <label>아이디</label>
  <input type='text' name='name' size='14'/>
  <br>
  
  <label>날짜</label>
  <input type='date' id='today'/>
  <br>
  
  <label>내용</label>
  <input type='text' name='doc'/>
  <br>
  
  <button type='button' id='writeBtn'>리뷰 작성</button>
  <button type='button' id='backBtn'>돌아가기</button>
</div>

<script>
var todayDate = document.getElemenetById("today");
</script>
</body>
</html>