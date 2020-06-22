<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "header.jsp" %>

<c:choose>
	<c:when test = "${empty sessionScope.loginUser}">
		<h4 style="text-align:right;">
			로그인이 안되어있는 상태입니다.
		</h4>
	</c:when>
	<c:otherwise>
		<h4 style="text-align:right;">
			${sessionScope.loginUser.employee_name} 님이 로그인하셨습니다.
		</h4>
	</c:otherwise>
</c:choose>

<div class = "clear"></div>
<div id = "Hrd_System_User">
	<a href = "index">
		<img src = "images/Hrd_System_User.jpg" width = "1800px" height = "200px">
	</a>
</div>
<div class = "clear"></div>

<div class = "clear"></div>
<div id = "top_menu">
	<ul>
		<li>
			<a href = "go_information" style = "background-color : #B2EBF4">공지사항 바로가기</a>
			<a href = "information" style = "font-size : 14px; text-align : right;">바로가기</a>
			<table id = "top_menu_information">
			<tr>
				<th style = "background-color : #B2EBF4">번호</th>
				<th style = "background-color : #B2EBF4">제목</th>
				<th style = "background-color : #B2EBF4">작성일</th>
				<th style = "background-color : #B2EBF4">기타</th>
			</tr>
			<c:choose>
			<c:when test = "${informationListSize > 3}">
			<c:forEach items = "${list3Information}" var = "information">
				<tr>
					<td>${information.information_number}</td>
					<td>${information.title}</td>
					<td><fmt:formatDate value="${information.regdate}" type = "date"/>
					<td></td>
				</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>
			<c:forEach items = "${informationList}" var = "information">
				<tr>
					<td>${information.information_number}</td>
					<td>${information.title}</td>
					<td><fmt:formatDate value="${information.regdate}" type = "date"/>
					<td></td>
				</tr>
			</c:forEach>
			</c:otherwise>
			</c:choose>
			</table>
		</li>
		<li>
			<a href = "go_hrd_admin" style = "background-color : #B2EBF4">인사관리 바로가기</a>
			<a href = "hrd_admin" style = "font-size : 14px; text-align : right;">바로가기</a>
			<table id = "top_menu_hrd_information">
			<tr>
				<th style = "background-color : #B2EBF4">이름</th>
				<th style = "background-color : #B2EBF4">직책</th>
				<th style = "background-color : #B2EBF4">나이</th>
				<th style = "background-color : #B2EBF4">부서</th>
				<th style = "background-color : #B2EBF4">기타</th>
			</tr>
			<c:choose>
			<c:when test = "${listAllEmployeeSize > 3}">
			<c:forEach items = "${list3Employee}" var = "employee">
				<tr>
					<td>${employee.employee_name}</td>
					<td>${employee.employee_position}</td>
					<td>${employee.employee_age}</td>
					<td>${employee.employee_department}</td>
					<td>${employee.employee_and_so_on}</td>
				</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>
			<c:forEach items = "${listAllEmployee}" var = "employee">
				<tr>
					<td>${employee.employee_name}</td>
					<td>${employee.employee_position}</td>
					<td>${employee.employee_age}</td>
					<td>${employee.employee_department}</td>
					<td>${employee.employee_and_so_on}</td>
				</tr>
			</c:forEach>
			</c:otherwise>
			</c:choose>
			</table>
		</li>
		<li>
			<c:choose>
			<c:when test = "${empty sessionScope.loginUser}">	
				<form method = "post" name = "frm">
				<table id = "login">
				<tr>
					<th colspan = "4" style = "background-color : #B2EBF4">사원 로그인창</th>
				</tr>
				<tr>
					<td style = "background-color : #B2EBF4">ID</td>
					<td colspan = "2"><input type = "text" name = "employee_id"></td>
					<td><input type = "button" value = "사원로그인" class = "login_submit" onclick="employee_login()"></td>
				</tr>
				<tr>
					<td style = "background-color : #B2EBF4">PW</td>
					<td colspan = "2"><input type = "password" name = "employee_pwd"></td>
					<td><input type = "button" value = "로그아웃" class = "login_submit" onclick="employee_logout()"></td>
				</tr>
				<tr>
					<td><input type = "button" value = "회원가입" class = "login_submit" onclick="employee_join_main()">
					<td><input type = "button" value = "ID/PW찾기" class = "login_submit" onclick="employee_id_pwd_search_main()"></td>
					<td><input type = "button" value = "사원창으로 이동" class = "login_submit" onclick="location.href='index'">
					<td><input type = "button" value = "관리자창으로 이동" class = "login_submit" onclick="location.href='admin_index'">
				</tr> 
				</table>
				</form>	
			</c:when>
			<c:otherwise>
				<form method = "post" name = "frm">
				<table id = "login">
				<tr>
					<th colspan = "4" style = "background-color : #B2EBF4">사원 로그인창</th>
				</tr>
				<tr>
					<td colspan = "4">${sessionScope.loginUser.employee_name} 님이 로그인하셨습니다.</td>
				</tr>
				<tr>
					<td colspan = "3">환영합니다.</td>
					<td><input type = "button" value = "로그아웃" class = "login_submit" onclick="employee_logout()"></td>
				</tr>
				<tr>
					<td><input type = "button" value = "회원가입" class = "login_submit" onclick="employee_join_main()">
					<td><input type = "button" value = "ID/PW찾기" class = "login_submit" onclick="employee_id_pwd_search_main()"></td>
					<td><input type = "button" value = "사원창으로 이동" class = "login_submit" onclick="location.href='index'">
					<td><input type = "button" value = "관리자창으로 이동" class = "login_submit" onclick="location.href='admin_index'">
				</tr> 
				</table>
				</form>		
			</c:otherwise>
			</c:choose>
		</li>
	</ul>
