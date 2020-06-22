package com.green.biz.salary.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.salary.SalaryService;
import com.green.biz.salary.SalaryVO;
import com.green.biz.util.Criteria;

@Service("salaryService")
public class SalaryServiceImpl implements SalaryService {
	
	@Autowired
	private SalaryDAO salaryDAO;
	
	@Override
	public List<SalaryVO> listAllSalary() {
		return salaryDAO.listAllSalary();
	}

	@Override
	public SalaryVO getSalary(int salary_number) {
		return salaryDAO.getSalary(salary_number);
	}

	@Override
	public SalaryVO getSalaryByEmployeeId(String employee_id) {
		return salaryDAO.getSalaryByEmployeeId(employee_id);
	}

	@Override
	public void insertSalary(SalaryVO svo) {
		salaryDAO.insertSalary(svo);
	}

	@Override
	public void deleteSalary(int salary_number) {
		salaryDAO.deleteSalary(salary_number);
	}
	
	@Override
	public int countSalary(String employee_id) {
		return salaryDAO.countSalary(employee_id);
	}

	@Override
	public List<SalaryVO> getListWithPaging(Criteria criteria, String key) {
		return salaryDAO.getListWithPaging(criteria, key);
	}

	@Override
	public List<SalaryVO> list3Salary() {
		return salaryDAO.list3Salary();
	}

	@Override
	public int getChart2000000DownEmployee() {
		return salaryDAO.getChart2000000DownEmployee();
	}

	@Override
	public int getChart3000000DownEmployee() {
		return salaryDAO.getChart3000000DownEmployee();
	}

	@Override
	public int getChart4000000DownEmployee() {
		return salaryDAO.getChart4000000DownEmployee();
	}

	@Override
	public int getChart5000000DownEmployee() {
		return salaryDAO.getChart5000000DownEmployee();
	}

	@Override
	public int getChart5000000OverEmployee() {
		return salaryDAO.getChart5000000OverEmployee();
	}
	
	
	
}


