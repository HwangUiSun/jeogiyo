/**
 * 
 */
 
frm_center_storeMview = function(){
	let frm = $('#frm_center_storeMview')[0];
	frm.action = 'center_storeMview';
	frm.submit();
}

btn_lookUp = function(mid){
	let frm = $('#ff')[0];
	frm.action = 'center_storeMview2';
	frm.submit();
}



function startday(){
	let startnal = document.getElementById("startnal").value
	let startdate = document.getElementById("startdate")
	startdate.value = startnal
	console.log(startdate.value)
}


btn_drop = function(){
	let frm = $('#frm_center_storeMview')[0];
	frm.action = 'center_storeDrop';
	frm.submit();
}


btn_back = function(){
	let frm =$('#frm_center_storeMview')[0];
	frm.action = 'center_storeM';
	frm.submit();
}
