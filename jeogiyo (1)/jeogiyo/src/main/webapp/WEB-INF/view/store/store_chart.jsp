<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' type='text/css' href='/css/store_sale.css'>
<script src="/js/store_sale.js"></script>
<!--Load the AJAX API-->
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">

      // Load the Visualization API and the corechart package.
      google.charts.load('current', {'packages':['corechart']});

      // Set a callback to run when the Google Visualization API is loaded.
      google.charts.setOnLoadCallback(drawChart);

      // Callback that creates and populates a data table,
      // instantiates the pie chart, passes in the data and
      // draws it.
      function drawChart() {

        // Create the data table.
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Topping');
        data.addColumn('number', 'per won');
        totals = document.getElementsByClassName('totals')[0].value;
        nals = document.getElementsByClassName('nals')[0].value;
        totals = totals.replace("[","");
        totals = totals.replace("]","");
        
        nals = nals.replace("[","");
        nals = nals.replace("]","");
        
        totalsArray = totals.split(',');
        nalsArray = nals.split(",");
 
        let datas =[]
        for(let i = 0 ; i<totalsArray.length;i++){
        	datas[i]= [nalsArray[i], Number(totalsArray[i])]
        }
        
        data.addRows(datas);

        // Set chart options
        var options = {'title':'월 일자별 매출',
                       'width':1000,
                       'height':500};

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    
    </script>
<title>store_orderInput</title>
</head>
<body>
<div id='subject'>매출관리</div>
	<form method='post' name='frm_store_sale' id='frm_store_sale'>
			<input type='date' id="startnal" name="date1" onchange="startday()" value="${date1 }"></input>~
			<input type='date' id="endnal"  name="date2"onchange="endday()" value="${date2 }"></input>
			<button type = 'button' value = 'btn_lookUp' name = 'lookUp' onclick="find2(this.form)">조회</button><br/>
	</form>
	<div id='left_area'>
		<div id='storeName' name="storeName">${stn }</div>
		<div id='left_area_dateSales'>
			<label>판매 기간</label><br/>
			<input type='text' readonly value='${date1}' id="startdate"><br/>~<br/>
			<input type='text' readonly value='${date2}' id="enddate"><br/>
		
		</div>	
	</div>
	<div id='right_area'>
		<div id='wrap'>
			<!--Div that will hold the pie chart-->
	  	  	<div id="chart_div"></div>
	   	  	<input type="hidden" class="nals" value="${nals}">
	   	  	<input type="hidden" class="totals" value="${totals}">
	    </div>
    </div>
</body>
</html>