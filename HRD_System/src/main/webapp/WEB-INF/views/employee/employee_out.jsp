<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
<%@ include file = "employee_sub_menu.jsp" %>

<c:choose>
	<c:when test = "${empty sessionScope.loginUser}">
		<h4 style="text-align:right;">
			로그인이 안되어있는 상태입니다.
		</h4>
	</c:when>
	<c:otherwise>
		<h4 style="text-align:right;">
			${sessionScope.loginUser.employee_name} 님이 로그인하셨습니다.
			(<a href = "employee_logout">로그아웃하기</a>)
		</h4>
	</c:otherwise>
</c:choose>

<div id = "Hrd_System_Main">
	<a href = "index">
		<img src = "images/Hrd_System_User.jpg" width = "1450px" height = "200px"
		style = "margin-left : 40px; margin-top : 30px">
	</a>
</div>

<article>
<form name = "frm" method = "post" id = "employee_out" action = "employee_out">
<h3>회원 탈퇴</h3>
<%--
<table id = "employee_out">
	<tr>
		<td>이름</td>
		<td><input type = "text" name = "employee_name" value = "${employeeVO.employee_name}" size = "30"></td>
		<td>성별</td>
		<td><input type = "text" name = " employee_gender" value = "${employeeVO.employee_gender}" size = "30"></td>
	</tr>
	<tr>
		<td>나이</td>
		<td><input type = "text" name = "employee_age" value = "${employeeVO.employee_age}" size = "30"></td>
		<td>혈액형</td>
		<td><input type = "text" name = "employee_blood_type" value = "${employeeVO.employee_blood_type}" size = "30"></td>
	</tr>
	<tr>
		<td>주소</td>
		<td colspan = "3"><input type = "text" name = "employee_live" value = "${employeeVO.employee_live}" size = "86"></td>
	</tr>
	<tr>
		<td>직책</td>
		<td><input type = "text" name = "employee_position" value = "${employeeVO.employee_position}" size = "30"></td>
		<td>부서</td>
		<td><input type = "text" name = "employee_department" value = "${employeeVO.employee_department}" size = "30"></td>
	</tr>
	<tr>
		<td>자기소개</td>
		<td colspan = "4">
			<textarea name = "employee_self_introduction" rows = "10" cols = "90">
				${employeeVO.employee_self_introduction}
			</textarea>
		</td>
	</tr>
</table>
--%>

<fieldset>
	<legend>회원 탈퇴</legend>
	<label>이름</label>
	<input type = "text" id = "employee_out_input" value = "${employeeVO.employee_gender}" readonly = "readonly"> <br>
	<label>성별</label>
	<input type = "text" id = "employee_out_input" value = "${employeeVO.employee_gender}" readonly = "readonly"> <br>
	<label>나이</label>
	<input type = "text" id = "employee_out_input" value = "${employeeVO.employee_age}" readonly = "readonly"> <br>
	<label>혈액형</label>
	<input type = "text" id = "employee_out_input" value = "${employeeVO.employee_blood_type}" readonly = "readonly"> <br>
	<label>주소</label>
	<input type = "text" id = "employee_out_input" value = "${employeeVO.employee_live}" readonly = "readonly"> <br>
	<label>직책</label>
	<input type = "text" id = "employee_out_input" value = "${employeeVO.employee_position}" readonly = "readonly"> <br>
	<label>부서</label>
	<input type = "text" id = "employee_out_input" value = "${employeeVO.employee_department}" readonly = "readonly"> <br>
	<label>자기소개</label>
	<textarea rows="10" cols="55" readonly = "readonly"></textarea>
</fieldset>


<div id = "buttons">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='mymenu'">
	<input type = "submit" value = "회원탈퇴" class = "submit">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>




