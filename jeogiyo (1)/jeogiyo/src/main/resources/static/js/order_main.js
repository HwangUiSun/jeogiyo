/**
 * 
 */
 
  function movePage(page){
	console.log("movePage")
	let url = 'center_order';
	let frm = document.frm_order;
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();	
}
 