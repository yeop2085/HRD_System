/**
 * 
 */

function disciplinary_id_confirm() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} 
	
	var url = "disciplinary_id_confirm?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function disciplinary_enroll_post() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 실행해 주세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.disciplinary_and_so_on.value == "") {
		alert("기타정보를 입력하세요.");
		document.frm.disciplinary_and_so_on.focus();
		return false;
	} else if (document.frm.disciplinary_reason.value == "") {
		alert("징계사유를 입력하세요.");
		document.frm.disciplinary_reason.focus();
		return false;
	} else {
		document.frm.action = "disciplinary_enroll_post";
		document.frm.submit();
		return true
	}
}

function search_disciplinary() {
	
	document.frm.action = "disciplinary_list";
	document.frm.submit();
	
}





