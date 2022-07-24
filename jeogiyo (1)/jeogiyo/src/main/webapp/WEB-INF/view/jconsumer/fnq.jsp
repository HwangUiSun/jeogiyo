<%@ taglib prefix = 'c' uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FAQ</title>
<link rel = 'stylesheet' type='text/css' href = 'css/faq.css'>
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
<body>

<div id = 'subject_title'>자주묻는 질문(FAQ)</div>
<div id = faq_line>
<div id=question>
    <div id='subject'>Q.주문은 어디서 할 수 있나요?
    <button id='btnToggle'class='btn' onclick='Toggle()'>확인</button></div><br/>
      <div id='Toggle' style='display:none'>A.주문은 '장바구니'에서 할 수 있습니다.</div><br/>
      <hr/>
</div>

<div id=question_1>
    <div id='subject'>Q.회원가입 후 개명을 했는데 어떻게 하나요?
    <button id='btnToggle_1'class='btn' onclick='Toggle_1()'>확인</button></div><br/>
      <div id='Toggle_1' style='display:none'>A.로그인 후 내 정보>내정보 변경 페이지에서 변경 가능합니다.</div><br/>
      <hr/>
</div>

<div id=question_2>
    <div id='subject'>Q.주문한 메뉴를 변경하거나 취소해야 할 경우네는 어떻게 하나요?
    <button id='btnToggle_2'class='btn' onclick='Toggle_2()'>확인</button></div><br/>
      <div id='Toggle_2' style='display:none'>A.주문 접수 후 바로 주문메이킹이 이루어져 주문 변경이나 취소가 어렵습니다.<br/>
        주문변경이나 취소는 반드시 해당 매장으로 전화하셔야 가능하며,<br/>
        해당매장 전화번호는 주문내역 페이지를 참고해주시기 바랍니다.</div><br/>
      <hr/>
</div>

<div id=question_3>
    <div id='subject'>Q.배달팁은 얼마인가요?
    <button id='btnToggle_3'class='btn' onclick='Toggle_3()'>확인</button></div><br/>
      <div id='Toggle_3' style='display:none'>A.배달팁은 거리와 상관없이 2000원입니다.<br/>
      </div><br/>
      <hr/>
</div>


<div id=question_4>
    <div id='subject'>Q.휴대폰 번호가 변경되어 로그인을 할 수가 없어요.
    <button id='btnToggle_4' class='btn'onclick='Toggle_4()'>확인</button></div><br/>
      <div id='Toggle_4' style='display:none'>A.휴대폰 번호가 변경되어 로그인이 불가능한 경우는(아이디찾기/ 비밀번호 찾기 불가)<br/>
      본사팀에 연락주시기 바랍니다. 정보 확인 후 로그인이 가능하도록 도와드립니다. 로그인 후 휴대폰 번호 변경 부탁드립니다.
      </div><br/>
      <hr/>
</div>

<div id=question_5>
    <div id='subject'>Q.단체주문 결제는 어떻게 해야 하나요?
    <button id='btnToggle_5'class='btn' onclick='Toggle_5()'>확인</button></div><br/>
      <div id='Toggle_5' style='display:none'>A.카드 및 만나서 결제 모두 가능합니다.
      </div><br/>
      <hr/>
</div>

<div id=question_6>
    <div id='subject'>Q.단체 주문은 어떤 업체가 의뢰하고 있나요?
    <button id='btnToggle_6'class='btn' onclick='Toggle_6()'>확인</button></div><br/>
      <div id='Toggle_6' style='display:none'>A.전국적인 사업장을 가지고 있는 기업, 학교, 관광서, 금융권, 제약회사 및 유통업체에서도 다량주문을 이용하고 계십니다.
      </div><br/>
      <hr/>
</div>

<div id=question_7>
    <div id='subject'>Q.주문상태는 어떻게 확인할 수 있나요?
    <button id='btnToggle_7'class='btn' onclick='Toggle_7()'>확인</button></div><br/>
      <div id='Toggle_7' style='display:none'>A.주문내역에서 확인 가능합니다.<br/>
        주문이 완료된 후 매장에서 주문을 접수하고 고객님께서 음식을 받으실 때까지의 단계를 표시 하고 있습니다.
      </div><br/>
      <hr/>
</div>

<div id=question_8>
    <div id='subject'>Q.주문한 내역은 어디서 확인할 수 있나요?
    <button id='btnToggle_8'class='btn' onclick='Toggle_8()'>확인</button></div><br/>
      <div id='Toggle_8' style='display:none'>A.주문내역에서 확인 가능합니다.<br/>
        최근 1년 이내 주문한 내역만 확인 가능합니다.
      </div><br/>
      <hr/>
</div>
</div>
</body>
<script>
function Toggle(){
	var Toggle = document.getElementById('Toggle');
	
	if(Toggle.style.display !== 'none'){
		Toggle.style.display = 'none';
	}else{
		Toggle.style.display = 'block';
	}
}

function Toggle_1(){
	var Toggle_1 = document.getElementById('Toggle_1');
	
	if(Toggle_1.style.display !== 'none'){
		Toggle_1.style.display = 'none';
	}else{
		Toggle_1.style.display = 'block';
	}
}

function Toggle_2(){
	var Toggle_2 = document.getElementById('Toggle_2');
	
	if(Toggle_2.style.display !== 'none'){
		Toggle_2.style.display = 'none';
	}else{
		Toggle_2.style.display = 'block';
	}
}

function Toggle_3(){
	var Toggle_3 = document.getElementById('Toggle_3');
	
	if(Toggle_3.style.display !== 'none'){
		Toggle_3.style.display = 'none';
	}else{
		Toggle_3.style.display = 'block';
	}
}

function Toggle_4(){
	var Toggle_4 = document.getElementById('Toggle_4');
	
	if(Toggle_4.style.display !== 'none'){
		Toggle_4.style.display = 'none';
	}else{
		Toggle_4.style.display = 'block';
	}
}

function Toggle_5(){
	var Toggle_5 = document.getElementById('Toggle_5');
	
	if(Toggle_5.style.display !== 'none'){
		Toggle_5.style.display = 'none';
	}else{
		Toggle_5.style.display = 'block';
	}
}

function Toggle_6(){
	var Toggle_6 = document.getElementById('Toggle_6');
	
	if(Toggle_6.style.display !== 'none'){
		Toggle_6.style.display = 'none';
	}else{
		Toggle_6.style.display = 'block';
	}
}

function Toggle_7(){
	var Toggle_7 = document.getElementById('Toggle_7');
	
	if(Toggle_7.style.display !== 'none'){
		Toggle_7.style.display = 'none';
	}else{
		Toggle_7.style.display = 'block';
	}
}

function Toggle_8(){
	var Toggle_8 = document.getElementById('Toggle_8');
	
	if(Toggle_8.style.display !== 'none'){
		Toggle_8.style.display = 'none';
	}else{
		Toggle_8.style.display = 'block';
	}
}
</script>
</html>