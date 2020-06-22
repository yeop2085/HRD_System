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
<form action = "admin_join_post" id = "admin_join_post" method = "post" name = "frm" enctype="multipart/form-data">
	<h3>관리자 정보 메뉴</h3> <br>
	<fieldset>
		<legend>관리자 정보 입력</legend>
		<label>아이디</label>
		<input type = "text" id = "admin_join_post_input" name = "hrd_admin_id">
		<input type = "hidden" name = "reid">
		<input type = "button" value = "아이디 중복 체크" onclick="return admin_jungbuk1()"><br><br>
		<label>비밀번호</label>
		<input type = "text" id = "admin_join_post_input" name = "hrd_admin_pwd"><br><br>
		<label>이름</label>
		<input type = "text" id = "admin_join_post_input" name = "hrd_admin_name"><br><br>
		<label>전화번호</label>
		<input type = "text" id = "admin_join_post_input" name = "hrd_admin_phone"><br><br>
		<label>주소</label>
		<input type = "text" id = "admin_join_post_input" name = "hrd_admin_live"><br><br>
		<label>사진</label>
		<input type = "file" id = "admin_join_post_input" name = "image"><br><br>
	</fieldset>
	
	<div id = "buttons">
		<input type = "button" value = "회원가입" class = "submit" onclick="admin_join_post()">
		<input type = "reset" value = "취소" class = "cancel">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='admin_index'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
