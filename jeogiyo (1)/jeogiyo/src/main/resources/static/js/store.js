/**
 *   store 
 *   07-11 JR
 */
 


 //var noti =document.getElementById("noti");
 
 noti=function(){
	let section = $("#section");
	
		$.ajax({
			url : "noti",
			type : "post",
			datatype: "html",
			success:function(data){
				console.log("asd")
				section.html(data);
			}
		
		
		})
}

	let comp = document.getElementById("comp");
	let cancle = document.getElementById("cancle");


	//발주 하기 추가, 삭제 함수들..
	function wait(title){
		var waitForm = document.createElement('form');
		waitForm.name = 'waitForm';
		waitForm.method = 'post';
		waitForm.action = '/waitOrder';
		let tableName = document.getElementById("tableName");
		var titlesinput = document.createElement('input');
		titlesinput.setAttribute("type", "hidden");
		titlesinput.setAttribute("name", "title");
		titlesinput.setAttribute("value", title);
		waitForm.appendChild(titlesinput);
		// append form (to body)
		document.body.appendChild(waitForm);
		// submit form
		waitForm.submit();
		
	}
	function accept(title){
		var acceptForm = document.createElement('form');
		acceptForm.name = 'acceptForm';
		acceptForm.method = 'post';
		acceptForm.action = '/acceptOrder';
		let tableName = document.getElementById("tableName");
		var titlesinput = document.createElement('input');
		titlesinput.setAttribute("type", "hidden");
		titlesinput.setAttribute("name", "title");
		titlesinput.setAttribute("value", title);
		acceptForm.appendChild(titlesinput);
		// append form (to body)
		document.body.appendChild(acceptForm);
		// submit form
		acceptForm.submit();
		
	}
	
	
	
	function complete(){
		var cForm = document.createElement('form');
		cForm.name = 'cForm';
		cForm.method = 'post';
		cForm.action = '/insertba';
		let tableName = document.getElementById("tableName");
		let titles = tableName.value;
		console.log(titles)
		var titlesinput = document.createElement('input');
		titlesinput.setAttribute("type", "hidden");
		titlesinput.setAttribute("name", "title");
		titlesinput.setAttribute("value", titles);
		cForm.appendChild(titlesinput);
		// append form (to body)
		document.body.appendChild(cForm);
		// submit form
		cForm.submit();
		
		
		
		
		
	}
	
	
	function sub(sno){
		var subForm = document.createElement('form');
		// set attribute (form) 
		subForm.name = 'subForm';
		subForm.method = 'post';
		subForm.action = '/sub';
	
		// create element (input)
		var snoinput = document.createElement('input');
		// set attribute (input)
		snoinput.setAttribute("type", "hidden");
		snoinput.setAttribute("name", "sno");
		snoinput.setAttribute("value", sno);
	
		// append input (to form)
		subForm.appendChild(snoinput);
		// append form (to body)
		document.body.appendChild(subForm);
		// submit form
		subForm.submit();
		
		
		}
	function add(sno,eas){
		let ea = document.getElementById(eas)

		/* Javascript */
		// create element (form)
		var newForm = document.createElement('form');
		// set attribute (form) 
		newForm.name = 'newForm';
		newForm.method = 'post';
		newForm.action = '/adds';	
	
		// create element (input)
		var eainput = document.createElement('input');
		var snoinput = document.createElement('input');
		var titleinput = document.createElement('input');
		var title = document.getElementById('store').value
		// set attribute (input)
		eainput.setAttribute("type", "hidden");
		eainput.setAttribute("name", "ea");
		eainput.setAttribute("value", ea.value);
		snoinput.setAttribute("type", "hidden");
		snoinput.setAttribute("name", "sno");
		snoinput.setAttribute("value", sno);
		titleinput.setAttribute("type", "hidden");
		titleinput.setAttribute("name", "title");
		titleinput.setAttribute("value", title);
	
		// append input (to form)
		newForm.appendChild(snoinput);
		newForm.appendChild(eainput);
		newForm.appendChild(titleinput);
	
		// append form (to body)
		document.body.appendChild(newForm);

		// submit form
		newForm.submit();
	}
	
	function drop(){
		var dropForm = document.createElement('form');
		// set attribute (form) 
		dropForm.name = 'dropForm';
		dropForm.method = 'post';
		dropForm.action = '/order';
		document.body.appendChild(dropForm);
		dropForm.submit();
	}
	
	frm = document.frm_order_view;
	lastIndex = document.getElementById("title").value.length;	
	let sd =document.getElementById("title").value.slice(-9,lastIndex).split("_")
	let str = sd[0]+"-0"+sd[1]+"-"+sd[2]
	document.getElementById("nal").value=str;

  document.getElementById('today').value = new Date().toISOString().substring(0, 10);
  
 