<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "salary_sub_menu.jsp" %>

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
<form name = "frm" method = "get" action = "salary_enroll">
<br>
<h3>급여 정보</h3>
<table id = "search" style = "float : right;">
	<tr>
		<td>급여자 아이디<input type = "text" name = "key">
		<input type = "button" class = "btn" value = "검색" onclick="search_employee_id()">
		</td>
	</tr>
</table>
<table id = "salary_list">
	<tr>
		<th style = "background-color : #B2EBF4">급여번호</th>
		<th style = "background-color : #B2EBF4">아이디</th>
		<th style = "background-color : #B2EBF4">직원봉급</th>
		<th style = "background-color : #B2EBF4">근무기간</th>
		<th style = "background-color : #B2EBF4">삭제</th>
	</tr>
	<c:choose>
	<c:when test = "${salaryListSize <= 0}">
	<tr>
		<td width = "100%" colspan = "5" align = "center" height="23">
			등록된 급여정보가 없습니다.
		</td>
	</tr>
	</c:when>
	<c:otherwise>
		<c:forEach items = "${salaryList}" var = "salary">
		<tr>	
			<td>
				<a href = "salary_detail?${pageMaker.makeQuery(pageMaker.cri.pageNum)}&salary_number=${salary.salary_number}">
					${salary.salary_number}
				</a>
			</td>
			<td>${salary.employee_id}</td>
			<td>${salary.employee_salary}</td>
			<td>${salary.employee_work_period}</td>
			<td>
				<a href = "salary_delete?${pageMaker.makeQuery(pageMaker.cri.pageNum)}&salary_number=${salary.salary_number}">
					삭제하기
				</a>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan = "5" style = "text-align : center;">
				<%@ include file = "page_area_salary.jsp" %>
			</td>
		</tr>
	</c:otherwise>
	</c:choose>
</table>

<div id = "buttons">
	<input type = "button" value = "급여정보" class = "submit" onclick="salary_list()">
	<input type = "button" value = "퇴직정보" class = "submit" onclick="retirement_information()">
	<input type = "submit" value = "급여정보 등록" class = "submit">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='salary_ByAdmin'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
