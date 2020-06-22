<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "basic_information_sub_menu_ByAdmin.jsp" %>

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
<form name = "frm" method = "get">
<h3>급여기준정보</h3> <br>
<table id = "salary_information_ByAdmin">
	<tr>
		<th style = "background-color : #B2EBF4"></th>
		<th style = "background-color : #B2EBF4">사원</th>
		<th style = "background-color : #B2EBF4">대리</th>
		<th style = "background-color : #B2EBF4">과장</th>
		<th style = "background-color : #B2EBF4">차장</th>
		<th style = "background-color : #B2EBF4">부장</th>
		<th style = "background-color : #B2EBF4">사장</th>
	</tr>
	<tr>
		<td style = "background-color : #B2EBF4">1호봉</td>
		<td>1,600,000</td>
		<td>2,400,000</td>
		<td>3,600,000</td>
		<td>4,600,000</td>
		<td>5,800,000</td>
		<td>9,000,000</td>
	</tr>
	<tr>
		<td style = "background-color : #B2EBF4">2호봉</td>
		<td>1,700,000</td>
		<td>2,600,000</td>
		<td>3,800,000</td>
		<td>4,800,000</td>
		<td>6,000,000</td>
		<td>9,300,000</td>
	</tr>
	<tr>
		<td style = "background-color : #B2EBF4">3호봉</td>
		<td>1,800,000</td>
		<td>2,800,000</td>
		<td>4,000,000</td>
		<td>5,000,000</td>
		<td>6,300,000</td>
		<td>9,600,000</td>
	</tr>
	<tr>
		<td style = "background-color : #B2EBF4">4호봉</td>
		<td>1,900,000</td>
		<td>3,000,000</td>
		<td>4,200,000</td>
		<td>5,200,000</td>
		<td>6,600,000</td>
		<td>9,900,000</td>
	</tr>
	<tr>
		<td style = "background-color : #B2EBF4">5호봉</td>
		<td>-</td>
		<td>3,200,000</td>
		<td>4,400,000</td>
		<td>5,400,000</td>
		<td>6,900,000</td>
		<td>10,200,000</td>
	</tr>
	<tr>
		<td style = "background-color : #B2EBF4">6호봉</td>
		<td>-</td>
		<td>-</td>
		<td>4,600,000</td>
		<td>5,600,000</td>
		<td>7,200,000</td>
		<td>10,500,000</td>
	</tr>
	
</table>	
		
	<div id = "buttons" style = "margin-left : 150px">
		<input type = "button" value = "조직정보 가기" class = "submit" onclick="organization_information_ByAdmin()">
		<input type = "button" value = "급여기준정보 가기" class = "submit" onclick="salary_information_ByAdmin()">
		<input type = "button" value = "근태정보 가기" class = "submit" onclick="work_information_ByAdmin()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='basic_information_ByAdmin'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

