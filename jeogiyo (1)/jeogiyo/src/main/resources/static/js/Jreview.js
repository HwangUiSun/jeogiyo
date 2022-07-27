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


function view(sno){
	let readform = document.createElement("form");
	readform.name = 'readform';
	readform.method = 'post';
	readform.action = 'reviewRead';

	var snoinput = document.createElement('input');
		snoinput.setAttribute("type", "hidden");
		snoinput.setAttribute("name", "sno");
		snoinput.setAttribute("value", sno);
		readform.appendChild(snoinput);
		document.body.appendChild(readform);
		// submit form
		readform.submit();	
	
}