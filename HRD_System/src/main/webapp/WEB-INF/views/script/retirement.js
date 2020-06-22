/**
 * 
 */

function retirement_information() {
	
	document.frm.action = "retirement_information";
	document.frm.submit();
	
}


function retirement_id_confirm() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} 
	
	var url = "retirement_id_confirm?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function retirement_enroll_post() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 체크해주세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.retirement_and_so_on.value == "") {
		alert("기타정보를 입력하세요.");
		document.frm.retirement_and_so_on.focus();
		return false;
	} else if (document.frm.retirement_salary.value == "") {
		alert("퇴직금을 입력하세요.");
		document.frm.retirement_salary.focus();
		return false;
	} else if (isNaN(document.frm.retirement_salary.value)) {
		alert("퇴직금을 숫자로 입력해 주세요.");
		document.frm.retirement_salary.focus();
	} else if (document.frm.retirement_retire.value == "") {
		alert("퇴직날짜를 입력하세요.");
		document.frm.retirement_retire.focus();
		return false;
	} else {
		document.frm.action = "retirement_enroll_post";
		document.frm.submit();
	}
	
}

function search_retirement_ByEmployeeId() {
	
	document.frm.action = "retirement_information";
	document.frm.submit();
	
}








