<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "salary_sub_menu.jsp" %>

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

<div id = "Hrd_System_Main">
	<a href = "admin_index">
		<img src = "images/Hrd_System_Main.jpg" width = "1450px" height = "200px"
		style = "margin-left : 40px; margin-top : 30px">
	</a>
</div>

<article>
<form name = "frm" method = "post" action = "salary_detail_post" id = "salary_detail_post">
	<h2>급여 정보 메뉴</h2> <br>
	<fieldset>
		<legend>급여 정보</legend>
		<label>급여 번호</label>
		<input type = "text" id = "salary_detail_input" name = "salary_number" value = "${salaryVO.salary_number}" readonly = "readonly"><br>
		<label>아이디</label>
		<input type = "text" id = "salary_detail_input" name = "employee_id" value = "${salaryVO.employee_id}" readonly = "readonly"><br>
		<label>기타</label>
		<input type = "text" id = "salary_detail_input" name = "employee_and_so_on" value = "${salaryVO.employee_and_so_on}" readonly = "readonly"><br>
		<label>봉급</label>
		<input type = "text" id = "salary_detail_input" name = "employee_salary" value = "${salaryVO.employee_salary}" readonly = "readonly"><br>
		<label>신청기간</label>
		<input type = "text" id = "salary_detail_input" name = "employee_work_period" value = "${salaryVO.employee_work_period}" readonly = "readonly"><br>
	</fieldset>
	
	<div id = "buttons">
		<input type = "button" value = "급여정보" class = "submit" onclick="salary_list()">
		<input type = "button" value = "퇴직정보" class = "submit" onclick="retirement_information()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='salary_list'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
