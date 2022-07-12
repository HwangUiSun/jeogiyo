/**
 * 
 */
 
 function movePage(page){
	let frm = document.frm_consumer;
	frm.nowPage.value = page;
	frm.action = "center_noti"
	frm.submit();
}