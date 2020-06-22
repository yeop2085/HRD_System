package com.green.biz.salary;

public class SalaryVO {
	
	private int salary_number;
	private String employee_id;
	private String employee_and_so_on;
	private int employee_salary;
	private String employee_work_period;
	
	public int getSalary_number() {
		return salary_number;
	}
	
	public String getEmployee_id() {
		return employee_id;
	}
	
	public String getEmployee_and_so_on() {
		return employee_and_so_on;
	}
	
	public int getEmployee_salary() {
		return employee_salary;
	}
	
	public String getEmployee_work_period() {
		return employee_work_period;
	}
	
	public void setSalary_number(int salary_number) {
		this.salary_number = salary_number;
	}
	
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	
	public void setEmployee_and_so_on(String employee_and_so_on) {
		this.employee_and_so_on = employee_and_so_on;
	}
	
	public void setEmployee_salary_number(int employee_salary) {
		this.employee_salary= employee_salary;
	}
	
	public void setEmployee_work_period(String employee_work_period) {
		this.employee_work_period = employee_work_period;
	}
	
	public String toString() {
		return "SalaryVO [salary_number : " + salary_number + ", employee_id : " + employee_id + ", employee_and_so_on : " + employee_and_so_on + 
				", employee_salary : " + employee_salary + ", employee_work_period : " + employee_work_period + " ]";
	}
	
}


