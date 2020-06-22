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

<div id = "Hrd_System_Main">
	<a href = "admin_index">
		<img src = "images/Hrd_System_Main.jpg" width = "1450px" height = "200px"
		style = "margin-left : 40px; margin-top : 30px">
	</a>
</div>

<article>
<form name = "frm" method = "post" id = "informationView_ByAdmin">
<h3>게시판 내용</h3> <br>
<fieldset>
	<legend>게시판 내용</legend>
	<label>번호</label>
	<input type = "text" id = "informationView_ByAdmin_input" value = "${information.information_number}"> <br>
	<label>제목</label>
	<input type = "text" id = "informationView_ByAdmin_input" value = "${informationVO.title}"> <br>
	<label>내용</label>
	<textarea rows="10" cols="55"></textarea> <br>
	<label>등록일</label>
	<fmt:formatDate value="${informationVO.regdate}" type = "date"/> <br>
</fieldset>

<div id = "buttons" style = "float:left">
	<input type = "button" value = "돌아가기" class = "cancel" onclick="location.href='information_ByAdmin'">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
