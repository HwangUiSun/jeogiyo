/**
 *  storeM 07-13 JR
 */

/*
HTTP 통신
=> 5개의 행위가있다.

1. location.href GET

2. form GET 

=> GET (이동 조회 가져오기) <a href="test"/>
	=> url에 값이 노출되는경우 
	=> 길이가 어느정도 정해져있어 
	=> 검색, 조회를 대부분 사용해 
	=> 이미지, 파일을 보는 것도
	 
=> POST (form)
	=> 로그인 
	=> 파일업로드 
	=> 무엇인가 내가 서버로 데이터를 전송할 때 !
	=> 보안상 중요한거는 post
 */  


// 화면에 들어올때 초기화
$(function() {
	$("#selectLocal").empty();
});

 
let center_storeM = {};


center_storeM.clickLocal = function(mainLocal) {
	location.href='center_storeM_local?startNo=1&local='+ mainLocal;
}


center_storeM.movePage = function(page){
	
	let selectLocalValue = $("#selectLocal").val();
	// 값이 비어있다면
	if (!selectLocalValue) {
		location.href='center_storeM?startNo=' + page;	
	} else {
		location.href='center_storeM_local?startNo=' + page + '&local=' + selectLocalValue		
	}
}

function view(storeName, mid){
	let frm = $('#frm_view')[0];
	frm.storeName.value = storeName;
	frm.mid.value = mid;
	console.log(storeName);
	let url = 'center_storeMview';
	frm.action = url;
	
	frm.submit();
}


