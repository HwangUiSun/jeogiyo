<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
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
<div id='container2'>
	<div id='sale_find'>
		매출 조회
	</div>
	<form method='post' name='frm_center_storeSale'>
	
		<div id='sale_date'>	
			<input type='date' name='date1' value='${date1 }'>~
			<input type='date' name='date2' value='${date2 }'>
			<button type='button' name='btndata' onclick='findSale(this.form)'>조회</button>
		</div>
		
		<div id ='sale_section'>
			<select name='address' size='4' multiple>
				<option value='전지역'>전지역</option>
				<option value='서울'>서울</option>
				<option value='인천'>인천</option>
				<option value='경기'>경기</option>
			</select>
		</div>
	</form>
		
	<div id='sale_doc'>
			<h3>${date1} ~ ${date2}<br/>
			${address} 매출 현황</h3> ${totSale } 원<br/>
			<h3>총 판매 건수 </h3> ${totHit } 건
	</div>
</div>

<div id='top_list'>
	<div id= 'top_title'>
		<h1>매출 TOP3 가맹점</h1>
	</div>
	
	<div id='top1'>
		<h1>
			★1위 가맹점★<br/><br/>
			${list[0].storeName}<br/>
			${list[0].harutotal} 원
		</h1>
		<br/><br/>
	</div>
		
	
	<div id='top2'>
		<h2>
			★2위 가맹점★<br/><br/>
			${list[1].storeName}<br/>
			${list[1].harutotal} 원
		</h2>
		<br/><br/>
	</div>
	
	<div id='top3'>
		<h3>
			★3위 가맹점★<br/><br/>
			${list[2].storeName}<br/>
			${list[2].harutotal} 원
		</h3>
		<br/><br/>
	</div>
</div>
<script src='./js/center_storeSale.js'></script>
</body>
</html>