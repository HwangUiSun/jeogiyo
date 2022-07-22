<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
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
<link href="css/index.css" rel="stylesheet">
<body>
<div id="textWrap">
	<div id='consumer'>
		<a href='consumer'>consumer</a>
	</div>
	<div id='storeCenter'>
		<a href='storeCenter'>store/center</a>	
	</div>
</div>
<div id="allWrap">
<div id="wrap">
	<div id="bcome"></div>
	<div id="person"></div>
</div>
</div>
</body>
</html>