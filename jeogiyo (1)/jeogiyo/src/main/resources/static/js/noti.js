/**
* 공지사항 
 */
 
let noti_view = {};
//document.addEventListener('DOMContentLoaded', () => {

	
//});
					

noti_view.view = function(sno){
	//let frm = $("#frm_noti_main")[0];
	let frm = document.frm_noti;
	let log = $("#ioginId").attr("value")
	frm.sno.value=sno;
	if(log=="root"){
		frm.action='center_notiView';
		frm.submit();	
	}else{
		frm.action='noti_view';
		frm.submit();	
	}
	
}
function movePage(page){
		let log = $("#ioginId").attr("value")
		if(log=="root"){
			let url = 'center_noti';
			let frm = document.frm_noti;
			frm.nowPage.value = page;
			frm.action = url;
			frm.submit();	
		}else{
			let frm = document.frm_noti;
			frm.nowPage.value = page;
			frm.action='noti';
			frm.submit();	
		}
}

noti_view.input = function(frm){
	frm.action = "center_notiInput"
	frm.submit();
}

// 검색
noti_view.find = function(frm){
	frm.nowPage.value=1;
	let log = $("#ioginId").attr("value")
		if(log=="root"){
			frm.action = "center_noti"
			frm.submit();	
		}else{
			frm.action='noti';
			frm.submit();	
		}
}


// 작성 버튼 히든으로 하기
function button(){
	let log = $("#ioginId").attr('value')
	if(log != "root"){
		$('#inputbutton').hide();
	}
	
}