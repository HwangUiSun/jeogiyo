<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SC_login</title>
 <link rel="stylesheet" type="text/css" href="css/Jlogin.css">
 <script src="/js/Jlogin.js"></script>
</head>
<body>

<body>
    <section>
        <div class="imgBx">
           <img src="img/sea.jpg"/>
        </div>
        <div class="contentBx"> 
            <div class="formBx">
            <div class="h5flex">
                <h5 class="loginSelcete" >회원로그인</h5> 
 				
 			</div>     
	 			<div id="store" class="signins">     
	                <form name="loginFrm" method="post" id="loginFrm">                
	                    <div class="inputBx">
	                        <span>Username</span>
	                        <input type='text' name="mId" value="${param.mId}">
	                    </div>
	                    <div class="inputBx">
	                        <span>Password</span>
	                        <input type='password' name="password">
	                    </div>
	                    <div class="remember">
	                        <label><input type="checkbox" name="">Remember me</label>
	                    </div>
	                    <div class="inputBx">
	                        <label><input type="button" value="Sign in" name="loginBtn" id="loginBtn"></label>
	                    </div>
	                    <div class="inputBx">
	                        <p>Don't have a account? <a href='JsignUp'><span class="JsignUp">회원가입</span></a></p>
	                        <p>Don't remember ID?<a href='JfindId'> <span class="findStr">아이디 찾기<span></span></a></p>
	                        <p>Don't remember passwords?<a href='JfindPwd'> <span class="findStr">비밀번호 찾기<span></span></a></p>
	                    </div>
                	</form>
                </div>
           
                <h3>Welcome to another pages</h3>
                <ul class="sci">
                    <li><a><img src="img/face.png"/></a></li>
                    <li><a><img src="img/ins.png"/></a></li>
                    <li><a><img src="img/youtube.png"/></a></li>
                </ul>
            </div>
        </div>
</body>
<script>
let store = document.getElementById("loginBtn");

store.onclick=function(){
	location.href="/loginBtn"	
}	


let logs = document.getElementsByClassName("loginSelcete")
logs[0].style.borderBottom.color = "#DC143C";




</script>
</html>