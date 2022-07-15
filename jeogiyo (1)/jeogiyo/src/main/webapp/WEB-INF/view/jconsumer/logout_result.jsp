<%@page import="com.jpro.jconsumer.JConsumerService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
JConsumerService dao = new JConsumerService();
	//String msg = dao.logout(request);
%>
<script>
	//alert('');
	location.href = '../index.jsp';
</script>
</body>
</html>