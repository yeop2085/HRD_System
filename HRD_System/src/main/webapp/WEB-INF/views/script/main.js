/**
 * 
 */

function employee_login() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_pwd.value == "") {
		alert("비밀번호를 입력해주세요.");
		document.frm.employee_pwd.focus();
		return false;
	} else {
		document.frm.action = "employee_login";
		document.frm.submit();
		return true;
	}
	
}


function admin_login() {
	
	if (document.frm.hrd_admin_id.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	} else if (document.frm.hrd_admin_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.hrd_admin_pwd.focus();
		return false;
	} else {
		document.frm.action = "admin_login";
		document.frm.submit();
		return true;
	}
	
}

function employee_logout() {
	
	document.frm.action = "employee_logout";
	document.frm.submit();
	
}

function admin_logout() {
	
	document.frm.action = "admin_logout";
	document.frm.submit();
	
}

function employee_join() {
	
	document.frm.action = "employee_join";
	document.frm.submit();
	
}

function admin_join() {
	
	document.frm.action = "admin_join";
	document.frm.submit();
	
}

function admin_id_pwd_search() {
	
	document.frm.action = "admin_id_pwd_search";
	document.frm.submit();
	
}




