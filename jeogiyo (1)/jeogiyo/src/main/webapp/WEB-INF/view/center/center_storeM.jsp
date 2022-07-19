<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>center_storeM</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<link rel='stylesheet' type='text/css' href='/css/center_storeM.css'>
<script src="/js/center_storeM.js"></script>
</head>
<body>
	<div id='subject'>가맹관리</div>
	<button type='button' id='go_storeDropBtn'
		onclick="location.href='center_storeDrop'">탈퇴신청 현황</button>
	<a href='storeCenter'>Home</a>
	<div id='center_storeM'>
		<input type="hidden" id="selectLocal" value="${selectLocal}">
		<c:forEach var="local" items="${localList}" >
			<div class="select_local" onclick="center_storeM.clickLocal('${local}')">${local}</div>
		</c:forEach>
		<br /><br /><br /><br /><hr />
		<c:forEach var='store' items="${storeList}">
			<div class='storeName'>
				${store.storeName}<br />1호점
			</div>
			<div class='storeAddressPhone'>
				<label>주소</label> <span>${store.address}</span> <br />
				<br /> <label>연락처</label> <span>${store.phone}</span>
			</div>
			<div class='store_view' onclick="location.href='center_storeMview'"></div>
			<br /><br /><hr />
		</c:forEach>

		<div id='paging'>
			<c:if test="${page.startPage>1}">
				<button type='button' onclick='center_storeM.movePage(1)'>맨처음</button>
				<button type='button' onclick='center_storeM.movePage(${page.startPage-1})'>&lt</button>
			</c:if>

			<c:forEach var='i' begin='${page.startPage}' end='${page.endPage}'>
				<button type='button' onclick='center_storeM.movePage(${i})'>${i}</button>
			</c:forEach>
			<c:if test="${page.endPage<page.totPage}">
				<button type='button' onclick='center_storeM.movePage(${page.endPage+1})'>&gt</button>
				<button type='button' onclick='center_storeM.movePage(${page.totPage})'>맨끝</button>
			</c:if>
		</div>
	</div>
</body>
</html>