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
<form name = "frm" method = "post" id = "hrd_mymenu" action = "hrd_update" enctype="multipart/form-data">
<h3>관리자 정보</h3> <br>
<input type = "hidden" name = "hrd_admin_id" value = "${hrdAdminVO.hrd_admin_id}">

<fieldset>
	<legend>관리자 정보</legend>
	<label>이름</label>
	<input type = "text" id = "hrd_mymenu_input" value = "${hrdAdminVO.hrd_admin_name}" readonly = "readonly"> <br>
	<label>전화번호</label>
	<input type = "text" id = "hrd_mymenu_input" value = "${hrdAdminVO.hrd_admin_phone}" readonly = "readonly"> <br>
	<label>주소</label>
	<input type = "text" id = "hrd_mymenu_input" value = "${hrdAdminVO.hrd_admin_live}" readonly = "readonly"> <br>
	<label>사진</label>
	<img src = "images/${hrdAdminVO.hrd_image}" width = "200" height = "200"> <br>
</fieldset>

<div id = "buttons">
	<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='mymenu_ByAdmin'">
	<input type = "submit" value = "수정" class = "submit">
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>   

 
