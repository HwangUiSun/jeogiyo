/**
 * 
 */
 let upload = {};
 let loadInterval = {};
upload.init = function(){
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
				$('#noti_view').addClass('spinner');
				for(var i = files.length-1; i>=0; i--){
					sendFile(i, files[i]);
				}
			}
			
		}
	});
	// 오늘 날짜로 설정하기 
	let nal = document.getElementById("nal");
	date = new Date();
 	date = date.toISOString().slice(0,10);
	nal.value = date; 
	hideIU()
	
	
}	
 write = function(frm){
	
	frm.action="writeBtn";
	frm.submit();
		
}

 noti_view_back = function(frm){
	
		frm.action='noti';
		frm.submit();	
	}
	
	









