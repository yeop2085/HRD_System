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
<form name = "frm" method = "post" action = "vacation_detail" id = "vacation_detail">
	<h2>연차 정보 메뉴</h2> <br>
	<fieldset>
		<legend>연차 정보</legend>
		<label>연차 번호</label>
		<input type = "text" id = "vacation_detail_input" name = "vacation_number"
		value = "${vacationVO.vacation_number}" readonly = "readonly"><br>
		<label>아이디</label>
		<input type = "text" id = "vacation_detail_input" name = "employee_id"
		value = "${vacationVO.employee_id}" readonly = "readonly"><br>
		<label>연차 사유</label>
		<input type = "text" id = "vacation_detail_input" name = "vacation_reason"
		value = "${vacationVO.vacation_reason}" readonly = "readonly"><br>
		<label>연차 날짜</label>
		<fmt:formatDate value="${vacationVO.vacation_regdate}"/><br>
	</fieldset>
	
	<div id = "buttons">
		<input type = "button" value = "징계정보" class = "submit" onclick="disciplinary_list_post()">
		<input type = "button" value = "연차관리" class = "submit" onclick="vacation_management_post()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='vacation_management'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

