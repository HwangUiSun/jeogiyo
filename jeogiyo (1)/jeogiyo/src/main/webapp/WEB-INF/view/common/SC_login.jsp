<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SC_login</title>
 <link rel="stylesheet" type="text/css" href="css/logIn_out.css">
 <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
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
 			</div>     
	 			<div id="store" class="signins">     
	                <form name="loginFrm" method="post" id="loginFrm">                
	                    <div class="inputBx">
	                        <span>Username</span>
	                        <input type='text' name="mId" id="mId">
	                    </div>
	                    <div class="inputBx">
	                        <span>Password</span>
	                        <input type='password' name="password" id='password' onkeyup="onKeyUp()">
	                    </div>
	                    <div class="inputBx">
	                        <label><input type="button" value="Sign in" id="logIntoData" onclick='login(this.form)'></label>
	                    </div>
	                    <div class="inputBx">
	                        <p>Don't have a account? <a href='store_join'><span class="singIn">회원가입</span></a></p>
	                        <p>Don't remember ID?<a href='store_findId'> <span class="findStr">아이디 찾기<span></span></a></p>
	                        <p>Don't remember passwords?<a href='store_findPwd'> <span class="findStr">비밀번호 찾기<span></span></a></p>
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
<script src='./js/login.js'>
</script>

</html>