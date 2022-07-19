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





center_storeView = function(){//상세보기
	let frm = $('.frm_Drop')[0];
	frm.action = 'center_storeMview';  //스프링 타입
	frm.submit();
}
  
  