/**
 * 
 */
 

login = function(frm){
	if(frm.mId.value != "" && frm.password.value != ""){
		let url = 'store_login'
		frm.action = url;
		frm.submit();
	}else{
		alert("회원 정보를 입력해주세요")
	}
}