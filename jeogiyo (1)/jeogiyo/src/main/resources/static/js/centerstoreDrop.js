/**
 * 
 */
  let center_storeDrop ={};
  
  function movePage(page){
			let url = 'center_storeDrop';
			let frm = $('.frm_Drop')[0];
			frm.nowPage.value = page;
			frm.action = url;
			frm.submit();	
}


btnDrop = function(frm){//조회버튼
	frm.nowPage.value=1;
	frm.action = "cemter_storefindstr";
	frm.submit();
}





dropView = function(storeName){ //상세보기
	let frm = $('.frm_Drop')[0];
	let url = "center_storeDropView";
	frm.storeName.value = storeName;
	frm.action = url;
	frm.submit();
}
  
  