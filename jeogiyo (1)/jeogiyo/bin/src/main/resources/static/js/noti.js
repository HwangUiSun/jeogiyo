/**
* 공지사항 
 */
 
 function movePage(page){
	console.log("movePage")
	let url = 'center_notiView';
	let frm = document.frm_noti;
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();	
}
 