/**
 * 
 */
 btn = document.getElementsByClassName('btns'); //추가한거
start = document.getElementsByClassName('order_expected_time');
end = document.getElementsByClassName('end_time');
 document.addEventListener('DOMContentLoaded', (event) => { 
    
    btnAccept = function(sno){
	
	
	btn[sno].style.visibility ="hidden";//추가한거
	start[sno].style.visibility = "visible";
	var time = 60 * 60;
	var timeOrigin = time;
	var min = parseInt(timeOrigin / 3600);
	
	timeOrigin = timeOrigin % 3600;
	var sec = parseInt(timeOrigin / 60);
	
	$('.order_expected_time h1').empty();	
	start[sno].innerHTML = "<h1>min + ':' + sec</h1><br/><h3>배달 중</h3>";
	
	var timer = setInterval(function(){
		time--;
		var timeOrigin = time;
		var min = parseInt(timeOrigin / 3600);	
		timeOrigin = timeOrigin % 3600;
		var sec = parseInt(timeOrigin / 60);
		start[sno].innerHTML = "<h1>" + min + ':' + sec + "</h1>";
		if(time == 0){
			start[sno].style.visibility = "hidden";
			end[sno].style.visibility = "visible";
		}
	})
}

})
 
function btnDeny(sno){
	let url = 'store_orderStatus_Drop';
	let frm = document.frm_orderStatus;
	frm.sno.value = sno;
	frm.action = url;
	frm.submit();
}
function movePage(page){
	let url = 'store_orderStatus';
	let frm = document.frm_orderStatus;
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();
}

