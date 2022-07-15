<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인/아웃</title>
</head>
<body>
<form name= 'frm_login_out' method='post'>
	<%
	  //session.setAttribute("mId", "춘향이");
	    //session.setAttribute("mId", null);//session은 값을 설정하는것이다.
		String mId = (String)session.getAttribute("mId");

	  if(mId == null){
	%>
    <button type = 'button' id = 'btnLogin'>로그인</button>
	<%
	  }else{
	%>
	<output class = 'login_info'> 
     [<%=mId %>]님 환영합니다.
	</output>
    <button type = 'button' id = 'btnLogout'>로그아웃</button>
	<%
	  }
	%>
</form>
<script src = './js/member.js'></script>
</body>
</html>