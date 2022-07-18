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
<form action="doJoin" method="POST" class="joinForm" onsubmit="DoJoinForm__submit(this); return false;">
                                                                                               
      <h2>비밀번호찾기</h2>
      
      
      <div class="textForm">
        <input name="name" type="password" class="mId" placeholder="아이디">
      </div>
       <div class="textForm">
        <input name="email" type="text" class="email" placeholder="이메일">
      </div>
      
      </div>
      <input type="submit" class="findPwdBtn" value="비밀번호찾기"/>
    </form>
    </body>
</html>