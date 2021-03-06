<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noti_view</title>
<script src="./js/noti_view.js"></script>
<link href="./css/noti_view.css" rel="stylesheet">

<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
</head>
<body>
<div id = 'noti_view'>
	<div id='subject'>공지사항 상세보기</div>
	<form name = 'frm_noti_view' class = 'frm_noti_view' method = 'post'>
		<label>제목</label>
		<input type = 'text' name = 'subject' value="${vo.subject }" readonly><br/>
		<label>작성자</label>
		<input type = 'text' name = 'mid' value = '${vo.mid }' readonly><br/>
		<label>날짜</label>
		<input type = 'text' name = 'nal' id="noti_nal" value ='${vo.nal }' readonly><br/>
		<label id="doctext">내용</label>
		<textarea name = 'doc' class="doc" id="summernote">${vo.doc }</textarea>
	
	<div class = 'btns'>
			
		<div id="backbox">
			<button type = 'button' value = 'btn_back' name = 'back' onclick="noti_view_back(this.form)">돌아가기</button>
		</div>
		<div id="upade">
			<button type = 'button' value = 'btn_input' name = 'update' id="input" onclick="noti_view_updateview(this.form)">수정</button>
			<button type = 'button' value = 'btn_delete' name = 'delete' id="delete" onclick="noti_view_delete(this.form)">삭제</button>
		</div>	
	</div>
	
	<input type="hidden" name="sno" value="${vo.sno }">
	<input type="hidden" name="nowPage" value="${notipage.nowPage}" >
	<input type="hidden" name="findStr" value="${notipage.findStr}" >
	<input type="hidden" name="ioginId" id="ioginId" value="${sessionScope.id }" >
	
	
	</form>
</div>
<script>
noti_view.init();
</script>
</body>
</html>

