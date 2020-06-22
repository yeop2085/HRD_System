package com.green.biz.vacation;

import java.sql.Date;

import com.green.biz.employee.EmployeeVO;

public class VacationVO {
	
	private int vacation_number;
	private String employee_id;
	private String vacation_reason;
	private Date vacation_regdate;
	private EmployeeVO employeeVO;
	
	public int getVacation_number() {
		return vacation_number;
	}
	
	public String getEmployee_id() {
		return employee_id;
	}
	
	public String getVacation_reason() {
		return vacation_reason;
	}
	
	public Date getVacation_regdate() {
		return vacation_regdate;
	}
	
	public String EmployeeVO_Employee_name() {
		return employeeVO.getEmployee_name();
	}
	
	public EmployeeVO getEmployeeVO() {
		return employeeVO;
	}
	
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	
	public void setVacation_reason(String vacation_reason) {
		this.vacation_reason = vacation_reason;
	}
	
	public void setVacation_regdate(Date vacation_regdate) {
		this.vacation_regdate = vacation_regdate;
	}
	
	public void setEmployeeVO(EmployeeVO employeeVO) {
		this.employeeVO = employeeVO;
	}
	
	public String toString() {
		return "VacationVO [vacation_number : " + vacation_number + ", employee_id : " + employee_id + 
				", vacation_reason : " + vacation_reason + ", vacation_regdate : " + vacation_regdate + 
				", employeeVO : " + employeeVO + " ]";
	}
	
}


