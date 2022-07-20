  function movePage(page){
	let frm = document.frm_JorderList;
	let url = 'JorderList';
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();
}