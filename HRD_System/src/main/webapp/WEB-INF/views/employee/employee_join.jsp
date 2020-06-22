<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
<%@ include file = "employee_sub_menu.jsp" %>

<c:choose>
	<c:when test = "${empty sessionScope.loginUser}">
		<h4 style="text-align:right;">
			로그인이 안되어있는 상태입니다.
		</h4>
	</c:when>
	<c:otherwise>
		<h4 style="text-align:right;">
			${sessionScope.loginUser.employee_name} 님이 로그인하셨습니다.
			(<a href = "employee_logout">로그아웃하기</a>)
		</h4>
	</c:otherwise>
</c:choose>

<div id = "Hrd_System_Main">
	<a href = "index">
		<img src = "images/Hrd_System_User.jpg" width = "1450px" height = "200px"
		style = "margin-left : 40px; margin-top : 30px">
	</a>
</div>

<article>
<form action="employee_join_post" id="employee_join_post" method = "post" name = "frm" enctype="multipart/form-data">
	<h3>나의 정보 메뉴</h3>
	<fieldset>
		<legend>회원 정보 입력</legend>
		<label>아이디</label>
		<input type = "text" id = "employee_join_input" name = "employee_id"> 
		<input type = "hidden" name = "reid">
		<input type = "button" value = "아이디 중복 체크" onclick="return employee_check_jungbuk()"><br>
		<label>비밀번호</label>
		<input type = "password" id = "employee_join_input" name = "employee_pwd"> <br>
		<label>이름</label>
		<input type = "text" id = "employee_join_input" name = "employee_name"> <br>
		<label>성별</label>
		<input type = "radio" id = "employee_join_radio" name = "employee_gender" value = "남자">남자 
		<input type = "radio" id = "employee_join_radio" name = "employee_gender" value = "여자">여자 <br>
		<label>나이</label>
		<input type = "text" id = "employee_join_input" name = "employee_age" value = "0"> <br>
		<label>혈액형</label>
		<input type = "radio" id = "employee_join_radio" name = "employee_blood_type" value = "A"> A 
		<input type = "radio" id = "employee_join_radio" name = "employee_blood_type" value = "B"> B 
		<input type = "radio" id = "employee_join_radio" name = "employee_blood_type" value = "O"> O 
		<input type = "radio" id = "employee_join_radio" name = "employee_blood_type" value = "AB"> AB <br>
		<label>주소</label>
		<input type = "text" id = "employee_join_input" name = "employee_live"> <br>
		<label>직위</label>
		<input type = "text" id = "employee_join_input" name = "employee_position"> <br>
		<label>부서</label>
		<input type = "text" id = "employee_join_input" name = "employee_department"> <br>
		<label>자기소개</label>
		<textarea name = "employee_self_introduction" rows = "10" cols = "55">	
		</textarea> <br>
		<label>기타</label>
		<input type = "file" name = "image"> <br>
	</fieldset>
	<div id = "buttons">
		<input type = "button" value = "회원가입" class = "submit" onclick="employee_join_post()">
		<input type = "reset" value = "취소" class = "cancel">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='mymenu'">
	</div>
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

