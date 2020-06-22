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
<form name = "frm" method = "post" action = "salary_delete">
<table id = "salary_delete">
	<tr>
		<th>급여번호</th>
		<td><input type = "text" name = "salary_number" value = "${salaryVO.salary_number}" readonly = "readonly"></td>
	</tr>
	<tr>
		<th>아이디</th>
		<td><input type = "text" name = "employee_id" value = "${salaryVO.employee_id}" readonly = "readonly"></td>
	</tr>
	<tr>
		<th>기타</th>
		<td><input type = "text" name = "employee_and_so_on" value = "${salaryVO.employee_and_so_on}" readonly = "readonly"></td>
	</tr>
	<tr>
		<th>봉급</th>
		<td><input type = "text" name = "employee_salary" value = "${salaryVO.employee_salary}" readonly = "readonly"></td>
	</tr>
	<tr>
		<th>근무기간</th>
		<td><input type = "text" name = "employee_work_period" value = "${salaryVO.employee_work_period}" readonly = "readonly"></td>
	</tr>
</table>

<div id = "buttons">
	<input type = "submit" value = "삭제하기" class = "submit">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='salary_list'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
