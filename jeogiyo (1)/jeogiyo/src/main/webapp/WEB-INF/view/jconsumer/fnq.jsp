<%@ taglib prefix = 'c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FAQ</title>
</head>
<body>

<h1>FAQ</h1>
<div id = 'question'>자주하는 질문</div>
<c:forEach var = 'status' begin = '1' end = '5'>
	<div id = 'FAQList'>
		  <div class = 'info'>
	        <div class = 'list'>내용</div>
	      </div>
	      
	   <input type="button" value="내용 접기" onclick=	
		   "var target=document.querySelector('#data');
		   if(this.value=='내용 접기'){
	         target.style.display='none';
	          this.value='내용 펼치기';
	          }else{
	            target.style.display='block';
	            this.value='내용 접기';
	            }
		   ">
	   
	   <p id="data">설명</p>
		  
	    </div>
	<hr/>
</c:forEach>
</body>

<script>
document.querySelector('#data')

</script>
</html>