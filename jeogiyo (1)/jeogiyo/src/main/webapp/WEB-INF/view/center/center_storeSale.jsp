<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_storeSale</title>
</head>
<body>
center_storeSale
<a href='storeCenter'>Home</a>
<h1> 지역별 매출 현황</h1>
	<div id ='Sale_date'>
		<div class='sale'>매출 조회</div>
		<select name='address' size='3' multiple>
			<option value='whole_area'>전지역</option>
			<option value='Seoul'>서울</option>
			<option value='incheon'>인천</option>
			<option value='gyeong-gido'>경기도</option>
		</select>
	</div>
		
		<input type='date' name='data1'>~
		<input type='date' name='date2'>
		<button type='button' name='btndata'>조회</button>
		
	<div id='storeSale_tot'>
		<textarea rows="15" cols="40">
<h1>설정 기간 별 매출 현황</br>
 총 배달 건수</h1>
		</textarea>
	</div>

<div id='top_list'>

	<div id= 'top'>
		<h1>매출 TOP3 가맹점</h1>
	</div>
	
	<div id='top1'>
		<h1>★1위 가맹점★</br>
		서울대 입구 1호점
		</h1>
	매출액 XX,XXX,XXX원
	</div>
	
	<div id='top2'>
		<h2>★2위 가맹점★</br>
		서울대 입구 2호점
		</h2>
	매출액 XX,XXX,XXX원
	</div>
	
	<div id='top3'>
		<h3>★3위 가맹점★</br>
		서울대 입구 3호점
		</h3>
	매출액 XX,XXX,XXX원
	</div>
</div>


<button type='button' name='run'>되돌아가기</button>

</body>
</html>