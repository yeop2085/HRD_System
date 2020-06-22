<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employee_pwd_search_main.jsp</title>
<style>
body {
	background-color : #ffffff;
}
</style>
<script type = "text/javascript">
function pwdok() {
	opener.frm.employee_pwd.value="${employee_pwd}";
	self.close();
}
</script>
</head>
<body>

<div id = "wrap">
<h2>PWD 찾기 결과</h2>
<form method = "post" name = "frm" style = "margin-right:0">

<c:if test = "${message == 1}">
	비밀번호 ${employee_pwd} 가 존재합니다.
	<input type = "button" value = "확인" class = "cancel" onclick="pwdok()">
</c:if>
<c:if test = "${message != 1}">
	비밀번호가 존재하지 않습니다.
	<script type = "text/javascript">
		opener.document.frm.employee_pwd.value = "";
	</script>
</c:if>

</form>
</div>

</body>
</html>