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
<form name = "frm" id = "hrd_out" method = "post" action = "hrd_out">
<h3>회원탈퇴</h3><br>
<%--
<table id = "hrd_out">
	<tr>
		<th>아이디</th>
		<td><input type = "text" name = "hrd_admin_id" value = "${hrdAdminVO.hrd_admin_id}" size = "50"></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type = "text" name = "hrd_admin_pwd" value = "${hrdAdminVO.hrd_admin_pwd}" size = "50"></td>
	</tr>
	<tr>
		<th>이름</th>
		<td><input type = "text" name = "hrd_admin_name" value = "${hrdAdminVO.hrd_admin_name}" size = "50"></td>
	</tr>
	<tr>
		<th>전화번호</th>
		<td><input type = "text" name = "hrd_admin_phone" value = "${hrdAdminVO.hrd_admin_phone}" size = "50"></td>
	</tr>
	<tr>
		<th>주소</th>
		<td><input type = "text" name = "hrd_admin_live" value = "${hrdAdminVO.hrd_admin_live}" size = "50"></td>
	</tr>
</table>
--%>

<fieldset>
	<legend>회원탈퇴</legend>
	<label>아이디</label>
	<input type = "text" id = "hrd_out_input" value = "${hrdAdminVO.hrd_admin_id}" readonly = "readonly"> <br>
	<label>비밀번호</label>
	<input type = "text" id = "hrd_out_input" value = "${hrdAdminVO.hrd_admin_pwd}" readonly = "readonly"> <br>
	<label>이름</label>
	<input type = "text" id = "hrd_out_input" value = "${hrdAdminVO.hrd_admin_name}" readonly = "readonly"> <br>
	<label>전화번호</label>
	<input type = "text" id = "hrd_out_input" value = "${hrdAdminVO.hrd_admin_phone}" readonly = "readonly"> <br>
	<label>주소</label>
	<input type = "text" id = "hrd_out_input" value = "${hrdAdminVO.hrd_admin_live}" readonly = "readonly"> <br>
</fieldset>

<div id = "buttons">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='mymenu_ByAdmin'">
	<input type = "submit" value = "회원탈퇴" class = "submit">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

