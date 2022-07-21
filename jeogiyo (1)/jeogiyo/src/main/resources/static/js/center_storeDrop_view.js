/**
 * 
 */
 
 
 drop_OK = function(storeName){ 
	let frm = $('.frm_storeDrop_view')[0];
	let url = "center_storeDropOK";
	frm.storeName.value = storeName;
	frm.action = url;
	frm.submit();
}
 