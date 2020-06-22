package com.green.biz.employee;

import java.sql.Date;

public class EmployeeVO {
	
	private String employee_id;
	private String employee_pwd;
	private String employee_name;
	private String employee_gender;
	private int employee_age;
	private String employee_blood_type;
	private String employee_live;
	private String employee_position;
	private String employee_department;
	private String employee_self_introduction;
	private String employee_and_so_on;
	private Date employee_regdate;
	
	public String getEmployee_id() {
		return employee_id;
	}
	
	public String getEmployee_pwd() {
		return employee_pwd;
	}
	
	public String getEmployee_name() {
		return employee_name;
	}
	
	public String getEmployee_gender() {
		return employee_gender;
	}
	
	public int getEmployee_age() {
		return employee_age;
	}
	
	public String getEmployee_blood_type() {
		return employee_blood_type;
	}
	
	public String getEmployee_live() {
		return employee_live;
	}
	
	public String getEmployee_position() {
		return employee_position;
	}
	
	public String getEmployee_department() {
		return employee_department;
	}
	
	public String getEmployee_self_introduction() {
		return employee_self_introduction;
	}
	
	public String getEmployee_and_so_on() {
		return employee_and_so_on;
	}
	
	public Date getEmployee_regdate() {
		return employee_regdate;
	}
	
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	
	public void setEmployee_pwd(String employee_pwd) {
		this.employee_pwd = employee_pwd;
	}
	
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	
	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}

	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}
	
	public void setEmployee_blood_type(String employee_blood_type) {
		this.employee_blood_type = employee_blood_type;
	}
	
	public void setEmployee_live(String employee_live) {
		this.employee_live = employee_live;
	}
	
	public void setEmployee_position(String employee_position) {
		this.employee_position = employee_position;
	}
	
	public void setEmployee_department(String employee_department) {
		this.employee_department = employee_department;
	}
	
	public void setEmployee_self_introduction(String employee_self_introduction) {
		this.employee_self_introduction = employee_self_introduction;
	}
	
	public void setEmployee_and_so_on(String employee_and_so_on) {
		this.employee_and_so_on = employee_and_so_on;
	}
	
	public void setEmployee_regdate(Date employee_regdate) {
		this.employee_regdate = employee_regdate;
	}
	
	public String toString() {
		return "EmployeeVO [employee_id : " + employee_id + ", employee_pwd : " + employee_pwd + 
				", employee_name : " + employee_name + ", employee_gender : " + employee_gender + 
				", employee_age : " + employee_age + ", employee_blood_type : " + employee_blood_type + 
				", employee_live : " + employee_live + ", employee_position : " + employee_position + 
				", employee_department : " + employee_department + ", employee_self_introduction : "  + employee_self_introduction + 
				", employee_and_so_on : " + employee_and_so_on + ", employee_regdate : " + employee_regdate + " ]";
	}
	
}



