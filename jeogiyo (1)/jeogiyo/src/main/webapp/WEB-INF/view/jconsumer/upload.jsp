<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upload</title>
<script src="./js/upload.js"></script>
<link rel = 'stylesheet' type='text/css' href = 'css/upload.css'>
<!-- summernote를 위한 라이브러리 -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>


</head>


<body>
<div id = 'subject'>리뷰작성</div>
<div id='upload'>
  <div id='uploadReview'>
  </div>
  <form name='upload' class='upload' method='post'>
    <label>제목</label>
    <input type='text' name='subject' value="${subject }" size='14'/>
    <br>
  
    <label>아이디</label>
    <input type='text' name='id' size='14'value = '${mid }' readonly/>
    <br>
  
    <label>날짜</label>
    <input type='text' id='nal' name = 'nal' value ='${nal }'/>
    <br>
  
    <label>내용</label>
    <textarea name = 'doc' id='summernote'>${doc }</textarea>
   <br>
   
  <div class='btns'>
    <a href='writeBtn'><button type='button' id='writeBtn' onclick='write(this.form);'>확인</button></a>
    <a href='backBtn'><button type='button' id='backBtn' >돌아가기</button></a>
    </div>
    
    <input type="hidden" name="sno" value="${vo.sno }">
	<input type="hidden" name="nowPage" value="${notipage.nowPage}" >
	<input type="hidden" name="findStr" value="${notipage.findStr}" >
	<input type="hidden" name="ioginId" id="ioginId" value="${sessionScope.id }" >
  </form>
</div>
<script>
upload.init();
</script>

</body>
</html>