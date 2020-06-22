<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "vacation_sub_menu.jsp" %>

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
<form action = "vacation_enroll_post" id = "vacation_enroll_post" method = "post" name = "frm">
<h3>연차정보 등록하기</h3> <br>
	<fieldset>
		<legend>연차정보 등록</legend>
		<label>아이디</label>
		<input type = "text" id = "vacation_enroll_input" name = "employee_id">
		<input type = "hidden" name = "reid">
		<input type = "button" value = "아이디 확인" onclick="return vacation_id_confirm()"> <br>
		<label>연차 사유</label>
		<input type = "text" id = "vacation_enroll_input" name = "vacation_reason"><br>
	</fieldset>
	
	<div id = "buttons">
		<input type = "submit" value = "연차정보등록" class = "submit" onclick="return vacation_enroll_post()">
		<input type = "reset" value = "취소" class = "cancel">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='vacation_management'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

