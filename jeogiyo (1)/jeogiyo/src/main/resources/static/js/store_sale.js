/**
 * 
 */

function startday(){
	let startnal = document.getElementById("startnal").value
	let startdate = document.getElementById("startdate")
	startdate.value = startnal
	console.log(startdate.value)
	
}
function endday(){
	let enddate = document.getElementById("enddate")
	let endnal = document.getElementById("endnal").value
	enddate.value = endnal
	console.log(endnal)
	
}

store_sale={};
function movePage(page){
	let frm = $("#frm_store_sale")
	frm.nowPage.value=page;
}

function find(frm){
	frm.action="store_sale_find"
	console.log(frm)
	frm.submit()
}

function find2(frm){
	frm.action="chart"
	console.log(frm)
	frm.submit()
}





 