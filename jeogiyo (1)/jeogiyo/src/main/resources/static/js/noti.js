/**
* 공지사항 
 */
document.addEventListener('DOMContentLoaded', () => {
    

	
	function movePage(page){
		console.log("movePage")
		let url = 'center_noti';
		let frm = document.frm_noti;
		frm.nowPage.value = page;
		frm.action = url;
		frm.submit();
	}
	
});
					
