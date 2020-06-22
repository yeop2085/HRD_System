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
<form name = "frm" method = "get" action = "information_writeform_ByAdmin">
<h3>회사 공지사항</h3>
<table id = "search" style = "float : right;">
	<tr>
		<td>공지사항 제목 검색 <input type = "text" name = "key">
		<input type = "button" class = "btn" value = "검색" onclick="search_title()">
		</td>
	</tr>
</table>
<table id = "information_ByAdmin">
	<tr>
		<th style = "background-color : #B2EBF4">번호</th>
		<th style = "background-color : #B2EBF4">제목</th>
		<th style = "background-color : #B2EBF4">작성일</th>
		<th style = "background-color : #B2EBF4">삭제하기</th>
	</tr>
	<c:choose>
	<c:when test = "${informationListSize <= 0}">
		<tr>
			<td width = "100%" colspan = "4" align = "center">
				등록된 게시글이 없습니다.
			</td>
		</tr>
	</c:when>
	<c:otherwise>
		<c:forEach items = "${informationList}" var = "information">
		<tr>
			<td>${information.information_number}</td>
			<td>
				<a href = "information_view_ByAdmin?${pageMaker.makeQuery(pageMaker.cri.pageNum)}&information_number=${information.information_number}">
					${information.title}
				</a>
			</td>
			<td><fmt:formatDate value="${information.regdate}" type = "date"/></td>
			<td>
				<a href = "information_delete_ByAdmin?${pageMaker.makeQuery(pageMaker.cri.pageNum)}&information_number=${information.information_number}">
					삭제하기
				</a>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan = "4">
			<%@ include file = "page_area_information_list.jsp" %>
		</td>
	</tr>
	</c:otherwise>
	</c:choose>
</table>
<div class = "clear"></div>

	<div id = "buttons">
		<input type = "submit" value = "공지사항 쓰기" class = "submit">
		<input type = "button" value = "돌아가기" class = "cancel" onclick="location.href='admin_index'">	
	</div>

</form>

</article>

<div class = "clear"></div>

<%@ include file = "../footer.jsp" %>



