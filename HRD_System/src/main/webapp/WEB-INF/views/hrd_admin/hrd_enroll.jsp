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
<form action = "hrd_enroll" id = "hrd_enroll" method = "post" name = "frm" enctype="multipart/form-data">
	<h2>인사 등록</h2><br>
	<fieldset>
		<legend>회원 정보 입력</legend>
		<label>아이디</label>
		<input type = "text" id = "hrd_enroll_input" name = "employee_id"> 
		<input type = "hidden" name = "reid">
		<input type = "button" value = "아이디 중복 체크" name = "hrd_enroll_jungbuk_id" onclick="return hrd_enroll_jungbuk()"><br>
		<label>비밀번호</label>
		<input type = "password" id = "hrd_enroll_input" name = "employee_pwd"> <br>
		<label>이름</label>
		<input type = "text" id = "hrd_enroll_input" name = "employee_name"> <br>
		<label>성별</label>
		<input type = "radio" id = "hrd_enroll_radio" name = "employee_gender" value = "남자" checked>남자
		<input type = "radio" id = "hrd_enroll_radio" name = "employee_gender" value = "여자">여자<br>
		<label>나이</label>
		<input type = "text" id = "hrd_enroll_input" name = "employee_age" value = "0"> <br>
		<label>혈액형</label>
		<input type = "radio" id = "hrd_enroll_radio" name = "employee_blood_type" value = "A" checked> A 
		<input type = "radio" id = "hrd_enroll_radio" name = "employee_blood_type" value = "B"> B
		<input type = "radio" id = "hrd_enroll_radio" name = "employee_blood_type" value = "O"> O
		<input type = "radio" id = "hrd_enroll_radio" name = "employee_blood_type" value = "AB"> AB <br>
		<label>주소</label>
		<input type = "text" id = "hrd_enroll_input" name = "employee_live"> <br>
		<label>직위</label>
		<input type = "text" id = "hrd_enroll_input" name = "employee_position"> <br>
		<label>부서</label>
		<input type = "text" id = "hrd_enroll_input" name = "employee_department"> <br>
		<label>자기소개</label>
		<textarea name = "employee_self_introduction" rows = "10" cols = "55">	
		</textarea> <br>
		<label>기타</label>
		<input type = "file" name = "image"> <br>
	</fieldset>
	
	<div id = "buttons">
		<input type = "submit" value = "인사등록" class = "submit" onclick="return hrd_enroll()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='hrd_admin_ByAdmin'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>
