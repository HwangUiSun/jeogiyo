<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>MyPage</title>
<link rel = 'stylesheet' type='text/css' href = './css/consumer.css'>
<script src = './js/consumer.js'></script>
</head>
<body>
<div id='MyPage'>
  <h1>������</h1>
  <form name='frm_member' method='post' id='frm_member'>
    <label>���̵�</label>
    <input type='text' name='id' size='15'><br/>
    
    <label>����</label>
    <input type='text' name='mName' size='12'><br/>
    
    
    <label>��й�ȣ</label>
    <input type='password' name='pwd' maxlength='10' autocomplete="none"><br/>
    
    <label>����ó</label>
    <input type='text' name='phone' size='12'><br/>
    
    <label>�����ȣ</label>
    <input type='text' name='zipcode'  size='12'>
    <button type='button' id='btnZipFind'>�����ȣ �˻�</button>
    <br/>
    
    <label>�ּ�</label>
    <input type='text' name='address' size='40' autocomplete="none"><br/>
    
    <label>�̸���</label>
    <input type='text' name='email' size='30'><br/>
    <br/>
    
   <label>��밡�� ����Ʈ</label>
   <input type='text' class='usePoint' value='2000p' readonly/>
   <br/>
   <label>�Ҹ꿹�� ����Ʈ</label>
    <input type='text' class='havePoint' value='2000p' readonly/>
    <br/>
  
  <label></label>
  <a href ='change_1Btn'><button type='button' id='change_1Btn'>�����Ϸ�</button></a>
  <button onclick="javascript:joinOutBtn()">ȸ��Ż��</button>
  <input type='hidden' name='findStr' value='${param.findStr}'/>
  <input type='hidden' name='nowPage' value='${param.nowPage}'/>
  </form>
<script src='js/member.js'></script>
</div>

<script>
  function joinOutBtn(){
		var returnValue = prompt('���� Ż���Ͻðڽ��ϱ�?','��й�ȣ�� �Է��� �ּ���');
	}

</script>
</body>
</html>