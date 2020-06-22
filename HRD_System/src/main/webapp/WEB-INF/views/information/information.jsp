<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../header.jsp" %>
<%@ include file = "information_sub_menu.jsp" %>

<c:choose>
	<c:when test = "${empty sessionScope.loginUser}">
		<h4 style = "text-align : right;">
			로그인이 안되어있는 상태입니다.
		</h4>
	</c:when>
	<c:otherwise>
		<h4 style = "text-align : right;">
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
<form name = "frm" method = "post" action = "information_write">
<h3>회사 공지사항</h3>
<table id = "search" style = "float : right;">
	<tr>
		<td>공지사항 제목<input type = "text" name = "key">
			<input type = "button" class = "btn" value = "검색" onclick="search_title_worker()">
		</td>
	</tr>
</table>
<table id = "information">
	<tr>
		<th style = "background-color : #B2EBF4">번호</th>
		<th style = "background-color : #B2EBF4">제목</th>
		<th style = "background-color : #B2EBF4">작성일</th>
	</tr>
	<c:choose>
	<c:when test = "${informationSize <= 0}">
		<tr>
			<td width = "100%" colspan = "3" align = "center">
				등록된 게시글이 없습니다.
			</td>
		</tr>
	</c:when>
	<c:otherwise>
	<c:forEach items = "${informationList}" var = "information">
		<tr>
			<td>${information.information_number}</td>
			<td><a href = "information_view?information_number=${information.information_number}">${information.title}</a></td>
			<td><fmt:formatDate value="${information.regdate}" type = "date"/></td>
		</tr>
	</c:forEach>
	<tr>	
		<td colspan = "3" style = "text-align : center;">
			<%@ include file = "page_area_information_worker.jsp" %>
		</td>
	</tr>
	</c:otherwise>
	</c:choose>
</table>

<div id = "buttons" style = "float:left">
<input type = "submit" class = "submit" value = "공지사항 쓰기">
<input type = "button" class = "cancel" value = "돌아가기" onclick="location.href='index'">	
</div>

</form>
</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>