</div>
<div class = "clear"></div>

<div class = "clear"></div>
<div id = "botton_menu">
	<ul>
		<li>
			<a href = "go_disciplinary" style = "background-color : #B2EBF4">근태정보 바로가기</a>
			<a href = "disciplinary" style = "font-size : 14px; text-align : right;">바로가기</a>
			<table id = "botton_menu_disciplinary_list">
			<tr>
				<th style = "background-color : #B2EBF4">징계번호</th>
				<th style = "background-color : #B2EBF4">아이디</th>
				<th style = "background-color : #B2EBF4">기타</th>
				<th style = "background-color : #B2EBF4">징계사유</th>
			</tr>
			<c:choose>
			<c:when test = "${disciplinaryListSize > 3}">
			<c:forEach items = "${list3Disciplinary}" var = "disciplinary">
				<tr>
					<td>${disciplinary.disciplinary_number}</td>
					<td>${disciplinary.employee_id}</td>
					<td>${disciplinary.disciplinary_and_so_on}</td>
					<td>${disciplinary.disciplinary_reason}</td>
				</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>
			<c:forEach items = "${disciplinaryList}" var = "disciplinary">
				<tr>
					<td>${disciplinary.disciplinary_number}</td>
					<td>${disciplinary.employee_id}</td>
					<td>${disciplinary.disciplinary_and_so_on}</td>
					<td>${disciplinary.disciplinary_reason}</td>
				</tr>
			</c:forEach>
			</c:otherwise>
			</c:choose>	
			</table>
		</li>
		<li>
			<a href = "go_salary" style = "background-color : #B2EBF4">급여정보 바로가기</a>
			<a href = "salary" style = "font-size : 14px; text-align : right;">바로가기</a>
			<table id = "botton_menu_salary_list">
			<tr>
				<th style = "background-color : #B2EBF4">급여번호</th>
				<th style = "background-color : #B2EBF4">아이디</th>
				<th style = "background-color : #B2EBF4">직원봉급</th>
				<th style = "background-color : #B2EBF4">근무기간</th>
			</tr>
			<c:choose>
			<c:when test = "${salaryListSize > 3}">
			<c:forEach items = "${list3Salary}" var = "salary">
				<tr>
					<td>${salary.salary_number}</td>
					<td>${salary.employee_id}</td>
					<td>${salary.employee_salary}</td>
					<td>${salary.employee_work_period}</td>
				</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>
			<c:forEach items = "${salaryList}" var = "salary">
				<tr>
					<td>${salary.salary_number}</td>
					<td>${salary.employee_id}</td>
					<td>${salary.employee_salary}</td>
					<td>${salary.employee_work_period}</td>
				</tr>
			</c:forEach>
			</c:otherwise>
			</c:choose>
			</table>
		</li>
		<li>
			<a href = "chart">현황</a>
			<table id = "botton_menu_chart">
				<tr>
					<td><div id = "piechart" style = "border : 1px solid #ccc"></div></td>
				</tr>
			</table>
		</li>
	</ul>
