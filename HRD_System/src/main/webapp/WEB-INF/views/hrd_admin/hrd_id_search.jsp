<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hrd_id_search.jsp</title>
<style>
body {
	background-color : #ffffff;
}
</style>
<script type = "text/javascript">
function idok() {
	opener.frm.hrd_admin_id.value="${hrd_admin_id}";
	opener.frm.reid.value="${hrd_admin_id}";
	self.close();
}
</script>
</head>
<body>

<div id = "wrap">
<h2>ID 확인 결과</h2>
<form method = "post" name = "frm" style = "margin-right : 0">

<c:if test = "${message == 1}">
	아이디 ${hrd_admin_id}는 이미 사용중입니다.
	<script type = "text/javascript">
		opener.document.frm.hrd_admin_id.value = "";
	</script>
</c:if>

<c:if test = "${message != 1}">
	아이디 ${hrd_admin_id}는 사용 가능합니다.
	<input type = "button" value = "사용하기" class = "cancel" onclick="idok()">
</c:if>

</form>
</div>

</body>
</html>


