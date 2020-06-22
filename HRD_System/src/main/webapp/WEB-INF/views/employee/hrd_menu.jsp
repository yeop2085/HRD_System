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
<h3>내 정보 메뉴</h3>
<table id = "hrd_menu">
	<tr>
		<td><h3>내 정보 메뉴</h3></td>
	</tr>
	<tr>
		<td>
			내 정보 메뉴에 대해 간단히 소개하겠습니다. <br><br>
			내 정보 메뉴에는 나의정보, 회원가입, 아이디 비밀번호 찾기, 회원탈퇴 4가지 기능이 있습니다. <br><br>
			나의정보 기능에서는 이름. 성별. 나이. 혈액형. 주소. 직책. 부서. 사진. 자기소개 입력칸이 있습니다. <br><br>
			회원가입 기능에서는 아이디. 비밀번호. 이름. 성별. 나이. 혈액형. 주소. 직위. 부서. 자기소개. 파일첨부 기능이 있습니다. <br><br>
			아이디 비밀번호 찾기 기능에서는 아이디칸에 아이디를 적고 ID 찾기 버튼을 누르면 아이디 진위여부 확인을 하며 <br><br>
			비밀번호칸에 비밀번호를 적고 PW찾기 버튼을 누르면 비밀번호 진위여부 확인을 합니다. <br><br>
			회원탈퇴 기능에서는 한번더 회원정보를 보여주며, 회원탈퇴를 할것인지 아닌지 다시한번 확인시켜 줍니다. <br><br>
			설명을 읽어주셔서 감사합니다. <br><br>
		</td>
	</tr>
</table>

<div id = "buttons">
	<input type = "button" value = "나의 정보" class = "submit" onclick="hrd_mymenu()">
	<input type = "button" value = "회원가입" class = "submit" onclick="hrd_join()">
	<input type = "button" value = "아이디 비밀번호 찾기" class = "submit" onclick="hrd_idpwd_search()">
	<input type = "button" value = "회원탈퇴" class = "submit" onclick="hrd_out()">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='admin_index'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

