/**
 * 
 */
let center_notiInput = {};
let loadInterval = {};

center_notiInput.init = function(){
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
			/*
			onImageUpload : function(files){
				loadInterval.length = files.length;
				$('#center_notiInput').addClass('spinner');
				for(var i = files.length-1; i>=0; i--){
					sendFile(i, files[i]);
				}
			},
			onMediaDelete : function(target){// 업로드 된 이미지가 삭제 되었을 때
				var file = decodeURI(target[0].src); // js의 deleteFile에 target의 첫번째 배열을 넣는다. decodeURI : 파잍 이름이 한글인경우 교졍 시켜준다
				$.ajax({
					data : {delFile : file}, // delFile = parameter (req.getParmeter("delFile"))을 사용할 수 있었다.
					type : "POST",
					url : 'summernoteDelete',
					cache : false,
					success : function(resp){
						console.log("delete ok",resp);
					}
				});
			}*/
		}
	});
	
	// 오늘 날짜로 설정하기 
	let nal = document.getElementById("noti_nal");
	date = new Date();
 	date = date.toISOString().slice(0,10);
	nal.value = date; 
	hide();

}


center_notiInput.input = function(frm){
	
	frm.sno.value=0;
	frm.action = "center_notiInputR";
	frm.submit();
}
center_notiInput.update = function(frm){
	frm.action = "center_notiUpdateR";
	frm.submit();
	
}
center_notiInput.back = function(frm){
	frm.action="center_noti";
	frm.submit();
	
}
// 수정 작성 버튼 보이게 안보이게
function hide(){	
	// 본문 내용이 없으면 작성버튼 보이게 본문 내용 있으면 수정 버튼 보이게	
	if(summernote.value === ""){
		$("#input").show();
		$("#update").hide();
	}else{
		$("#input").hide();
		$("#update").show();
	}	
}
