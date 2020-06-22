<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>salary_id_confirm.jsp</title>
<style>
body {
	background-color : #ffffff;
}
</style>
<script type = "text/javascript">
function idok() {
	opener.frm.employee_id.value="${employee_id}";
	opener.frm.reid.value="${employee_id}";
	self.close();
}
</script>
</head>
<body>

<div id = "wrap">
<h2>ID 확인 결과</h2>
<form method = "post" name = "frm" style = "margin-right:0">

<c:if test = "${message == 1}">
	아이디 ${employee_id}가 존재합니다.
	<input type = "button" value = "등록하기" class = "cancel" onclick="idok()">
</c:if>

<c:if test = "${message != 1}">
	<script type = "text/javascript">
		opener.document.frm.employee_id.value = "";
	</script>
	아이디가 존재하지 않습니다.
</c:if>

</form>
</div>

</body>
</html>

