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
	}			




function write(){
	console.log("1");
	var form = document.upload;
	console.log("2");
	form.action = 'writeBtn';
	form.submit(); 
}

function back(){
		let bform = document.createElement("form");
			bform.name = 'bform';
			bform.method = 'post';
			bform.action = 'JorderList';
			document.body.appendChild(bform);
			bform.submit();	
		
	}
function backwriteBtn(){
		let bform = document.createElement("form");
			bform.name = 'bform';
			bform.method = 'post';
			bform.action = 'writeBtn';
			document.body.appendChild(bform);
			bform.submit();	
		
	}
	
		
	function writereview(){
	alert("")
	let mainform = document.createElement("form");
	mainform.name = 'mainform';
	mainform.method = 'post';
	mainform.action = 'writeBtn';
	
	let str=""
	let doc = document.getElementById('summernote');
	let subject = document.getElementById('subjects');
	doc.value=doc.value.replace('<p>','')
	doc.value=doc.value.replace('</p>','')
	var subjectinput = document.createElement('input');
		subjectinput.setAttribute("type", "hidden");
		subjectinput.setAttribute("name", "subjectinput");
		subjectinput.setAttribute("value", subject.value);
	var docinput = document.createElement('input');
		docinput.setAttribute("type", "hidden");
		docinput.setAttribute("name", "docinput");
		docinput.setAttribute("value", doc.value);
		
	let dates = document.getElementById('nal').value;
	var nalinput = document.createElement('input');
		nalinput.setAttribute("type", "hidden");
		nalinput.setAttribute("name", "nal");
		nalinput.setAttribute("value", dates);
		
	let mid = document.getElementById('mid').value;
	var midinput = document.createElement('input');
		midinput.setAttribute("type", "hidden");
		midinput.setAttribute("name", "mid");
		midinput.setAttribute("value", mid);
		
	let sno = document.getElementById('sno').value;
	var snoinput = document.createElement('input');
		snoinput.setAttribute("type", "hidden");
		snoinput.setAttribute("name", "sno");
		snoinput.setAttribute("value", sno);
		
	

  		mainform.appendChild(midinput);
		mainform.appendChild(nalinput);
		mainform.appendChild(snoinput);
		mainform.appendChild(docinput);
		mainform.appendChild(subjectinput);
		document.body.appendChild(mainform);
		// submit form
		mainform.submit();	

}


