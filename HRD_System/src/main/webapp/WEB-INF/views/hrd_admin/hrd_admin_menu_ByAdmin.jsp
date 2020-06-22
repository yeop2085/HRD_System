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
<h3>인사관리 메뉴</h3>
<table id = "hrd_menu">
	<tr>
		<td><h3>인사 관리 소개</h3></td>
	</tr>
	<tr>
		<td>
			인사관리 메뉴에 대해 소개하겠습니다. <br><br>
			인사관리 메뉴에는 인사정보와 인사등록 두가지 기능이 있습니다. <br><br>
			인사정보 기능에서 해당 사원이름을 누르면, 해당 사원에 대한 상세정보를 볼 수 있습니다. <br><br>
			사원이름 검색 기능에서 사원이름을 치면, 해당 사원이름을 조회할 수 있습니다. <br><br>
			인사등록 기능에서 아이디. 비밀번호. 이름. 성별. 나이. 혈액형. 주소. 직위. 부서. 자기소개. 파일첨부 기능이 있습니다. <br><br>
			읽어주셔서 감사합니다. <br><br>
		</td>
	</tr>
</table>

<div id = "buttons">
	<input type = "button" value = "인사정보" class = "submit" onclick="hrd_information()">
	<input type = "button" value = "인사등록" class = "submit" onclick="hrd_enrollment()">
	<input type = "button" value = "뒤로가기" class = "submit" onclick="location.href='admin_index'">
</div> 

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

