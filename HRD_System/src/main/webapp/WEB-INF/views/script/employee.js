/**
 * 
 */

function employee_join_post() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 해주세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.employee_pwd.focus();
		return false;
	} else if (document.frm.employee_name.value == "") {
		alert("이름을 입력하세요.");
		document.frm.employee_name.focus();
		return false;
	} else if (document.frm.employee_gender.value == "") {
		alert("성별을 선택해주세요.");
		document.frm.employee_gender.focus();
		return false;
	} else if (document.frm.employee_age.value == "") {
		alert("나이를 입력하세요.");
		document.frm.employee_age.focus();
		return false;
	} else if (isNaN(document.frm.employee_age.value)) {
		alert("나이를 숫자로 입력하세요.");
		document.frm.employee_age.focus();
		return false;
	} else if (document.frm.employee_blood_type.value == "") {
		alert("혈액형을 선택해주세요.");
		document.frm.employee_blood_type.focus();
		return false;
	} else if (document.frm.employee_live.value == "") {
		alert("주소를 입력하세요.");
		document.frm.employee_live.focus();
		return false;
	} else if (document.frm.employee_position.value == "") {
		alert("직위를 입력하세요.");
		document.frm.employee_position.focus();
		return false;
	} else if (document.frm.employee_department.value == "") {
		alert("부서를 입력하세요.");
		document.frm.employee_department.focus();
		return false;
	} else if (document.frm.employee_self_introduction.value == "") {
		alert("자기소개를 입력하세요.");
		document.frm.employee_self_introduction.focus();
		return false;
	} else {
		document.frm.action = "employee_join_post";
		document.frm.submit();
		return true;
	}
	
}


function employee_id_search() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	}
	
	var url = "employee_id_search?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1",
	"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function employee_pwd_search() {
	
	if (document.frm.employee_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.employee_pwd.focus();
		return false;
	}
	
	var url = "employee_pwd_search?employee_pwd=" + document.frm.employee_pwd.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function employee_menu() {
	
	document.frm.action = "employee_menu";
	document.frm.submit();
	
}

function employee_join() {
	
	document.frm.action = "employee_join";
	document.frm.submit();
	
}

function employee_idpwd_search() {
	
	document.frm.action = "employee_idpwd_search";
	document.frm.submit();
	
}

function employee_out() {
	
	document.frm.action = "employee_out_post";
	document.frm.submit();
	
}

function hrd_mymenu() {
	
	document.frm.action = "hrd_mymenu";
	document.frm.submit();
	
}

function hrd_join() {
	
	document.frm.action = "hrd_join";
	document.frm.submit();
	
}

function hrd_idpwd_search() {
	
	document.frm.action = "hrd_idpwd_search";
	document.frm.submit();
	
}

function hrd_out() {
	
	document.frm.action = "hrd_out_post";
	document.frm.submit();
	
}

function hrd_join_post() {
	
	if (document.frm.hrd_admin_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	} else if (document.frm.hrd_admin_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 해주세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	} else if (document.frm.hrd_admin_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.hrd_admin_pwd.focus();
		return false;
	} else if (document.frm.hrd_admin_name.value == "") {
		alert("이름을 입력하세요.");
		document.frm.hrd_admin_name.focus();
		return false;
	} else if (document.frm.hrd_admin_phone.value == "") {
		alert("전화번호를 입력하세요.");
		document.frm.hrd_admin_phone.focus();
		return false;
	} else if (document.frm.hrd_admin_live.value == "") {
		alert("주소를 입력하세요.");
		document.frm.hrd_admin_live.focus();
		return false;
	} else {
		document.frm.action = "hrd_join_post";
		document.frm.submit();
		return true;
	}
}

