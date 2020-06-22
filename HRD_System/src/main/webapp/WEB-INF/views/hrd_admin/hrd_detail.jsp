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
<form name = "frm" method = "post" action = "hrd_detail" id = "hrd_detail" enctype="multipart/form-data">
	<table>
		<tr>
			<td>
				<h2>인사 정보 메뉴</h2><br>
				<fieldset>
					<legend>인사 정보</legend>
					<input type = "hidden" name = "employee_id" id = "hrd_detail_input" value = "${employeeVO.employee_id}" readonly = "readonly">
					<label>이름</label>
					<input type = "text" name = "employee_name" id = "hrd_detail_input" value = "${employeeVO.employee_name}" readonly = "readonly"><br>
					<label>성별</label>
					<input type = "text" name = "employee_gender" id = "hrd_detail_input" value = "${employeeVO.employee_gender}" readonly = "readonly"><br>
					<label>나이</label>
					<input type = "text" name = "employee_age" id = "hrd_detail_input" value = "${employeeVO.employee_age}" readonly = "readonly"><br>
					<label>혈액형</label>
					<input type = "text" name = "employee_blood_type" id = "hrd_detail_input" value = "${employeeVO.employee_blood_type}" readonly = "readonly"><br>
					<label>주소</label>
					<input type = "text" name = "employee_live" id = "hrd_detail_input" value = "${employeeVO.employee_live}" readonly = "readonly"><br>
					<label>직책</label>
					<input type = "text" name = "employee_position" id = "hrd_detail_input" value = "${employeeVO.employee_position}" readonly = "readonly"><br>
					<label>부서</label>
					<input type = "text" name = "employee_department" id = "hrd_detail_input" value = "${employeeVO.employee_department}" readonly = "readonly"><br><br>
					<label>사진</label>	
					<img src = "images/${employeeVO.employee_and_so_on}" width = "200" height = "200"><br>
				</fieldset>	
			</td>
		</tr>
	</table>
	
	<div id = "buttons">
		<input type = "button" value = "인사정보" class = "submit" onclick="hrd_information()">
		<input type = "button" value = "인사등록" class = "submit" onclick="hrd_enrollment()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='hrd_information'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
