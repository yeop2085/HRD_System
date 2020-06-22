<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "retirement_sub_menu.jsp" %>

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
<form name = "frm" method = "get" action = "retirement_enroll">
<br>
<h3>퇴직 정보</h3>
<table style = "float : right;">
	<tr>
		<td>퇴직자 아이디<input type = "text" name = "key">
		<input type = "button" class = "btn" value = "검색" onclick="search_retirement_ByEmployeeId()"><br> 
		</td>
	</tr>	
</table>
<table id = "retirement_list">
	<tr>
		<th style = "background-color : #B2EBF4">퇴직번호</th>
		<th style = "background-color : #B2EBF4">아이디</th>
		<th style = "background-color : #B2EBF4">퇴직봉급</th>
		<th style = "background-color : #B2EBF4">퇴직날짜</th>
		<th style = "background-color : #B2EBF4">삭제하기</th>
	</tr>
	<c:choose>
	<c:when test = "${retirementListSize <= 0}">
	<tr>
		<td width = "100%" colspan = "5" align = "center">
			등록된 퇴직정보가 없습니다.
		</td>
	</tr>
	</c:when>
	<c:otherwise>
		<c:forEach items = "${retirementList}" var = "retirement">
		<tr>
			<td>
				<a href = "retirement_detail?${pageMaker.makeQuery(pageMaker.cri.pageNum)}&retirement_number=${retirement.retirement_number}">
					${retirement.retirement_number}
				</a>
			</td>
			<td>${retirement.employee_id}</td>
			<td>${retirement.retirement_salary}</td>
			<td><fmt:formatDate value="${retirement.retirement_retire}" type = "date"/></td>
			<td>
				<a href = "retirement_delete?${pageMaker.makeQuery(pageMaker.cri.pageNum)}&retirement_number=${retirement.retirement_number}">
					삭제하기
				</a>
			</td>
		</tr>
		</c:forEach>
	<tr>
		<td colspan = "5" style = "text-align : center;">
			<%@ include file = "page_area_retirement.jsp" %>
		</td>
	</tr>
	</c:otherwise>
	</c:choose>
</table>

<div id = "buttons">
	<input type = "button" value = "급여정보" class = "submit" onclick="salary_list()">
	<input type = "button" value = "퇴직정보" class = "submit" onclick="retirement_information()">
	<input type = "submit" value = "퇴직정보 등록" class = "submit">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='salary_ByAdmin'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
