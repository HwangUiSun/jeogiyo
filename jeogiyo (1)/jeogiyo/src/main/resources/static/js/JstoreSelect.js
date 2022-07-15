/**
 * 
 */
  function movePage(page){
	let frm = document.frm_consumer;
	frm.nowPage.value = page;
	frm.action = "JstoreSelect"
	frm.submit();
}


//var find_Store = document.getElementById("findStore");
var citySelect;
var find_Store;
//도시 선택 후 지역출력 
function cityFindChange(JstoreName){
	var seoul=["강남구", "강서구", "강북구"];
	var gyeonggi = ["수원시" , "평택시", "용인시"];
	var pusan = ["수영구", "해운대구", "기장군"];
	var target = document.getElementById("storeFindStr");	
	
	if(JstoreName.value == "seoul") var d =seoul;
	else if(JstoreName.value == "gyeonggi") var d = gyeonggi;
	else if(JstoreName.value == "pusan") var d = pusan;
	
	
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
