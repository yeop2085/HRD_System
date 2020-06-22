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
<form name = "frm" method = "post" action = "disciplinary_delete">
<table id = "disciplinary_delete">
	<tr>
		<th>징계번호</th>
		<td><input type = "text" name = "disciplinary_number" value = "${disciplinaryVO.disciplinary_number}" readonly = "readonly"></td>
	</tr>
	<tr>
		<th>아이디</th>
		<td><input type = "text" name = "employee_id" value = "${disciplinaryVO.employee_id}" readonly = "readonly"></td>
	</tr>
	<tr>
		<th>기타</th>
		<td><input type = "text" name = "disciplinary_and_so_on" value = "${disciplinaryVO.disciplinary_and_so_on}" readonly = "readonly"></td>
	</tr>
	<tr>
		<th>징계사유</th>
		<td><input type = "text" name = "disciplinary_reason" value = "${disciplinaryVO.disciplinary_reason}" readonly = "readonly"></td>
	</tr>
	<tr>
		<th>날짜</th>
		<td><fmt:formatDate value="${disciplinaryVO.disciplinary_regdate}"/></td>
	</tr>	
</table>

<div id = "buttons">
	<input type = "submit" value = "삭제하기" class = "submit">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='disciplinary_list'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
