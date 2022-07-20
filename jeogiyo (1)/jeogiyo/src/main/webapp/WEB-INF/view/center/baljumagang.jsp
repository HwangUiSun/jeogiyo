<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>발주 관리</title>
<link href="./css/baljuM.css" rel="stylesheet">
</head>
<body>
	<div class="wrap">
	<div id='left'>
		<form name="balju_frm" id ="baljuM" method="post" action="">
			<p><input type="text" name="category" id="category"></p>
			<p><input type="text" name="productName" id="productName"></p>			
			<div>
			<button type="submit" id="add" value="add">추가</button>
			<button type="submit" id="add" value="sub">삭제</button>
			</div>
		</form>
	</div>
	<div id="right">
		<div id="baljuList">
		</div>
	</div>
	
	</div>
</body>
</html>