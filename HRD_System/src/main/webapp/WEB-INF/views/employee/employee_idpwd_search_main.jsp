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
<form name = "frm" method = "post" action = "employee_idpwd_search_main">
<h3>사원 ID, PW 찾기</h3>
<table id = "employee_idpwd_search_main">
	<tr>
		<th style = "background-color : #B2EBF4">아이디</th>
		<td><input type = "text" name = "employee_id"></td>
	</tr>
	<tr>
		<th style = "background-color : #B2EBF4">비밀번호</th>
		<td><input type = "text" name = "employee_pwd"></td>
	</tr>
</table>

<div id = "buttons">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='index'">
	<input type = "button" value = "ID찾기" class = "submit" onclick="employee_id_search_main()">
	<input type = "button" value = "PW찾기" class = "submit" onclick="employee_pwd_search_main()">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

