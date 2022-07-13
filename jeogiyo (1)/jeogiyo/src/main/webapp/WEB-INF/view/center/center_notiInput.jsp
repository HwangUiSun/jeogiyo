<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_notiInput</title>
<script src = './js/center.js'></script>
<link rel = 'stylesheet' href = './css/center.css'>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
</head>
<body>
<div id = 'center'>
	<div id='subject'>공지사항 작성</div>
	<form name = 'frm_input' class = 'frm_input' method = 'post'>
		<label>제목</label>
		<input type = 'text' name = 'subject'><br/>
		<label>작성자</label>
		<input type = 'text' name = 'mid' value = '본사' readonly><br/>
		<label>날짜</label>
		<input type = 'date' name = 'nal'><br/>
		<label>내용</label>
		<textarea name = 'doc' id = 'summernote'></textarea>
	</form>
	<div class = 'btns'>
		<button type = 'button' value = 'btn_input' name = 'input'>작성</button>
		<button type = 'button' value = 'btn_back' name = 'back'>돌아가기</button>
	</div>
</div>
<!-- 
	<a href='center_noti'>작성</a>
	<a href='center_noti'>돌아가기</a>
 -->
<script>
center.init();
</script>
</body>
</html>
