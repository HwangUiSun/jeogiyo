/**
 * 
 */
 
 function moveUrl(url){
	let mainform = document.createElement("form");
	mainform.name = 'mainform';
	mainform.method = 'post';
	mainform.action = 'store_orderInput';

	var titlesinput = document.createElement('input');
		titlesinput.setAttribute("type", "hidden");
		titlesinput.setAttribute("name", "title");
		titlesinput.setAttribute("value", "");
		mainform.appendChild(titlesinput);
		document.body.appendChild(mainform);
		// submit form
		mainform.submit();	
}
 
  function movePage(page){
	console.log("movePage")
	let url = 'order';
	let frm = document.frm_order;
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();	
}

	function orderView(sno){
		let url = 'order_view';	

		let frm =document.getElementById(sno);
		console.log(frm)
		frm.action = url;
		frm.submit();
		
	}
	function orderViewC(sno){
		let url = 'center_orderView';	

		let frm =document.getElementById(sno);
		console.log(frm)
		frm.action = url;
		frm.submit();
		
	}
	
	
 