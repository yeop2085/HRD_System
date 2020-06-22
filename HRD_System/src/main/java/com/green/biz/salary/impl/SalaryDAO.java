package com.green.biz.salary.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.salary.SalaryVO;
import com.green.biz.util.Criteria;

@Repository
public class SalaryDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<SalaryVO> listAllSalary() {
		System.out.println("mybatis�� listAllSalary() ��� ȣ��");
		return mybatis.selectList("SalaryDAO.listAllSalary");
	}
	
	public SalaryVO getSalary(int salary_number) {
		System.out.println("mybatis�� getSalary() ��� ȣ��");
		return mybatis.selectOne("SalaryDAO.getSalary", salary_number);
	}
	
	public SalaryVO getSalaryByEmployeeId(String employee_id) {
		System.out.println("mybatis�� getSalaryByEmployeeId() ��� ȣ��");
		return mybatis.selectOne("SalaryDAO.getSalaryByEmployeeId", employee_id);
	}
	
	public void insertSalary(SalaryVO svo) {
		System.out.println("mybatis�� insertSalary() ��� ȣ��");
		mybatis.insert("SalaryDAO.insertSalary", svo);
	}
	
	public void deleteSalary(int salary_number) {
		System.out.println("mybatis�� deleteSalary() ��� ȣ��");
		mybatis.delete("SalaryDAO.deleteSalary", salary_number);
	}
	
	public int countSalary(String employee_id) {
		System.out.println("mybatis�� countSalary() ��� ȣ��");
		
		return mybatis.selectOne("SalaryDAO.countSalaryList", employee_id);
	}
	
	public List<SalaryVO> getListWithPaging(Criteria criteria, String key) {
		System.out.println("mybatis�� getListWithPaging() ��� ȣ��");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("SalaryDAO.listWithPaging", map);
	}
	
	public List<SalaryVO> list3Salary() {
		System.out.println("mybatis�� list3Salary() ��� ȣ��");
		
		return mybatis.selectList("SalaryDAO.list3Salary");
	}
	
	public int getChart2000000DownEmployee() {
		System.out.println("mybatis�� getChart2000000DownEmployee() ��� ȣ��");
		
		return mybatis.selectOne("SalaryDAO.getChart2000000DownEmployee");
	}
	
	public int getChart3000000DownEmployee() {
		System.out.println("mybatis�� getChart3000000DownEmployee() ��� ȣ��");
		
		return mybatis.selectOne("SalaryDAO.getChart3000000DownEmployee");
	}
	
	public int getChart4000000DownEmployee() {
		System.out.println("mybatis�� getChart4000000DownEmployee() ��� ȣ��");
		
		return mybatis.selectOne("SalaryDAO.getChart4000000DownEmployee");
	}
	
	public int getChart5000000DownEmployee() {
		System.out.println("mybatis�� getChart5000000DownEmployee() ��� ȣ��");
		
		return mybatis.selectOne("SalaryDAO.getChart5000000DownEmployee");
	}
	
	public int getChart5000000OverEmployee() {
		System.out.println("mybatis�� getChart5000000OverEmployee() ��� ȣ��");
		
		return mybatis.selectOne("SalaryDAO.getChart5000000OverEmployee");
	}
	
	
}