function hrd_id_search() {
	
	if (document.frm.hrd_admin_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	}
	
	var url = "hrd_id_search?hrd_admin_id=" + document.frm.hrd_admin_id.value;
	
	window.open(url, "_blank_1", 
			"toolbark=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function hrd_id_search_admin() {
	
	if (document.frm.hrd_admin_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	}
	
	var url = "hrd_id_search_admin?hrd_admin_id=" + document.frm.hrd_admin_id.value;
	
	window.open(url, "_blank_1", 
			"toolbark=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function hrd_pwd_search() {
	
	if (document.frm.hrd_admin_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.hrd_admin_pwd.focus();
		return false;
	}
	
	var url = "hrd_pwd_search?hrd_admin_pwd=" + document.frm.hrd_admin_pwd.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function hrd_pwd_search_admin() {
	
	if (document.frm.hrd_admin_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.hrd_admin_pwd.focus();
		return false;
	}
	
	var url = "hrd_pwd_search_admin?hrd_admin_pwd=" + document.frm.hrd_admin_pwd.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function admin_join_post() {
	
	if (document.frm.hrd_admin_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	} else if (document.frm.hrd_admin_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 눌러주세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	} else if (document.frm.hrd_admin_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.hrd_admin_pwd.focus();
		return false;
	} else if (document.frm.hrd_admin_name.value == "") {
		alert("이름을 입력하세요.");
		document.frm.hrd_admin_name.focus();
		return false;
	} else if (document.frm.hrd_admin_phone.value == "") {
		alert("전화번호를 입력하세요.");
		document.frm.hrd_admin_phone.focus();
		return false;
	} else if (document.frm.hrd_admin_live.value == "") {
		alert("주소를 입력하세요.");
		document.frm.hrd_admin_live.focus();
		return false;
	} else {
		document.frm.action = "admin_join_post";
		document.frm.submit();
		return true;
	}
}

function admin_id_pwd_search() {
	
	document.frm.action = "admin_id_pwd_search";
	document.frm.submit();
	
}

function hrd_id_search_admin() {
	
	if (document.frm.hrd_admin_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	}
	
	var url = "hrd_id_search_admin?hrd_admin_id=" + document.frm.hrd_admin_id.value;
	
	window.open(url, "_blank_1", 
			"toolbark=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function hrd_pwd_search_admin() {
	
	if (document.frm.hrd_admin_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.hrd_admin_pwd.focus();
		return false;
	}
	
	var url = "hrd_pwd_search_admin?hrd_admin_pwd=" + document.frm.hrd_admin_pwd.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}


function employee_join_main() {
	
	document.frm.action = "employee_join_main";
	document.frm.submit();
	
}

function employee_join_main_post() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 눌러주세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.employee_pwd.focus();
		return false;
	} else if (document.frm.employee_name.value == "") {
		alert("이름을 입력하세요.");
		document.frm.employee_name.focus();
		return false;
	} else if (document.frm.employee_gender.value == "") {
		alert("성별을 입력하세요.");
		document.frm.employee_gender.focus();
		return false;
	} else if (document.frm.employee_age.value == "") {
		alert("나이를 입력하세요.");
		document.frm.employee_age.focus();
		return false;
	} else if (isNaN(document.frm.employee_age.value)) {
		alert("나이를 숫자로 입력하세요.");
		document.frm.employee_age.focus();
		return false;
	} else if (document.frm.employee_blood_type.value == "") {
		alert("혈액형을 입력하세요.");
		document.frm.employee_blood_type.focus();
		return false;
	} else if (document.frm.employee_live.value == "") {
		alert("주소를 입력하세요.");
		document.frm.employee_live.focus();
		return false;
	} else if (document.frm.employee_position.value == "") {
		alert("직위를 입력하세요.");
		document.frm.employee_position.focus();
		return false;
	} else if (document.frm.employee_department.value == "") {
		alert("부서를 입력하세요.");
		document.frm.employee_department.focus();
		return false;
	} else if (document.frm.employee_self_introduction.value == "") {
		alert("자기소개를 입력하세요.");
		document.frm.employee_self_introduction.focus();
		return false;
	} else {
		document.frm.action = "employee_join_main_post";
		document.frm.submit();
		return true;
	}
	
}

function employee_id_pwd_search_main() {
	
	document.frm.action = "employee_id_pwd_search_main";
	document.frm.submit();
	
}

function employee_id_search_main() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	}
	
	var url = "employee_id_search_main?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1",
	"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function employee_pwd_search_main() {
	
	if (document.frm.employee_pwd.value == "") {
		alert("비밀번호를 입력하세요.");
		document.frm.employee_pwd.focus();
		return false;
	}
	
	var url = "employee_pwd_search_main?employee_pwd=" + document.frm.employee_pwd.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function employee_join_jungbuk() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	}
	
	var url = "employee_join_jungbuk?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function employee_check_jungbuk() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	}
	
	var url = "employee_check_jungbuk?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}





