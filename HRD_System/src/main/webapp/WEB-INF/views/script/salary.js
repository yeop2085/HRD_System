/**
 * 
 */

function salary_list() {
	
	document.frm.action = "salary_list";
	document.frm.submit();
	
}

function retirement_information() {
	
	document.frm.action = "retirement_information";
	document.frm.submit();
	
}

function salary_id_confirm() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	}
	
	var url = "salary_id_confirm?employee_id=" + document.frm.employee_id.value;
	
	window.open(url, "_blank_1", 
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
	
}

function salary_enroll_post() {
	
	if (document.frm.employee_id.value == "") {
		alert("아이디를 입력하세요.");
		document.frm.employee_id.focus();
		return false;
	} else if (document.frm.employee_id.value != document.frm.reid.value) {
		alert("아이디 중복확인을 눌러주세요.");
		document.frm.employdd_id.focus();
		return false;
	} else if (document.frm.employee_and_so_on.value == "") {
		alert("기타 정보를 입력하세요.");
		document.frm.employee_and_so_on.focus();
		return false;
	} else if (document.frm.employee_salary.value == "") {
		alert("급여를 입력하세요.");
		document.frm.employee_salary.focus();
		return false;
	} else if (isNaN(document.frm.employee_salary.value)) {
		alert("급여를 숫자로 입력하세요.");
		document.frm.employee_salary.focus();
		return false;
	} else if (document.frm.employee_work_period.value == "") {
		alert("근무기간을 입력하세요.");
		document.frm.employee_work_period.focus();
		return false;
	} else {
		document.frm.action = "salary_enroll_post";
		document.frm.submit();
		return true;
	}
}

function retirement_information() {
	
	document.frm.action = "retirement_information";
	document.frm.submit();
	
}

function search_employee_id() {
	
	document.frm.action = "salary_list";
	document.frm.submit();
	
}





