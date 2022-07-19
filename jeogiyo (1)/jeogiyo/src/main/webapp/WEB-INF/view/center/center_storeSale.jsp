<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_storeSale</title>
<link rel='stylesheet' type='text/css' href='/css/center_storeSale.css'>
</head>
<body>
<div id='subject'>
	지역별 매출 현황
</div>
<a href='storeCenter'>Home</a>

<div id='sale_find'>
	매출 조회
</div>
<form method='post' name='frm_center_storeSale'>
	<div id='sale_date'>	
		<input type='date' name='date1'>~
		<input type='date' name='date2'>
		<button type='button' name='btndata' onclick='findSale(this.form)'>조회</button>
	</div>
	
	<div id ='sale_section'>
		<select name='address' size='4' multiple>
			<option value=''>전지역</option>
			<option value='서울'>서울</option>
			<option value='인천'>인천</option>
			<option value='경기'>경기</option>
		</select>
	</div>
</form>
	
<div id='sale_doc'>
	<textarea rows="15" cols="40">
		설정 기간 별 매출 현황
	 	총 배달 건수
	</textarea>
</div>

<div id='top_list'>
	<div id= 'top_title'>
		<h1>매출 TOP3 가맹점</h1>
	</div>
	
	<div id='top1'>
		<h1>
			★1위 가맹점★</br>
			서울대 입구 1호점
		</h1>
		<br/><br/>
		매출액 XX,XXX,XXX원
	</div>
	
	<div id='top2'>
		<h2>
			★2위 가맹점★</br>
			서울대 입구 2호점
		</h2>
		<br/><br/>
		매출액 XX,XXX,XXX원
	</div>
	
	<div id='top3'>
		<h3>
			★3위 가맹점★</br>
			서울대 입구 3호점
		</h3>
		<br/><br/>
		매출액 XX,XXX,XXX원
	</div>
</div>
<script src='./js/center_storeSale.js'></script>
</body>
</html>