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
<h2>급여정보 메뉴</h2>
<form name = "frm" method = "get">
<table id = "salary_menu_ByAdmin">
	<tr>
		<td><h3>급여 관리 메뉴 소개</h3></td>
	</tr>
	<tr>
		<td>
			급여 관리 메뉴에 대해 소개하겠습니다. <br><br>
			급여 관리 메뉴에는 급여정보와 퇴직정보 두가지 기능이 있습니다. <br><br>
			급여정보 기능으로 들어가면, 급여정보 리스트가 나옵니다. <br><br>
			급여번호를 누르면 급여번호. 아이디. 기타. 봉급. 신청기간에 대한 세부정보가 나옵니다. <br><br>
			급여아이디 검색을 통해서 찾고자 하는 급여아이디를 찾을 수 있습니다. <br><br>
			급여등록을 누르면, 급여정보를 등록할 수 있습니다. <br><br>
			퇴직정보 기능을 누르면 퇴직정보 리스트가 나옵니다. <br><br>
			퇴직번호를 누르면 퇴직번호. 아이디. 기타. 봉급. 퇴직날짜에 대한 세부정보를 볼 수 있습니다. <br><br>
			퇴직아이디 검색을 통해서 찾고자 하는 퇴직내용을 찾을 수 있습니다. <br><br>
			퇴직정보 등록을 누르면 퇴직정보를 등록할 수 있습니다. <br><br>
			읽어주셔서 감사합니다. <br><br>
		</td>
	</tr>
</table>

<div id = "buttons">
	<input type = "button" value = "급여정보" class = "submit" onclick="salary_list()">
	<input type = "button" value = "퇴직정보" class = "submit" onclick="retirement_information()">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='admin_index'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

