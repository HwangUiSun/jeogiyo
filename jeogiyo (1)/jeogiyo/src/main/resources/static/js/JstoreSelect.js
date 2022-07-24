/**
 * 
 */
 //document.addEventListener('DOMContentLoaded', () => {
	
  function movePage(page){
	console.log("movePage")
	let frm = document.frm_Jstore;
	let url = 'JstoreSelect';
	frm.nowPage.value = page;
	frm.action = url;
	frm.submit();
}


//var find_Store = document.getElementById("findStore");
var citySelect;
var find_Store;
//도시 선택 후 지역출력 
function cityFindChange(JstoreName){
	var seoul=["강남구", "강동구", "강북구"];
	var gyeonggi = ["가평군" , "과천시", "김포시"];
	var pusan = ["강화군", "중구", "연수구"];
	var target = document.getElementById("storeFindStr");	
	
	if(JstoreName.value == "서울") var d =seoul;
	else if(JstoreName.value == "경기") var d = gyeonggi;
	else if(JstoreName.value == "인천") var d = pusan;
	
	
	target.length = 0;
	
	for(x in d){
		var opt = document.createElement("option");
		opt.value = d[x];
		opt.innerHTML = d[x];
		target.appendChild(opt);
	}

}
function mapFindChange(){
	citySelect = document.getElementById("storeFindStr").value;
	console.log(citySelect);
}


function test(){	
	find_Store = document.getElementById("findStore").value;
	console.log("입력한 도시명 :" + citySelect);
	console.log("입력한 매장명 :" + find_Store);
}

storeList = function(frm){
	frm.nowPage.value=1;
	frm.action='JstoreSelect';
	frm.submit();	
		
}
