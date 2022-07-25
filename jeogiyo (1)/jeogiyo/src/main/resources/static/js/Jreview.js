/**
 * 
 */
 
   function movePage(page){
	console.log("movePage")
	let frm = document.frm_review;
	let url = 'writeBtn';
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();
}