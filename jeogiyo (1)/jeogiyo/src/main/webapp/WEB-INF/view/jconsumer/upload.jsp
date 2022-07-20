<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upload</title>

<!-- summernote를 위한 라이브러리 -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>


</head>


<body>

<div id='upload'>
  <div id='uploadReview'><h1>리뷰작성</h1></div>
  <form name='upload' class='upload' method='post'>
    <label>제목</label>
    <input type='text' name='subject' size='14'/>
    <br>
  
    <label>아이디</label>
    <input type='text' name='id' size='14' readonly/>
    <br>
  
    <label>날짜</label>
    <input type='date' id='today'/>
    <br>
  
    <label>내용</label>
    <textarea name = 'doc' id='summernote'></textarea>
   <br>
   
  <div class='btns'>
    <a href='writeBtn'><button type='button' id='writeBtn'>확인</button></a>
    <a href='backBtn'><button type='button' id='backBtn'>돌아가기</button></a>
    </div>
  </form>
</div>
<script>
upload.init();
</script>

</body>
</html>