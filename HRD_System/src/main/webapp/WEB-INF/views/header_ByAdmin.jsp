<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>headerByAdmin.jsp</title>
<link href = "css/main.css" rel = "stylesheet">
<script type="text/javascript" src = "script/main.js"></script>
<script type="text/javascript" src = "script/disciplinary.js"></script>
<script type="text/javascript" src = "script/employee.js"></script>
<script type="text/javascript" src = "script/hrd_admin.js"></script>
<script type="text/javascript" src = "script/information.js"></script>
<script type="text/javascript" src = "script/live.js"></script>
<script type="text/javascript" src = "script/retirement.js"></script>
<script type="text/javascript" src = "script/salary.js"></script>
<script type="text/javascript" src = "script/vacation.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	
	google.charts.load('current', {'packages':['corechart']});
	// google.charts.load('current', {packages:["orgchart"]});
    google.charts.setOnLoadCallback(drawChart);
    // google.charts.setOnLoadCallback(drawChart1);
    
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
    
    <%--
    function drawChart1() {
        var data1 = new google.visualization.DataTable();
        data1.addColumn('string', 'Name');
        data1.addColumn('string', 'Manager');
        data1.addColumn('string', 'ToolTip');
	
        // For each orgchart box, provide the name, manager, and tooltip to show.
        data1.addRows([
          [{'v':'인사급여 관리시스템', 'f':'인사급여 관리시스템'},
           '', 'The President'],
          [{'v':'기본정보', 'f':'기본정보'},
               '인사급여 관리시스템', 'VP'],
          [{'v':'인사관리', 'f':'인사관리'},
               '인사급여 관리시스템', 'VP'], 
          [{'v':'근태관리', 'f':'근태관리'},
               '인사급여 관리시스템', 'VP'],
          [{'v':'급여관리', 'f':'급여관리'},
               '인사급여 관리시스템', 'VP'],
          [{'v':'내정보', 'f':'내정보'},
               '인사급여 관리시스템', 'VP'],    
          ['조직정보', '기본정보', 'Bob Sponge'],
          ['급여기준정보', '조직정보', ''],
          ['근태기준정보', '급여기준정보', ''],
          ['인사정보', '인사관리', 'Bob Sponge'],
          ['인사등록/삭제', '인사정보', ''],
          ['근태정보', '근태관리', 'Bob Sponge'],
          ['연차관리', '근태정보', ''],
          ['급여정보', '급여관리', 'Bob Sponge'],
          ['퇴직정보', '급여정보', ''],
          ['나의정보', '내정보', 'Bob Sponge'],
          ['가입/탈퇴', '나의정보', ''],
        ]);
		
        // Create the chart.
        var chart1 = new google.visualization.OrgChart(document.getElementById('chart_div'));
        // Draw the chart, setting the allowHtml option to true for the tooltips.
        chart1.draw(data1, {'allowHtml':true});
    }
    --%>
    
	
</script>

</head>

<body>

<h1 style="text-align:center;">관리자창 메인화면</h1>
<hr>

<div class = "clear"></div>

<header>
	<div id = "header">
		<ul>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "information_ByAdmin">공지사항</a>
				</div>
				<div class =  "dropdown-content">
					<a href = "information_ByAdmin">공지사항 리스트</a>
					<a href = "information_writeform_ByAdmin">공지사항 쓰기</a>
				</div>
			</li>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "hrd_admin_ByAdmin">인사관리</a>
				</div>
				<div class = "dropdown-content">
					<a href = "hrd_information">&nbsp;&nbsp;인사 정보&nbsp;&nbsp;</a>
					<a href = "hrd_enrollment">&nbsp;&nbsp;인사 등록&nbsp;&nbsp;</a>
				</div>
			</li>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "disciplinary_ByAdmin">근태정보</a>
				</div>
				<div class = "dropdown-content">
					<a href = "disciplinary_list">&nbsp;&nbsp;징계 정보&nbsp;&nbsp;</a>
					<a href = "vacation_management">&nbsp;&nbsp;연차 관리&nbsp;&nbsp;</a>
				</div>
			</li>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "salary_ByAdmin">급여정보</a>
				</div>
				<div class = "dropdown-content">
					<a href = "salary_list">&nbsp;&nbsp;급여 정보&nbsp;&nbsp;</a>
					<a href = "retirement_information">&nbsp;&nbsp;퇴직 정보&nbsp;&nbsp;</a>
				</div>
			</li>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "basic_information_ByAdmin">기본정보</a>
				</div>
				<div class = "dropdown-content">
					<a href = "organization_information_ByAdmin">조직 정보</a>
					<a href = "salary_information_ByAdmin">급여 기준 정보</a>
					<a href = "work_information_ByAdmin">근태 정보</a>
				</div>
			</li>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "mymenu_ByAdmin">내정보</a>
				</div>
				<div class = "dropdown-content">
					<a href = "hrd_mymenu">나의 정보</a>
					<a href = "hrd_join">회원가입</a>
					<a href = "hrd_idpwd_search">아이디 비밀번호 찾기</a>
					<a href = "hrd_out">회원탈퇴</a>
				</div>
			<li class = "dropdown">
				<div class = "dropdown-menu">
					<a href = "chart_ByAdmin">현황</a>
				</div>
				<div class = "dropdown-content">
					<a href = "employee_position">직급별 사원 수</a>
					<a href = "employee_city">도시별 사원 수</a>
					<a href = "disciplinary_count">징계 비율</a>
					<a href = "vacation_reason_search">연차 사유</a>
					<a href = "salary_amount">급여금</a>
					<a href = "retirement_percent">은퇴금</a>
				</div>
			</li>
		</ul>
	</div>
</header>

<div class = "clear"></div>


