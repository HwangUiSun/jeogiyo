<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/JmenuSelect.css" rel="stylesheet">
<title>JmenuSelect</title>
<link rel = 'stylesheet' type='text/css' href = 'css/JmenuSelect.css'>
 <script>
function clickEffect(e){
  var d=document.createElement("div");
  d.className="clickEffect";
  d.style.top=e.clientY+"px";d.style.left=e.clientX+"px";
  document.body.appendChild(d);
  d.addEventListener('animationend',function(){d.parentElement.removeChild(d);}.bind(this));
}
document.addEventListener('click',clickEffect);
</script>
</head>
<style>
ul.tabs{
   margin:0px;
   padding:0px;
   list-style:none;
}

ul.tabs li{
   display:inline-block;
 	background: #898989;
	color: white;
	padding: 10px 15px;
	cursor: pointer;
}

ul.tabs li.current{
	background: #e0e0e0;
	color: #222;
}

.tab-content{
    display: none;
	padding: 12px;
}

.tab-content.current{
    display : inherit;
}

</style>
<body>
	<form action='' method='post'>
	<div class= "container">
	
	 <div id='subject'>메뉴보기</div>
	   <ul class= "tabs">
	         <li class="tab-link current" data-tab="category_1">신메뉴</li>
	         <li class="tab-link"         data-tab="category_2">달콤메뉴</li>
	         <li class="tab-link"         data-tab="category_3">매콤메뉴 </li>
	         <li class="tab-link"         data-tab="category_4">사이드메뉴</li>
	         <li class="tab-link"         data-tab="category_5">음료</li>	         
	   </ul>
	          
		<div id="category_1" class="tab-content current">
          <img src='../img/chicken1.png' width='240px' height='240px'/>
	       <div class='subject' id='productName1_1'><a>발사믹 치킨</a><br/></div>
	       <div class='menuInfo' id='menuInfo1_1'>발사믹 비네거의 풍미와 달콤함의 기막힌 조화</div><br/>
	       <div class='price' id='price1_1'>소비자가격 : 18500원</div><br/>
	       <input type='checkbox' name='check' value='발사믹 치킨'/>선택 
	       <hr/>
	    </div>
	    
		<div id="category_2" class="tab-content">
          <img src='../img/original.png' width='240px' height='240px'/>
	       <div class='subject' id='productName2_1'><a>달콤허니 오리지날</a><br/></div>
	       <div class='menuInfo' id='menuInfo2_1'>달콤한 허니소스에 쫄깃한 날개와 담백한 다리가 만난 메뉴</div><br/>
	       <div class='price' id='price2_1'>소비자가격 : 20000원</div><br/>
	       <input type='checkbox' name='check' value='달콤허니 오리지날'/>선택 
		   <hr/>
		   
          <img src='../img/honey combo.png' width='240px' height='240px'/>
	       <div class='subject' id='productName2_2'><a>달콤허니콤보</a><br/></div>
	       <div class='menuInfo' id='menuInfo2_2'>달콤바삭한 맛이 일품인 한 마리 치킨</div><br/>
	       <div class='price' id='price2_2'>소비자가격 : 16000원</div><br/>
	       <input type='checkbox' name='check' value='달콤허니콤보'/>선택 
     	   <hr/>
		   
	    </div>
	    
		<div id="category_3" class="tab-content">
          <img src='../img/red original.png' width='240px' height='240px'/>
	       <div class='subject' id='productName3_1'><a>매콤레드 오리지날</a><br/></div>
	       <div class='menuInfo' id='menuInfo3_1'>국내산 청양 홍고추의 매콤함이 일품인 매콤레드 오리지날</div><br/>
	       <div class='price' id='price3_1'>소비자가격 : 17000원</div><br/>
		   <input type='checkbox' name='check' value='매콤레드 오리지날'/>선택 
		   <br/>
		   <hr/>
		   
          <img src='../img/red wing.png' width='240px' height='240px'/>
	       <div class='subject' id='productName3_2'><a>매콤레드 윙</a><br/></div>
	       <div class='menuInfo' id='menuInfo3_2'>국내산 청양 홍고추의 매콤함이 골고루 밴 쫄깃한 날개와 봉의 만남</div><br/>
	       <div class='price' id='menuInfo3_2'>소비자가격 : 20000원</div><br/>
		   <input type='checkbox' name='check' value='매콤레드 윙'/>선택 
		   <br/>
		   <hr/>
	    </div>
	   
	    
		<div id="category_4" class="tab-content">
		  <img src='../img/cheese stick.jfif' width='240px' height='240px'/>
	       <div class='subject' id='productName4_1'><a>치즈스틱</a></div><br/>
	       <div class='price' id='price4_1'>소비자가격 :2500원</div><br/>
		   <input type='checkbox' name='check' value='치즈스틱'/>선택 
		   <br/>
		   <hr/>
		   
		  <img src='../img/cheese ball.jfif' width='240px' height='240px'/>
	       <div class='subject' id='productName4_2'><a>치즈볼</a></div><br/>
	       <div class='price' id='price4_2'>소비자가격 : 3000원</div><br/>
		   <input type='checkbox' name='check' value='치즈볼'/>선택 
		   <br/>
		   <hr/>
	    </div>
	    
		<div id="category_5" class="tab-content">
		  <img src='../img/coke.jfif' width='240px' height='240px'/>
	       <div class='subject' id='productName5_1'><a>콜라</a></div><br/>
	       <div class='price' id='price5_1'>소비자가격 : 2000원</div><br/>
		   <input type='checkbox' name='check' value='콜라'/>선택 
		   <br/>
		   <hr/>
		   
		   <img src='../img/cider.jfif' width='240px' height='240px'/>
	       <div class='subject' id='productName5_2'><a>사이다</a></div><br/>
	       <div class='price' id='price5_2'>소비자가격 : 2000원</div><br/>
		   <input type='checkbox' name='check' value='사이다'/>선택 
		   <br/>
		   <hr/>
		   
		   <div id="testdiv" onclick="check()">
		     <img src='../img/fanta.jfif' width='240px' height='240px'/>
	      	 <div class='subject' id='productName5_3'><a>환타</a></div><br/>
	      	 <div class='price' id='price5_3'>소비자가격 : 2000원</div><br/>
		  	 <input type='checkbox' name='check' value='환타'/>선택 
		   	 <br/>
		   	 <hr/>
		   </div>
		 
	    </div>
	    </div>
	    </form>
	    <button type='button' id='button' onclick='test()'>버튼</button>
	    <a href='bagBtn'><button type='button' class='bagBtn'>장바구니</button></a>


