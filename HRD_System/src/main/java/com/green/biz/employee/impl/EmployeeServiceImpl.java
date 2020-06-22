package com.green.biz.employee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.employee.EmployeeService;
import com.green.biz.employee.EmployeeVO;
import com.green.biz.util.Criteria;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public EmployeeVO loginEmployee(EmployeeVO evo) {
		return employeeDAO.loginEmployee(evo);
	}

	@Override
	public void insertEmployee(EmployeeVO evo) {
		employeeDAO.insertEmployee(evo);
	}

	@Override
	public EmployeeVO getEmployee(String employee_id) {
		return employeeDAO.getEmployee(employee_id);
	}
	
	@Override
	public EmployeeVO getEmployeePwd(String employee_pwd) {
		return employeeDAO.getEmployeePwd(employee_pwd);
	}

	@Override
	public void deleteEmployee(String employee_pwd) {
		employeeDAO.deleteEmployee(employee_pwd);
	}

	@Override
	public List<EmployeeVO> listAllEmployee() {
		return employeeDAO.listAllEmployee();
	}

	@Override
	public int countEmployee(String employee_name) {
		return employeeDAO.countEmployee(employee_name);
	}

	@Override
	public List<EmployeeVO> getListWithPaging(Criteria criteria, String key) {
		return employeeDAO.getListWithPaging(criteria, key);
	}

	@Override
	public List<EmployeeVO> list3Employee() {
		return employeeDAO.list3Employee();
	}

	@Override
	public int getChartEmployee() {
		return employeeDAO.getChartEmployee();
	}

	@Override
	public int getChartAssistantManager() {
		return employeeDAO.getChartAssistantManager();
	}

	@Override
	public int getChartSectionChief() {
		return employeeDAO.getChartSectionChief();
	}
	
	@Override
	public int getDeputyDepartmentHead() {
		return employeeDAO.getDeputyDepartmentHead();
	}

	@Override
	public int getDepartmentHead() {
		return employeeDAO.getDepartmentHead();
	}

	@Override
	public int getChartSeoul() {
		return employeeDAO.getChartSeoul();
	}

	@Override
	public int getChartBusan() {
		return employeeDAO.getChartBusan();
	}

	@Override
	public int getChartIncheon() {
		return employeeDAO.getChartIncheon();
	}

	@Override
	public int getChartKyungGi() {
		return employeeDAO.getChartKyungGi();
	}

	@Override
	public int getCheongNam() {
		return employeeDAO.getCheongNam();
	}

	@Override
	public int getKyungName() {
		return employeeDAO.getKyungName();
	}
	
	
	
	
	
}
