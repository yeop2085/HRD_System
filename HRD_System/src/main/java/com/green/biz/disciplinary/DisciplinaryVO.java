package com.green.biz.disciplinary;

import java.sql.Date;

public class DisciplinaryVO {
	
	private int disciplinary_number;
	private String employee_id;
	private String disciplinary_and_so_on;
	private String disciplinary_reason;
	private Date disciplinary_regdate;
	
	public int getDisciplinary_number() {
		return disciplinary_number;
	}
	
	public String getEmployee_id() {
		return employee_id;
	}
	
	public String getDisciplinary_and_so_on() {
		return disciplinary_and_so_on;
	}
	
	public String getDisciplinary_reason() {
		return disciplinary_reason;
	}
	
	public Date getDisciplinary_regdate() {
		return disciplinary_regdate;
	}
	
	public void setDisciplinary_number(int disciplinary_number) {
		this.disciplinary_number = disciplinary_number;
	}
	
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	
	public void setDisciplinary_and_so_on(String disciplinary_and_so_on) {
		this.disciplinary_and_so_on = disciplinary_and_so_on;
	}
	
	public void setDisciplinary_reason(String disciplinary_reason) {
		this.disciplinary_reason = disciplinary_reason;
	}
	
	public void setDisciplinary_regdate(Date disciplinary_regdate) {
		this.disciplinary_regdate = disciplinary_regdate;
	}
	
	public String toString() {
		return "DisciplinaryVO [disciplinary_number : " + disciplinary_number + ", employee_id : " + employee_id + 
				", disciplinary_and_so_on : " + disciplinary_and_so_on + ", disciplinary_reason : " + disciplinary_reason + 
				", disciplinary_regdate : " + disciplinary_regdate + " ]";
	}	
}


