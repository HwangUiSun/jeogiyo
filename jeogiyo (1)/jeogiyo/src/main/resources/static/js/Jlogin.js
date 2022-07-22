/**
 * 학생관리와 관련된 스크립트
 */
/*로그인/로그아웃/아이디찾기 -------------------- */


//var btnLogout = document.getElementById('btnLogout'); //로그아웃 버튼
var findIdBtn = document.getElementById("findIdBtn"); // 아이디찾기 버튼
var findPwdBtn = document.getElementById('findPwdBtn'); //암호찾기 버튼


login = function(frm){
	if(frm.mId.value != "" && frm.password.value != ""){
		
		let url = 'loginBtn'
		frm.action = url;
		frm.submit();
	}else{
		alert("회원 정보를 입력해주세요")
	}
}

function onKeyUp(){
	if(window.event.keyCode == 13){
		doEnter();
	}
}



function doEnter(){
	document.getElementById("loginBtn").click();
}


/*//index에서 로그아웃 버튼이 클릭된 경우
if(btnLogout != null){
	btnLogout.onclick = function(){
	  let url = 'logout';
	let frm = document.frm_login_out;//페이지를 이동 하는데  frm태그의 정보를 전달후 이동
	frm.action =url;
	frm.submit();
	
	}
}
*/

/* 아이디/ 암호 찾기--------------*/
if(findIdBtn != null){
	findIdBtn.onclick = function(){
	console.log("1122");
	let frm = document.frm_findid;
	 let url = 'findIdR';
	 frm.action =url;
	  frm.submit();
      
	}
}

if(findPwdBtn != null){
	findPwdBtn.onclick = function(){
		let frm = document.frm_findpwd;
		let url = 'findPwdR';
		frm.action = url;
		frm.submit();
	}
}





