<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SC_login</title>
 <link rel="stylesheet" type="text/css" href="css/logIn_out.css">
</head>
<body>
%애 나 SC_login
<a href='store_login'>가맹로그인</a>
<a href='center_login'>본사로그인</a>
<a href='store_findId'>아이디 찾기</a>
<a href='store_findPwd'>비밀번호 찾기</a>
<a href='store_join'>회원가입</a>
<body>
    <section>
        <div class="imgBx">
           <img src="img/sea.jpg"/>
        </div>
        <div class="contentBx"> 
            <div class="formBx">
                <h2>Login</h2>           
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
                        <label><input type="button" value="Sign in" name="" id="logIntoData"></label>
                    </div>
                    <div class="inputBx">
                        <p>Don't have a account? <a href='store_join'><span class="singIn">회원가입</span></a></p>
                        <p>Don't remember passwords? <span class="findStr">Find out<span></p>
                    </div>
                </form>
                <h3>Login with social media</h3>
                <ul class="sci">
                    <li><a><img src="img/face.png"/></a></li>
                    <li><a><img src="img/ins.png"/></a></li>
                    <li><a><img src="img/youtube.png"/></a></li>
                </ul>
            </div>
        </div>
</body>
</html>