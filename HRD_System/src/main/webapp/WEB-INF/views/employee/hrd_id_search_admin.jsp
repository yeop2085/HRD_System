<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hrd_id_search_admin.jsp</title>
<style>
body {
	background-color : #ffffff;
}
</style>
<script type = "text/javascript">
function idok() {
	opener.frm.hrd_admin_id.value="${hrd_admin_id}";
	self.close();
}
</script>
</head>
<body>

<div id = "wrap">
<h2>ID 찾기 결과</h2>
<form method = "post" name = "frm" style = "margin-right:0">

<c:if test = "${message == 1}">
	아이디 ${hrd_admin_id} 가 존재합니다.
	<input type = "button" value = "확인" class = "cancel" onclick="idok()">
</c:if>

<c:if test = "${message != 1}">
	<script type = "text/javascript">
		opener.document.frm.hrd_admin_id.value = "";
	</script>
	아이디가 존재하지 않습니다.
</c:if>

</form>
</div>

</body>
</html>