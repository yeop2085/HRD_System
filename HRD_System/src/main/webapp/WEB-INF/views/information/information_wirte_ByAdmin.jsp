<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header_ByAdmin.jsp" %>
<%@ include file = "information_sub_menu_ByAdmin.jsp" %>

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

<div id = "hrd_system_main">
	<a href = "admin_index">
		<img src = "images/Hrd_System_Main.jpg" width = "1450px" height = "200px"
		style = "margin-left : 40px; margin-top : 30px">
	</a>
</div>

<article>
	<form name = "frm" method = "post" action = "information_write_ByAdmin" id = "information_write_ByAdmin">
		<h3>공지사항 쓰기</h3> <br>
		<fieldset>
			<legend>공지사항</legend>
			<label>제목</label>
			<input type = "text" id = "information_write_ByAdmin_input" name = "title" size = "80"><br><br>
			<label>내용</label>
			<textarea name = "content" rows = "10" cols = "80">
			</textarea>
		</fieldset>
		
		<div id = "buttons">
			<input type = "button" value = "공지사항 올리기" class = "submit" onclick="return information_write_ByAdmin()">
			<input type = "reset" value = "취소" class = "cancel">
			<input type = "button" value = "돌아가기" class = "cancel" onclick="location.href='information_ByAdmin'">
		</div>
	</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

