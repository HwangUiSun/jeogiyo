<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_notiInput</title>
<script src = './js/center_notiInput.js'></script>
<link rel = 'stylesheet' href = './css/center_notiInput.css'>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
</head>
<body>
<div id = 'center_notiInput'>
	<div id='subject'>공지사항 작성</div>
	<form name = 'frm_center_notiInput' class = 'frm_center_notiInput' method = 'post'>
		<label>제목</label>
		<input type = 'text' name = 'subject' value='${vo.subject}'><br/>
		<label>작성자</label>
		<input type = 'text' name = 'mid' id="mid" readonly value='root'><br/>
		<label>날짜</label>
		<input type = 'date' name = 'nal' id="noti_nal" value=""><br/>
		<label>내용</label>
		<textarea name = 'doc' id = 'summernote' >${vo.doc}</textarea>
		
	<div class = 'btns'>
		
		<button type = 'button' name = 'input' id="input" onclick = 'center_notiInput.input(this.form)'>작성</button>
		<button type = 'button' name = 'update' id="update" onclick = 'center_notiInput.update(this.form)'>수정</button>
		<button type = 'button' name = 'back' onclick = 'center_notiInput.back(this.form)'>돌아가기</button>
		
	</div>
	
		<input type="hidden" name="sno" value="${vo.sno}">
		<input type="hidden" name="nowPage" value="${notipage.nowPage}" >
		<input type="hidden" name="findStr" value="${notipage.findStr}" >
		<input type="hidden" name="ioginId" id="ioginId" value="${sessionScope.id }" >
	</form>
</div>
<script>
center_notiInput.init();
</script>
</body>
</html>
