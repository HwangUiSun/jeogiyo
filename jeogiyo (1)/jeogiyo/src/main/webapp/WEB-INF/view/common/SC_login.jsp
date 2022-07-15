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

<body>
    <section>
        <div class="imgBx">
           <img src="img/sea.jpg"/>
        </div>
        <div class="contentBx"> 
            <div class="formBx">
            <div class="h5flex">
                <h5 class="loginSelcete" onclick="openLogin('store')">가맹로그인</h5> 
 				<h5 class="loginSelcete" onclick="openLogin('center')">본사로그인</h5> 
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
	                        <label><input type="button" value="Sign in" name="" id="logIntoData"></label>
	                    </div>
	                    <div class="inputBx">
	                        <p>Don't have a account? <a href='store_join'><span class="singIn">회원가입</span></a></p>
	                        <p>Don't remember ID?<a href='store_findId'> <span class="findStr">아이디 찾기<span></span></a></p>
	                        <p>Don't remember passwords?<a href='store_findPwd'> <span class="findStr">비밀번호 찾기<span></span></a></p>
	                    </div>
                	</form>
                </div>
                <div id="center" style="display:none" class="signins">     
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
	                        <label><input type="button" value="Sign in" name="" id="logIntoData2"></label>
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
<script>
let store = document.getElementById("logIntoData");

store.onclick=function(){
	location.href="/store_login"	
}	
let center = document.getElementById("logIntoData2");
center.onclick=function(){
	location.href="/center_login"	
}

let logs = document.getElementsByClassName("loginSelcete")
logs[0].style.borderBottom.color = "#DC143C";
logs[1].style.borderBottom.color = "#0313f5";

function openLogin(tab) {
	  
	  var i;
	  var x = document.getElementsByClassName("signins");
	  for (i = 0; i < x.length; i++) {
	    x[i].style.display = "none";
	  }
	 document.getElementById(tab).style.display = "block";
	 if(tab=="store"){
		 logs[1].style.borderBottom.color = "#0313f5";
		 logs[0].style.borderBottom.color = "#DC143C"
	 }else{
		 logs[1].style.borderBottom.color = "#0313f5";
		 logs[0].style.borderBottom.color = "#DC143C";
	 }
	 
	}

</script>
</html>