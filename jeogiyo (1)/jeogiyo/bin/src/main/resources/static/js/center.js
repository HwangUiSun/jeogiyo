/**
 * 
 */
let center = {};
center.init = function(){
	fonts = [
		"맑은고딕", "돋음", "궁서", "굴림", "굴림체",
		"궁서체", "바탕", "바탕체", "HY엽서체M", "휴먼옛체" ];
	fonts.sort();
	
	$('#summernote').summernote({
		height : 300,
		minHeight : null,
		maxHeight : null,
		fontNames : fonts,
		callbacks : {
			onImageUpload : function(files){
				loadInterval.length = files.length;
				$('#center').addClass('spinner');
				for(var i = files.length-1; i>=0; i--){
					sendFile(i, files[i]);
				}
			}
		}
	});
}

center.click = function(){
	console.log("hello");
}

/*
$('#summernote').summernote({
		height : 300,
		minHeight : null,
		maxHeight : null,
		focus : true,
		lang : "ko-KR",
		placeholder : '최대 2048자까지 쓸 수 있습니다.'
	});
*/