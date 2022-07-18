/**
 * 
 */
 let noti_view = {};
 let loadInterval = {};
noti_view.init = function(){
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
	let nal = document.getElementById("noti_nal");
	date = new Date();
 	date = date.toISOString().slice(0,10);
	nal.value = date; 
	hideIU()
	// summernote 수정 불가능하게 만들기
	$('#summernote').next().find(".note-editable").attr("contenteditable", false);
	
}	
 noti_view_updateview = function(frm){
	
	frm.action="center_notiUpdate";
	frm.submit();
		
}
 noti_view_delete = function(frm){
	frm.action="center_notiDelete";
	frm.submit();
}
 noti_view_back = function(frm){
	frm.action="center_noti";
	frm.submit();
	
}


function hideIU(){
		// 수정 작성 버튼 보이게 안보이게
	let log = $("#ioginId").attr('value')
	if(log != "root"){
		$("#input").hide();
		$("#delete").hide();
	}
}








