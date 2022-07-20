/**
 * 
 */
 btnAccept = function(sno){
	
	
	var a = $('.sno').attr('value');
	if(sno == $('.sno').attr('value')){
		
	}
	console.log(a);
	var b = $('.a').attr('value');
	console.log(b);	
	$('.btn').val();
	$('.btns').css('visibility', 'hidden');
	$('.order_expected_time').css('visibility', 'visible');
	
	$('.order_expected_time h1').css('text-align', 'center');
	
	var time = 60 * 60;
	var timeOrigin = time;
	var hour = parseInt(timeOrigin / 3600);
	
	timeOrigin = timeOrigin % 3600;
	var min = parseInt(timeOrigin / 60);
	var second = timeOrigin % 60;
	
	$('.order_expected_time h1').empty();	
	$('.order_expected_time h1').text(hour + ":" + min);
	$('.order_expected_time h3').text("배달 중");
	
	var timer = setInterval(function(){
		time--;
		var timeOrigin = time;
		var hour = parseInt(timeOrigin / 3600);	
		timeOrigin = timeOrigin % 3600;
		var min = parseInt(timeOrigin / 60);
		var second = timeOrigin % 60;
		$('.order_expected_time h1').empty();
		$('.order_expected_time h1').text(hour + ":" + min	);
		if(time == 0){
			$('.order_expected_time').css('visibility', 'hidden');
			$('.end_time').css('visibility', 'visible');
		}else{
			skip = function(){
				$('.order_expected_time').css('visibility', 'hidden');
			$('.end_time').css('visibility', 'visible');
			}
		}
	})
}

function movePage(page){
	let url = 'store_orderStatus';
	let frm = document.frm_orderStatus;
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();
}

