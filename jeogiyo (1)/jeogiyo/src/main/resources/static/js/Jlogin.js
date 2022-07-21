/**
 * 학생관리와 관련된 스크립트
 */
/*로그인/로그아웃/아이디찾기 -------------------- */

var consumer = document.getElementById('consumer');  //메인 페이지에서 로그인 버튼이 클릭되는 버튼
var loginBtn = document.getElementById('loginBtn'); //로그인 버튼을 눌렀으떄 로그인 창이뜨는 버튼
//var btnLogout = document.getElementById('btnLogout'); //로그아웃 버튼
var findIdBtn = document.getElementById("findIdBtn"); // 아이디찾기 버튼
var findPwdBtn = document.getElementById('findPwdBtn'); //암호찾기 버튼


//index에서 로그인 버튼이 클릭된 경우
if(consumer != null){//null값으로 잡지 않으면 오류와 로그인 창이 따로 연출이 되지 않는다
	consumer.onclick = function(){
	console.log('consumer');
	let url = 'consumer';
		  //* index.jsp시작하면서 inc에member/form_login.jsp 넣는다 */
		location.href = url; //단순페이지 이동
	}
}
//(로그인 폼)form_login을 통해서 로그인 버튼이 클릭된 경우
if(loginBtn != null){
	loginBtn.onclick = function(){
		let url = 'loginR';
		let frm = document.loginFrm;
		frm.action = url;
		frm.submit(); // submit 는 전송을 뜻한다
		
	}
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