</div>
<div class = "clear"></div>


<div class = "clear"></div>
<div id = "botton_menu">
	<ul>
		<li>
			<a href = "vacation_management" style = "background-color : #B2EBF4">연차정보</a>
			<a href = "vacation_management" style = "font-size : 14px; text-align : right;">바로가기</a>
			<table id = "botton_menu_vacation_management">
			<tr>
				<th style = "background-color : #B2EBF4">징계번호</th>
				<th style = "background-color : #B2EBF4">아이디</th>
				<th style = "background-color : #B2EBF4">기타</th>
				<th style = "background-color : #B2EBF4">징계사유</th>
			</tr>
			<c:choose>
			<c:when test = "${vacationListSize > 3}">
			<c:forEach items = "${list3Vacation}" var = "vacation">
				<tr>
					<td>${vacation.vacation_number}</td>
					<td>${vacation.employee_id}</td>
					<td>${vacation.vacation_reason}</td>
					<td>${vacation.vacation_regdate}</td>
				</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>
				<c:forEach items = "${vacationList}" var = "vacation">
				<tr>	
					<td>${vacation.vacation_number}</td>
					<td>${vacation.employee_id}</td>
					<td>${vacation.vacation_reason}</td>
					<td>${vacation.vacation_regdate}</td>
				</tr>	
				</c:forEach>
			</c:otherwise>
			</c:choose>
			</table>
		</li>
		<li>
			<a href = "retirement_information" style = "background-color : #B2EBF4">퇴직정보</a>
			<a href = "retirement_information" style = "font-size : 14px; text-align : right;">바로가기</a>
			<table id = "botton_menu_retirement_information">
			<tr>
				<th style = "background-color : #B2EBF4">급여번호</th>
				<th style = "background-color : #B2EBF4">아이디</th>
				<th style = "background-color : #B2EBF4">직원봉급</th>
				<th style = "background-color : #B2EBF4">근무기간</th>
			</tr>
			<c:choose>
			<c:when test = "${retirementListSize > 3}">
			<c:forEach items = "${list3Retirement}" var = "retirement">
				<tr>
					<td>${retirement.retirement_number}</td>
					<td>${retirement.employee_id}</td>
					<td>${retirement.retirement_salary}</td>
					<td>${retirement.retirement_retire}</td>
				</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>
			<c:forEach items = "${retirementList}" var = "retirement">
				<tr>	
					<td>${retirement.retirement_number}</td>
					<td>${retirement.employee_id}</td>
					<td>${retirement.retirement_salary}</td>
					<td>${retirement.retirement_retire}</td>
				</tr>
			</c:forEach>
			</c:otherwise>
			</c:choose>
			</table>	
		</li>
	</ul>
</div>
<div class = "clear"></div>


<%@ include file = "footer.jsp" %>



