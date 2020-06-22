<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
<%@ include file = "basic_information_sub_menu.jsp" %>

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
<form name = "frm" method = "get">
<table id = "work_information">
	<tr>
		<td>
		<h2>근무태도</h2>
			<textarea rows="5" cols="80">
				OOO 회사의 근무태도 수칙은 이러이러한 원칙을 바탕으로 운영됩니다. 근무태도 수칙을
				지키지 않는 사원에게는 회사차원에서 징계를 내립니다.
			</textarea>
		</td>
	</tr>
	<tr>
		<td>
		<h2>출결사항 원칙</h2>
		<textarea rows="5" cols="80">
			OOO 회사의 출결사항 수칙은 이러이러한 원칙을 바탕으로 운영됩니다. 출결사항 수칙을 
			지키지 않는 사원이면, 회사차원에서 징계를 내립니다.
		</textarea>
		</td>
	</tr>
	<tr>
		<td>
		<h2>고객응대 원칙</h2>
		<textarea rows="5" cols="80">
			OOO 회사의 고객응대 원칙은 친절입니다.
		</textarea>
		</td>
	</tr>
	<tr>
		<td>
		<h2>부당처우에 대한 원칙</h2>
		<textarea rows="5" cols="80">
			직장상사나 직장 동료에 의한 괴롭힘 똔느 부당한 명령에 대한 대처방법은 고용노동부에 문의하거나, 
			회사 부장급 이상 사람에게 말해서 조치를 취합니다.
		</textarea>
		</td>
	</tr>
</table>
	
	<div id = "buttons" style = "margin-left : 200px">
		<input type = "button" value = "조직정보 가기" class = "submit" onclick="organization_information()">
		<input type = "button" value = "급여기준정보 가기" class = "submit" onclick="salary_information()">
		<input type = "button" value = "근태정보 가기" class = "submit" onclick="work_information()">
		<input type = "button" value = "뒤로가기" class = "cancel" onclick="location.href='basic_information'">
	</div>
	
</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>

