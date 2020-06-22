<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
<%@ include file = "basic_information_sub_menu.jsp" %>

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
<form name = "frm" method = "get">
<h3>조직 정보</h3>
<table id = "organization_information">
	<tr>
		<td>
			<img src = "images/organization1.png" width = "1200px" height = "500px">
		</td>
	</tr>
</table>
	
	<div id = "buttons" style = "margin-left : 200px">
		<input type = "button" value = "조직정보 가기" class = "submit" onclick="organization_information()">
		<input type = "button" value = "급여기준정보 가기" class = "submit" onclick="salary_information()">
		<input type = "button" value = "근태정보 가기" class = "submit" onclick="work_information()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='basic_information'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

