/**
 * 
 */
 btnAccept = function(){
	
	$('.btns').css('visibility', 'hidden');
	$('.order_expected_time').css('visibility', 'visible');
	
	$('.order_expected_time h1').css('text-align', 'center');
	
	var time = 24 * 60 * 60;
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

$(function(){
	var timer;
	
	$('').click(function(){
		timer = setTimeout(function(){
			window.alert(new Date());
		},5000);
	});
	
	$('#stop').click(function(){
		clearTimeout(timer);
	});
});