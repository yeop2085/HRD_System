<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header.jsp</title>
<link href = "css/main.css" rel = "stylesheet">
<script type="text/javascript" src="script/main.js"></script>
<script type="text/javascript" src="script/disciplinary.js"></script>
<script type="text/javascript" src="script/employee.js"></script>
<script type="text/javascript" src="script/hrd_admin.js"></script>
<script type="text/javascript" src="script/information.js"></script>
<script type="text/javascript" src="script/live.js"></script>
<script type="text/javascript" src="script/retirement.js"></script>
<script type="text/javascript" src="script/salary.js"></script>
<script type="text/javascript" src="script/vacation.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	
	google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);
    
    function drawChart() {
		
      var data = google.visualization.arrayToDataTable([
        ['Task', 'Hours per Day'],
        ['사원',     ${getChartEmployee}],
        ['대리',     ${getChartAssistantManager}],
        ['과장',  ${getChartSectionChief}],
        ['차장', 	${getDeputyDepartmentHead}],
        ['부장',    ${getDepartmentHead}]
      ]);
		
      var options = {
        title: '직급별 사원 비중'
      };
		
      var chart = new google.visualization.PieChart(document.getElementById('piechart'));

      chart.draw(data, options);
    }
	
</script>

</head>

<body>
<br>
<h1 style="text-align:center;">사원창 메인화면</h1>
<br>
<hr>

<div class = "clear"></div>

<header>
	<div id = "header">
		<ul>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "information">공지사항</a>
				</div>
				<div class = "dropdown-content">
					<a href = "information">공지사항 리스트</a>
					<a href = "information_write">공지사항 쓰기</a>
				</div>
			</li>
			<li class = "dropdown">
				<a href = "hrd_admin">인사관리</a>
			</li>
			<li class = "dropdown">
				<a href = "disciplinary">근태정보</a>
			</li>
			<li class = "dropdown">
				<a href = "salary">급여정보</a>
			</li>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "basic_information">기본정보</a>
				</div>
				<div class = "dropdown-content">
					<a href = "organization_information">조직 정보</a>
					<a href = "salary_information">급여 기준 정보</a>
					<a href = "work_information">근태 정보</a>
				</div>
			</li>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "mymenu">내정보</a>
				</div>
				<div class = "dropdown-content">
					<a href = "employee_menu">나의 정보</a>
					<a href = "employee_join">회원가입</a>
					<a href = "employee_idpwd_search">아이디 비밀번호 찾기</a>
					<a href = "employee_out">회원탈퇴</a>
				</div>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "chart">현황</a>
				</div>
			</li>
		</ul>
	</div>
</header>

<div class = "clear"></div>
