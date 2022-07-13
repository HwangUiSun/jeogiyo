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

