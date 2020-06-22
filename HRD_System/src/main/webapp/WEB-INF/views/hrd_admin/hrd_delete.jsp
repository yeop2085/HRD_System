<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "hrd_sub_menu.jsp" %>

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
<form name = "frm" method = "post" action = "hrd_delete">
<h2>인사 정보 메뉴</h2>
	<fieldset>
		<legend>인사 정보</legend>
		<input type = "hidden" name = "employee_id" id = "employee_id" value = "${employeeVO.employee_id}">
		<label>이름</label>
		<input type = "text" name = "employee_name" value = "${employeeVO.employee_name}"><br>
		<label>성별</label>
		<input type = "text" name = "employee_gender" value = "${employeeVO.employee_gender}"><br>
		<label>나이</label>
		<input type = "text" name = "employee_age" value = "${employeeVO.employee_age}"><br>
		<label>혈액형</label>
		<input type = "text" name = "employee_blood_type" value = "${employeeVO.employee_blood_type}"><br>
		<label>주소</label>
		<input type = "text" name = "employee_live" value = "${employeeVO.employee_live}"><br>
		<label>직책</label>
		<input type = "text" name = "employee_position" value = "${employeeVO.employee_position}"><br>
		<label>부서</label>
		<input type = "text" name = "employee_department" value = "${employeeVO.employee_department}"><br>
	</fieldset>

	<div id = "buttons">
		<input type = "submit" value = "삭제하기" class = "submit">
		<input type = "button" value = "뒤로가기" class = "submit" onclick="location.href='hrd_information'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
