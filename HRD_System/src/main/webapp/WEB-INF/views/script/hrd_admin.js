/**
 * 
 */

function hrd_information() {
	
	document.frm.action = "hrd_information";
	document.frm.submit();
	
}

function hrd_enrollment() {
	
	document.frm.action = "hrd_enrollment";
	document.frm.submit();
	
}

function hrd_delete() {
	
	document.frm.action = "hrd_delete";
	document.frm.submit();
	
}

function hrd_enroll() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 해주세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 실행해주세요.");
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
	} else if (document.frm.employee_and_so_on.value == "") {
		alert("기타사항을 입력하세요.");
		document.frm.employee_and_so_on.focus();
		return false;
	} else {
		document.frm.action = "hrd_enroll";
		document.frm.submit();
		return true;
	}
	
}

function search_employee() {
	
	document.frm.action = "hrd_information";
	document.frm.submit();
	
}

function hrd_enroll_jungbuk() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.employee_id.focus();
		return false;
	}
	
	var url = "hrd_enroll_jungbuk?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function hrd_admin_id_jungbuk() {
	
	if (document.frm.hrd_admin_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	} 
	
	var url = "hrd_admin_id_jungbuk?hrd_admin_id=" + document.frm.hrd_admin_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function admin_jungbuk1() {
	
	if (document.frm.hrd_admin_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.hrd_admin_id.focus();
		return false;
	} 
	
	var url = "admin_jungbuk1?hrd_admin_id=" + document.frm.hrd_admin_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}







