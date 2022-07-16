/**
* 공지사항 
 */
 
let noti_view = {};
document.addEventListener('DOMContentLoaded', () => {
	//if( id가 root가 아니면  ){
	//	$('#inputbutton').hide();
	//}
	
	
});
					

noti_view.view = function(sno){
	//let frm = $("#frm_noti_main")[0];
	let frm = document.frm_noti;
	frm.sno.value=sno;
	frm.action='center_notiView';
	frm.submit();
}
function movePage(page){
		let url = 'center_noti';
		let frm = document.frm_noti;
		frm.nowPage.value = page;
		console.log(page);
		frm.action = url;
		frm.submit();
}

noti_view.input = function(frm){
	frm.action = "center_notiInput"
	frm.submit();
}

// 검색
noti_view.find = function(frm){
	frm.nowPage.value=1;
	frm.action = "center_noti"
	frm.submit();
}
	