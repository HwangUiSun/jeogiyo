<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/JfindId.css">
</head>
<body>
<form action="doJoin" method="POST" class="joinForm" 
        id='frm_findid' name='frm_findid'>
                                                                                               
      <h2>아이디찾기</h2>
      
      
      <div class="textForm">
        <input name="name" type="password" class="mName" placeholder="이름">
      </div>
       <div class="textForm">
        <input name="email" type="text" class="email" placeholder="이메일">
      </div>
      
      </div>
      <input type="button" id='findIdBtn' class="findIdBtn" value="아이디찾기"/>
    </form>
    </body>
  <script src="/js/Jlogin.js"></script>
</html>