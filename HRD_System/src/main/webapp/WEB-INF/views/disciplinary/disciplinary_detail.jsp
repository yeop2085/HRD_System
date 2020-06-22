<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "disciplinary_sub_menu.jsp" %>

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
<form name = "frm" method = "post" action = "disciplinary_detail" id = "disciplinary_detail">
	<h2>징계 정보 메뉴</h2> <br>
	<fieldset>
		<legend>징계 정보</legend>
		<label>징계 번호</label>
		<input type = "text" id = "disciplinary_detail_input" name = "disciplinary_number" 
		value = "${disciplinaryVO.disciplinary_number}" readonly = "readonly"> <br>
		<label>아이디</label>
		<input type = "text" id = "disciplinary_detail_input" name = "employee_id" 
		value = "${disciplinaryVO.employee_id}" readonly = "readonly"> <br>
		<label>기타 정보</label>
		<input type = "text" id = "disciplinary_detail_input" name = "disciplinary_and_so_on"
		value = "${disciplinaryVO.disciplinary_and_so_on}" readonly = "readonly"> <br>
		<label>징계 사유</label>
		<input type = "text" id = "disciplinary_detail_input" name = "disciplinary_reason"
		value = "${disciplinaryVO.disciplinary_reason}" readonly = "readonly"> <br>
		<label>징계 날짜</label>
		<fmt:formatDate value="${disciplinaryVO.disciplinary_regdate}"/> <br>
	</fieldset>
	
	<div id = "buttons">
		<input type = "button" value = "징계정보" class = "submit" onclick="disciplinary_list_post()">
		<input type = "button" value = "연차관리" class = "submit" onclick="vacation_management_post()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='disciplinary_list'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
