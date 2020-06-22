package com.green.biz.retirement;

import java.sql.Date;

public class RetirementVO {
	
	private int retirement_number;
	private String employee_id;
	private String retirement_and_so_on;
	private int retirement_salary;
	private Date retirement_retire;
	
	public int getRetirement_number() {
		return retirement_number;
	}
	
	public String getEmployee_id() {
		return employee_id;
	}
	
	public String getRetirement_and_so_on() {
		return retirement_and_so_on;
	}
	
	public int getRetirement_salary() {
		return retirement_salary;
	}
	
	public Date getRetirement_retire() {
		return retirement_retire;
	}
	
	public void setRetirement_number(int retirement_number) {
		this.retirement_number = retirement_number;
	}
	
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	
	public void setRetirement_and_so_on(String retirement_and_so_on) {
		this.retirement_and_so_on = retirement_and_so_on;
	}
	
	public void setRetirement_salary(int retirement_salary) {
		this.retirement_salary = retirement_salary;
	}
	
	public void setRetirement_retire(Date retirement_retire) {
		this.retirement_retire = retirement_retire;
	}
	
	public String toString() {
		return "RetirementVO [retirement_number : " + retirement_number + ", employee_id : " + employee_id + 
				", retirement_and_so_on : " + retirement_and_so_on + ", retirement_salary : " + retirement_salary + 
				", retirement_retire : " + retirement_retire + " ]";
	}
	
}

