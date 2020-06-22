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
<form name = "frm" method = "get" action = "disciplinary_enroll">
<br>
<h3>징계 처벌 정보</h3>
<table id = "search" style = "float : right;">
	<tr>
		<td>징계아이디<input type = "text" name = "key">
			<input type = "button" class = "btn" value = "검색" onclick="search_disciplinary()">
		</td>
	</tr>
</table>
<table id = "disciplinary_list">
	<tr>
		<th style = "background-color : #B2EBF4">징계번호</th>
		<th style = "background-color : #B2EBF4">아이디</th>
		<th style = "background-color : #B2EBF4">기타</th>
		<th style = "background-color : #B2EBF4">징계사유</th>
		<th style = "background-color : #B2EBF4">삭제</th>
	</tr>
	<c:choose>
	<c:when test = "${disciplinaryListSize <= 0}">
		<tr>
			<td width = "100%" colspan = "5" align = "center">
				등록된 징계정보가 없습니다.
			</td>
		</tr>
	</c:when>
	<c:otherwise>
		<c:forEach items = "${disciplinaryList}" var = "disciplinary">
		<tr>	
			<td><a href = "disciplinary_detail?disciplinary_number=${disciplinary.disciplinary_number}">${disciplinary.disciplinary_number}</a></td>
			<td>${disciplinary.employee_id}</td>
			<td>${disciplinary.disciplinary_and_so_on}</td>
			<td>${disciplinary.disciplinary_reason}</td>
			<td><a href = "disciplinary_delete?disciplinary_number=${disciplinary.disciplinary_number}">삭제하기</a></td>
		</tr>	
	</c:forEach>
	<tr>
		<td colspan = "5" style = "test-align : center;">
			<%@ include file = "page_area_disciplinary.jsp" %>
		</td>
	</tr>
	</c:otherwise>
	</c:choose>
</table>

<div id = "buttons">
	<input type = "button" value = "징계정보" class = "submit" onclick="disciplinary_list()">
	<input type = "button" value = "연차관리" class = "submit" onclick="vacation_management()">
	<input type = "submit" value = "징계정보 등록" class = "submit">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='disciplinary_ByAdmin'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

