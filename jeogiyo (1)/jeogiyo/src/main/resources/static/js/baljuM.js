/**
 * 
 */

let posible = document.getElementsByClassName('posible');
let imposible = document.getElementsByClassName('imposible');

for(let i = 0 ; i<posible.length;i++){
	posible[i].style.backgroundColor ="#0000aa"
}
for(let i = 0 ; i<imposible.length;i++){
	imposible[i].style.backgroundColor ="#aa0000"
}


 function status(bool, sno){
	let form = document.createElement("form")
	form.action = "changS"
	form.name="statusForm"
	form.method = "post"
	
	let boolInput = document.createElement('input')
	let snoInput = document.createElement('input')
	boolInput.setAttribute("type", "hidden");
	boolInput.setAttribute("name", "bool");
	boolInput.setAttribute("value", bool);
	
	snoInput.setAttribute("type", "hidden");
	snoInput.setAttribute("name", "sno");
	snoInput.setAttribute("value", sno);
	
	form.appendChild(boolInput);
	form.appendChild(snoInput);
	document.body.appendChild(form);
	
	form.submit();	
	
}

function sub(productName, sno){
	let selectSno = document.getElementById('selectSno')
	let product = document.getElementById('product')
	
	product.value = productName;
	selectSno.value = sno;
	console.log(selectSno.value )
	
}