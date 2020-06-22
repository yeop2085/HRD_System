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
<form name = "frm" method = "post" action = "admin_idpwd_search">
<h3>관리자 ID, PW 찾기</h3>
<table id = "admin_idpwd_search">
	<tr>
		<th style = "background-color : #B2EBF4">아이디</th>
		<td><input type = "text" name = "hrd_admin_id"></td>
	</tr>
	<tr>
		<th style = "background-color : #B2EBF4">비밀번호</th>
		<td><input type = "text" name = "hrd_admin_pwd"></td>
	</tr>
</table>

<div id = "buttons">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='admin_index'">
	<input type = "button" value = "ID찾기" class = "submit" onclick="hrd_id_search_admin()">
	<input type = "button" value = "PW찾기" class = "submit" onclick="hrd_pwd_search_admin()">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
