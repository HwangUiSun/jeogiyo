/**
 *
 */

 document.addEventListener("DOMContentLoaded",()=>{
    
    
})

function cancle(ss){
	console.log( )
	let sno = document.getElementsByClassName("sno")
	let menuPrice = document.getElementsByClassName("menuPrice")[0]	
	let totalPrice = document.getElementById("totalPrice").value
	let menus = document.getElementById("menus").value
    let imgArray = document.getElementById("imgArray").value
    let eaArray = document.getElementById("eaArray").value
    let priceArray = document.getElementById("priceArray").value
    let div = ss.parentNode
    console.log(div.children[2].innerText)
    
    menus  = menus.replace("]","")
    menus  = menus.replace("[","")
    menus  = menus.replace("  ","")
    imgArray  = imgArray.replace("]","")
    imgArray  = imgArray.replace("[","")
    imgArray  = imgArray.replace("  ","")
    eaArray  = eaArray.replace("[","")
    eaArray  = eaArray.replace("]","")
    eaArray  = eaArray.replace("  ","")
    meneaArrayus  = eaArray.replace("[","")
    meneaArrayus  = eaArray.replace("]","")
    meneaArrayus  = eaArray.replace("  ","")
    priceArray  = priceArray.replace("]","")
    priceArray  = priceArray.replace("[","")
    priceArray  = priceArray.replace("  ","")
    
  	menus = menus.split(",");
  	imgArray = imgArray.split(",");
  	eaArray = eaArray.split(",");
  	priceArray = priceArray.split(",");  
  
  	let index = 0;
	for(let i=0 ; i<menus.length;i++){	
		menus[i] = menus[i].trim()
		if(menus[i]==div.children[2].innerText){
			index =i;
		}

	}
	
	menus.splice(index,1)
	imgArray.splice(index,1)
	eaArray.splice(index,1)
	priceArray.splice(index,1)
	div.remove();
	

	totalPrice = 0;
	for(let i=0 ; i<eaArray.length;i++){
		totalPrice += eaArray[i]*priceArray[i]
	}
	for(let i=0 ; i<eaArray.length;i++){
		sno[i].innerText = i+1
	}
	document.getElementById("menus").value = menus
    document.getElementById("imgArray").value = imgArray
    document.getElementById("eaArray").value = eaArray
    document.getElementById("priceArray").value = priceArray
    document.getElementById("totalPrice").value = totalPrice
    menuPrice.innerText = "총 금액: "+totalPrice+"원"
}

 