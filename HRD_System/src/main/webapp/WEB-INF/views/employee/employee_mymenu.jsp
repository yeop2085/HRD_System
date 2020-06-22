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
<form name = "frm" method = "post" id = "employee_mymenu" action = "employee_update" enctype="multipart/form-data">
<h3>나의 정보</h3>

<fieldset>
	<legend>나의 정보</legend>
	<label>이름</label>
	<input type = "text" id = "employee_mymenu_input" value = "${employeeVO.employee_name}" readonly = "readonly"> <br>
	<label>성별</label>
	<input type = "text" id = "employee_mymenu_input" value = "${employeeVO.employee_gender}" readonly = "readonly"> <br>
	<label>나이</label>
	<input type = "text" id = "employee_mymenu_input" value = "${employeeVO.employee_age}" readonly = "readonly"> <br>
	<label>혈액형</label>
	<input type = "text" id = "employee_mymenu_input" value = "${employeeVO.employee_blood_type}" readonly = "readonly"> <br>
	<label>주소</label>
	<input type = "text" id = "employee_mymenu_input" value = "${employeeVO.employee_live}" readonly = "readonly"> <br>
	<label>직책</label>
	<input type = "text" id = "employee_mymenu_input" value = "${employeeVO.employee_position}" readonly = "readonly"> <br>
	<label>부서</label>
	<input type = "text" id = "employee_mymenu_input" value = "${employeeVO.employee_department}" readonly = "readonly"> <br>
	<label>자기소개</label>
	<textarea rows = "8" cols = "55"></textarea> <br>
	<label>사진</label>
	<img src = "images/${employeeVO.employee_and_so_on}" width = "200" height = "200"> <br>
	
</fieldset>


<div id = "buttons">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='mymenu'">
	<input type = "submit" class = "submit" value = "수정">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>



