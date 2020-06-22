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
<form name = "frm" method = "get" action = "vacation_enroll">
<br>
<h3>연차 정보</h3>
<table id = "search" style = "float : right;">
	<tr>
		<td>아이디 검색<input type = "text" name = "key">
			<input type = "button" class = "btn" value = "검색" onclick="search_vacaction()">
		</td>
	</tr>
</table>
<table id = "vacationList">
	<tr>
		<th style = "background-color : #B2EBF4">연차번호</th>
		<th style = "background-color : #B2EBF4">아이디</th>
		<th style = "background-color : #B2EBF4">연차사유</th>
		<th style = "background-color : #B2EBF4">삭제</th>
	</tr>
	<c:choose>
	<c:when test = "${vacationListSize <= 0}">
		<tr>
			<td width = "100%" colspan = "4" align = "center">
				등록된 연차정보가 없습니다.
			</td>
		</tr>
	</c:when>
	<c:otherwise>
	<c:forEach items = "${vacationList}" var = "vacation">
		<tr>
			<td><a href = "vacation_detail?vacation_number=${vacation.vacation_number}">${vacation.vacation_number}</a></td>
			<td>${vacation.employee_id}</td>
			<td>${vacation.vacation_reason}</td>
			<td><a href = "vacation_delete?vacation_number=${vacation.vacation_number}">삭제하기</a></td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan = "4" style = "text-align : center;">
			<%@ include file = "page_area_vacation.jsp" %>
		</td>
	</tr>
	</c:otherwise>
	</c:choose>
</table>

<div id = "buttons">
	<input type = "button" value = "징계정보" class = "submit" onclick="disciplinary_list()">
	<input type = "button" value = "연차관리" class = "submit" onclick="vacation_management()">
	<input type = "submit" value = "연차정보 등록" class = "submit">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='disciplinary_ByAdmin'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

