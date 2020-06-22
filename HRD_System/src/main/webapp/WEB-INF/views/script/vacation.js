/**
 * 
 */

function disciplinary_list() {
	
	document.frm.action = "disciplinary_list";
	document.frm.submit();
	
}

function disciplinary_list_post() {
	
	document.frm.action = "disciplinary_list_post";
	document.frm.submit();
	
}

function vacation_management() {
	
	document.frm.action = "vacation_management";
	document.frm.submit();
	
}

function vacation_management_post() {
	
	document.frm.action = "vacation_management_post";
	document.frm.submit();
	
}

function vacation_id_confirm() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	}
	
	var url = "vacation_id_confirm?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function vacation_enroll_post() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 눌러주세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.vacation_reason.value == "") {
		alert("연차사유를 입력하세요.");
		document.frm.vacation_reason.focus();
		return false;
	} else {
		document.frm.action = "vacation_enroll_post";
		document.frm.submit();
	}
}

function search_vacaction() {
	
	document.frm.action = "vacation_management";
	document.frm.submit();
	
}







