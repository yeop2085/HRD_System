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
	<h3>기본정보 메뉴</h3>
	<table id = "basic_information_ByAdmin">
	<tr>
		<td><h3>기본 정보 메뉴 소개</h3></td>
	</tr>	
	<tr>
		<td>
			기본정보 메뉴에 대해 간단히 소개를 하겠습니다. <br><br>
			기본정보 메뉴에는 3가지 기능이 있습니다. 조직정보, 급여기준 정보, 근태정보 입니다. <br><br>
			조직정보기능에는 전반적인 조직정보에 대한 부분에 대해 그림으로 나타내는 부분이며 <br><br>
			급여기준 정보기능에는 사원, 대리, 과장, 차장, 부장, 사장의 월급표를 테이블 형태로 만들었으며 <br><br>
			근태정보 기능에는 직원들이 회사에서 지켜야 할 규율에 대해서 설명한 부분입니다. <br><br>
			설명을 읽어주셔서 감사합니다. <br><br>
		</td>
	</tr>
	</table>
	<div id = "buttons">
		<input type = "button" value = "조직정보 가기" class = "submit" onclick="organization_information_ByAdmin()">
		<input type = "button" value = "급여기준정보 가기" class = "submit" onclick="salary_information_ByAdmin()">
		<input type = "button" value = "근태정보 가기" class = "submit" onclick="work_information_ByAdmin()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='admin_index'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
    