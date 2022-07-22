<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<form name="balju_frm" id ="baljuM" method="post" action="addsub">
				<p><input type="hidden" name="selectSno" value="" id="selectSno"></p>
				<p><label><span>제품이름</span><input type="text" name="productName" id="product"></label></p>			
				<div>			
				<button type="submit" name="addsub" id="add" value="add" >추가</button>
				<button type="submit" name="addsub" id="sub" value="sub" >삭제</button>			
				</div>
			</form>
		</div>
		<div id="right">
			<div id="baljuList">
			<c:set var='num' value='1'/>
			<c:forEach var='v' items='${JbaljuManage}'>
				<div class='items' onclick="sub('${v.productName}','${v.sno}','${num}')">			
					<span >${num}</span>
					<span>${v.productName}</span>
					<c:if test="${v.status =='true'}">
					<span>발주 가능</span>
					<button type="submit" class="imposible" value="imposible" onclick ="status(false,'${v.sno}')">발주 불가능으로 변경하기</button>
					</c:if>	
					<c:if test="${v.status =='false'}">
					<span>발주 불가능</span>
					<button type="submit" class="posible" value="posible" onclick ="status(true,'${v.sno}')">발주 가능으로 변경하기</button>
					</c:if>	
					<input type="hidden" name="sno" value='${v.sno}'>									
				</div>
			<c:set var='num' value='${num=num+1 }'/>
			</c:forEach> 
			</div>
		</div>	
	</div>
	<div>${str}</div>
	<script src="js/baljuM.js"></script>
</body>
</html>