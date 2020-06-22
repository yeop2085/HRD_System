/**
 * 
 */

function organization_information() {
	
	document.frm.action = "organization_information";
	document.frm.submit();
	
}

function salary_information() {
	
	document.frm.action = "salary_information";
	document.frm.submit();
	
}

function work_information() {
	
	document.frm.action = "work_information";
	document.frm.submit();
	
}

function information_delete() {
	
	document.frm.action = "information_delete_ByAdmin";
	document.frm.submit();
	
}

function organization_information_ByAdmin() {
	
	document.frm.action = "organization_information_ByAdmin";
	document.frm.submit();
	
}

function salary_information_ByAdmin() {
	
	document.frm.action = "salary_information_ByAdmin";
	document.frm.submit();
	
}

function work_information_ByAdmin() {
	
	document.frm.action = "work_information_ByAdmin";
	document.frm.submit();
	
}

function information_write_ByAdmin() {
	
	if (document.frm.title.value == "") {
		alert("제목을 입력해주세요.");
		document.frm.title.focus();
	} else if (document.frm.content.value == "") {
		alert("내용을 입력해주세요.");
		document.frm.content.focus();
	} else {
		document.frm.action = "information_write_ByAdmin";
		document.frm.submit();
	}
}

function search_title() {
	
	document.frm.action = "information_ByAdmin";
	document.frm.submit();
	
}

function search_title_worker() {
	
	document.frm.action = "information";
	document.frm.submit();
	
}