</body>


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>

<script>



/*
if (typeof window === 'object') {
	// Check if document is finally loaded
	   document.addEventListener("DOMContentLoaded", function () {
	       alert('Finished loading')
	     });
	  }
*/	  
$(document).ready(function(){
	
	$('ul.tabs li').click(function(){
		var tab_id = $(this).attr('data-tab');
		
		$('ul.tabs li').removeClass('current'); //선택된 탭의 css 제거
		$('.tab-content').removeClass('current');
		
		$(this).addClass('current'); //선택된 탭의 css를 씌운다
		$("#"+tab_id).addClass('current');
		
	});
});

/*
function test(){
	//var check_arr = document.getElementsByName("check");
	var check_arr = $("input[name='check']");	
	var check_data = [];
	

	if(check_arr.checked == true){
		
		for(var i=0; i<check_arr.length; i++){
				check_data.push(check_arr[i].value);
			}
		for(var j=0; j<check_data.length; j++){
			console.log(check_data[j]);
			}
		}	
	}
*/
function check(){
	let div = document.getElementById('testdiv').children
	console.log(div)
	
	div.check.checked="true"
	test();
}


function test(){
	var value = document.getElementsByName("check");
	var valueOfvalue =[]
	for(let i =0 ; i< value.length;i++){
		if(value[i].checked == true){
			valueOfvalue[i]= value[i].value	
		}
		 
	}

	let form = document.createElement('form')
	form.action ="bagBtn"
	form.name="jmenu"
	form.method="post"
	
	let valueinput = document.createElement('input')
	valueinput.setAttribute("name","values")
	valueinput.setAttribute("type","hidden")
	valueinput.setAttribute("value",valueOfvalue)
	
	form.appendChild(valueinput);
    document.body.appendChild(form);
    
    form.submit();
}


</script>
</html>