<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = 'stylesheet' type='text/css' href = 'css/Jmain.css'>
</head>
<body>
<form id='mai' name='mai'onclick='main();'>
 <img src='../img/mai.png'/>

</form>
</body>
<script>
function main(){
	console.log("1");
	var form = document.mai;
	console.log("2");

	
	console.log(form);
	form.action = 'JstoreSelect';
	
	form.submit(); 
} 

</script>
</html>