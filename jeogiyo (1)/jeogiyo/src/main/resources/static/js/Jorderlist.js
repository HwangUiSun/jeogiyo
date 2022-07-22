  function movePage(page){
	let frm = document.frm_Jorder;
	let url = 'JorderList';
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();
}