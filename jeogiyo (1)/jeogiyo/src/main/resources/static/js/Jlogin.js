/**
 * 학생관리와 관련된 스크립트
 */
/*로그인/로그아웃/아이디찾기 -------------------- */

var consumer = document.getElementById('consumer');  //메인 페이지에서 로그인 버튼이 클릭되는 버튼
var loginBtn = document.getElementById('loginBtn'); //로그인 버튼을 눌렀으떄 로그인 창이뜨는 버튼
//var btnLogout = document.getElementById('btnLogout'); //로그아웃 버튼
var findIdBtn = document.getElementById("findIdBtn"); // 아이디찾기 버튼
var btnFindPwd = document.getElementById('btnFindPwd'); //암호찾기 버튼
var btnInput = document.getElementById('btnInput'); // 학생관리 페이지에있는 입력 버튼
var btnList = document.getElementById('btnList'); // 조회버튼
var btnSave = document.getElementById('btnSave');
var btnFind = document.getElementById('btnFind');
var btnUpdate = document.getElementById('btnUpdate');
var btnDelete = document.getElementById("btnDelete");
var btnZipFind = document.getElementById("btnZipFind");

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
	let frm = document.frm_findid;
	 let url = 'findIdR';
	 frm.action =url;
	  frm.submit();

	}
}

if(btnFindPwd != null){
	btnFindPwd.onclick = function(){
		let frm = document.frm_find_pwd;
		let url = 'findPwdR';
		frm.action = url;
		frm.submit();
	}
}


if(btnInput != null){
	btnInput.onclick = function(){
		let frm = document.frm_member;
     	let url = 'insert';
        frm.action = url;
		frm.submit();
	}
}

if(btnList != null){
	btnList.onclick =function(){
		let frm =document.frm_member;		
		let url = 'member_select';
	    frm.action = url;
		frm.submit();
	}
}

/*학생정보 저장------------------------------------------- */
if(btnSave != null){
	btnSave.onclick =function(){
	let url = 'inertR';
    let frm = document.frm_member;
	frm.action =url;
	frm.submit();
	}
}

/*학생 정보 조회-------------------------------------- */
if(btnFind != null){
	btnFind.onclick =function(){
		let url ='member_select';
		let frm = document.frm_member;
		frm.nowPage.value= 1;
		frm.action = url;
		frm.submit(); // submit을 사용하면 깜박거리는 현상이 나온다(갱신)
	}
}
/*페이징 처리 *------------------------------ */
function movePage(page){
		let url ='member_select';
        let frm = document.frm_member;
		frm.nowPage.value = page;
		frm.action = url;
		frm.submit(); // submit을 사용하면 깜박거리는 현상이 나온다(갱신)
}
// 수정할 데이터 가져오기
function modify(id){
	console.log("------------------");
	let url = 'modify';
	let frm = document.frm_member;
	frm.id.value = id;
	frm.action = url;
	frm.submit();
}

// 학생정보 수정

if(btnUpdate != null){
	btnUpdate.onclick = function(){
	let pwd = prompt("수정하려면 암호를 입력하세요");
	if(pwd == null){
		return;
	}
	
	let url = 'modifyR';
	let frm = document.frm_member;
	frm.pwd.value = pwd;
	frm.action = url;
	frm.submit();
	}
}

// 학생 정보 삭제

if(btnDelete != null){
	btnDelete.onclick = function(){
		let url = 'deleteR';
		let frm = document.frm_member;
		let pwd = prompt("정보를 삭제하려면 암호를 입력해주세요");
		if(pwd==null)return;
		frm.pwd.value = pwd;
		frm.action = url;
		frm.submit();
	}
}

//우편번호 검색

if(btnZipFind != null){
	btnZipFind.onclick = function(){
		new daum.Postcode({
			oncomplete : function(data){
				let frm = document.frm_member;
				frm.zipcode.value = data.zonecode;
				frm.address.value = data.address;
			}
		}).open();
	}
}





