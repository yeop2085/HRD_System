<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "chart_sub_menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src = "js/jqeury-3.4.1.min.js"></script>
<script type="text/javascript" src = "https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	
	google.charts.load('current', {'packages':['corechart']});
	google.charts.setOnLoadCallback(drawChart);
	google.charts.setOnLoadCallback(drawBar);
	
	function drawChart() {
		
		var data = google.visualization.arrayToDataTable([  
			['Task', 'Hours per Day'],
			['징계기록 없는 사람', ${getChartDisciplinaryNo}],
			['징계기록 있는 사람', ${getChartDisciplinaryYes}]
		]);
		
		var options = {
			title: '전체 사원중 징계기록 있는 사원 비율'
		};
		
		var chart = new google.visualization.PieChart(document.getElementById('piechart'));
		
		chart.draw(data, options);
	}
	
	function drawBar() {
        var data_bar = google.visualization.arrayToDataTable([
      	['전체 사원중 징계기록 있는 사원 비율', '전체 사원중 징계기록 있는 사원 비율'],
      		['징계기록 없는 사람', ${getChartDisciplinaryNo}],
			['징계기록 있는 사람', ${getChartDisciplinaryYes}]
        ]);
    
    	var options_bar = {
    		title: '직급별 사원 비중'
    	};
    	
    	var chart_bar = new google.visualization.BarChart(document.getElementById("barchart_values"));
      chart_bar.draw(data_bar, options_bar);
    }
	
	
	
	
</script>

</head>
<body>
	
	<c:choose>
	<c:when test = "${empty sessionScope.loginAdmin}">
		<h4 style = "text-align : right;">
			로그인이 안되어있는 상태입니다.
		</h4>
	</c:when>
	<c:otherwise>
		<h4 style = "text-align : right;">
			${sessionScope.loginAdmin.hrd_admin_name} 님이 로그인하셨습니다.
			(<a href = "admin_logout">로그아웃하기</a>)
		</h4>
	</c:otherwise>
	</c:choose>
	
	<div id = "chart" align = "left">
	<div id = "Hrd_System_Main">
		<a href = "admin_index">
			<img src = "images/Hrd_System_Main.jpg" width = "1450px" height = "200px"
			style = "margin-left : 40px; margin-top : 30px; ">
		</a>
	</div>
	
	<h1> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		전체 사원중 징계기록 있는 사원 비율
	</h1>
		<table>
			<tr>
				<td><div id = "piechart" style = "border:1px solid #ccc"></div></td>
				<td><div id="barchart_values" style="border:1px solid #ccc"></div></td>
			</tr>
		</table>
		
		<div id = "buttons">
    		<input type = "button" value = "직급별 사원수" class = "submit" onclick="location.href='employee_position'">
			<input type = "button" value = "도시별 사원수" class = "submit" onclick="location.href='employee_city'">
			<input type = "button" value = "징계 비율" class = "submit" onclick="location.href='disciplinary_count'">
			<input type = "button" value = "연차 사유" class = "submit" onclick="location.href='vacation_reason_search'">
			<input type = "button" value = "급여금" class = "submit" onclick="location.href='salary_amount'">
			<input type = "button" value = "은퇴금" class = "submit" onclick="location.href='retirement_percent'">
			<input type = "button" value = "돌아가기" class = "cancel" onclick="location.href='admin_index'">	
		</div>
		
	</div>
</body>
</html>


