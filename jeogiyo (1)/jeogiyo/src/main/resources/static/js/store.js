/**
 *   store 
 *   07-11 JR
 */
 
 let store = {};

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
	let ea	
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
		ea = document.getElementById(eas)
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
		// set attribute (input)
		eainput.setAttribute("type", "hidden");
		eainput.setAttribute("name", "ea");
		eainput.setAttribute("value", ea.value);
		snoinput.setAttribute("type", "hidden");
		snoinput.setAttribute("name", "sno");
		snoinput.setAttribute("value", sno);
	
		// append input (to form)
		newForm.appendChild(snoinput);
		newForm.appendChild(eainput);
	
		// append form (to body)
		document.body.appendChild(newForm);
		console.log("여기까지왔니?")
		// submit form
		newForm.submit();
	}
	
	function drop(){
		var dropForm = document.createElement('form');
		// set attribute (form) 
		dropForm.name = 'dropForm';
		dropForm.method = 'post';
		dropForm.action = '/dropT';
		document.body.appendChild(dropForm);
		dropForm.submit();
	}


