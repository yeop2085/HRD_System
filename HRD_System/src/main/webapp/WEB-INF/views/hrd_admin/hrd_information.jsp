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
<form name = "frm" method = "post">
<br>
<h3>사원 검색</h3>
<table id = "search" style = "float : right;">
	<tr>
		<td>사원이름 검색<input type = "text" name = "key">
			<input type = "button" class = "btn" value = "검색" onclick="search_employee()">
		</td>
	</tr>
</table>
<table id = "hrd_information">
	<tr>
		<th style = "background-color : #B2EBF4">이름</th>
		<th style = "background-color : #B2EBF4">직책</th>
		<th style = "background-color : #B2EBF4">나이</th>
		<th style = "background-color : #B2EBF4">부서</th>
		<th style = "background-color : #B2EBF4">기타</th>
		<th style = "background-color : #B2EBF4">삭제</th>
	</tr>
	<c:choose>
	<c:when test = "${listAllEmployeeSize <= 0}">
		<tr>
			<td width = "100%" colspan = "6" align = "center">
				등록된 사원목록이 없습니다.
			</td>
		</tr>
	</c:when>
	<c:otherwise>
	<c:forEach items = "${listAllEmployee}" var = "employee">
	<tr>
		<td><a href = "hrd_detail?employee_id=${employee.employee_id}">${employee.employee_name}</a></td>
		<td>${employee.employee_position}</td>
		<td>${employee.employee_age}</td>
		<td>${employee.employee_department}</td>
		<td>${employee.employee_and_so_on}</td>
		<td><a href = "hrd_delete?employee_id=${employee.employee_id}">삭제하기</a></td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan = "6" style = "text-align : center;">
			<%@ include file = "page_area_hrd_admin.jsp" %>
		</td>
	</tr>
	</c:otherwise>
	</c:choose>
</table>

<div id = "buttons">
	<input type = "button" value = "인사정보" class = "submit" onclick="hrd_information()">
	<input type = "button" value = "인사등록" class = "submit" onclick="hrd_enrollment()">
	<input type = "button" value = "뒤로가기" class = "submit" onclick="location.href='hrd_admin_ByAdmin'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

