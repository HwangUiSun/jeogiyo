<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upload</title>

<link rel = 'stylesheet' type='text/css' href = 'css/upload.css'>

<!-- summernote를 위한 라이브러리 -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>

<script src="./js/upload.js"></script>
</head>


<body>
<div id = 'subject'>리뷰작성</div>
<div id='upload'>
  <div id='uploadReview'>
  </div>
  <form name='upload' class='upload' id='upload'>
    <label>제목</label>
    <input type='text' name='subject' id="subjects" value="${subject }" size='14'/>
    <br>
  
    <label>아이디</label>
    <input type='text' name='id' id="mid" size='14'value = '${mid }' readonly/>
    <br>
  
    <label>날짜</label>
    <input type='text' id='nal' name = 'nal' value ='${ordertime}'/>
    <br>
  
    <label></label>
    <textarea name = 'doc' id='summernote'>${doc }</textarea>
   <br>
   
  	
    
    <input type="hidden" id="sno" name="sno" value="${sno}">
	<input type="hidden" id="nowPage" name="nowPage" value="${reviewpage.nowPage}" >
	<input type="hidden" id="findStr" name="findStr" value="${reviewpage.findStr}" >
	<input type="hidden" id="ioginId" name="ioginId" id="ioginId" value="${sessionScope.id }" >
  </form>
  <div class='btns'>
    <input type='button' id='write'onclick='writereview()'value='작성'>
    <input type='button' id='writeback' value='돌아가기' onclick='back()'/>
   </div>
</div>
<script>
upload.init()
</script>

</body>
</html>