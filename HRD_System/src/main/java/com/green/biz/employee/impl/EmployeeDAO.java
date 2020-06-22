package com.green.biz.employee.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.employee.EmployeeVO;
import com.green.biz.util.Criteria;

@Repository
public class EmployeeDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// ��� �α����� �� ������ ���� ����
	public EmployeeVO loginEmployee(EmployeeVO evo) {
		System.out.println("mybatis�� loginEmployee() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.loginEmployee", evo);
	}
	
	// ȸ������ �� �� ȸ�� ���
	public void insertEmployee(EmployeeVO evo) {
		System.out.println("mybatis�� insertEmployee() ��� ó��");
		
		mybatis.insert("EmployeeDAO.insertEmployee", evo);
	}
	
	// ȸ�� �ϳ� ��� ��������
	public EmployeeVO getEmployee(String employee_id) {
		System.out.println("mybatis�� getEmployee() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getEmployee", employee_id);
	}
	
	// ��й�ȣ ã��
	public EmployeeVO getEmployeePwd(String employee_pwd) {
		System.out.println("mybatis�� getEmployeePwd() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getEmployeePwd", employee_pwd);
	}
	
	public void deleteEmployee(String employee_pwd) {
		System.out.println("mybatis�� deleteEmployee() ��� ó��");
		
		mybatis.delete("EmployeeDAO.deleteEmployee", employee_pwd);
	}
	
	public List<EmployeeVO> listAllEmployee() {
		System.out.println("mybatis�� listAllEmployee() ��� ó��");
		return mybatis.selectList("EmployeeDAO.listAllEmployee");
	}
	
	public int countEmployee(String employee_name) {
		System.out.println("mybatis�� countEmployee() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.countEmployee", employee_name);
	}

	public List<EmployeeVO> getListWithPaging(Criteria criteria, String key) {
		System.out.println("mybatis�� getListWithPaging() ��� ó��");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("EmployeeDAO.listWithPaging", map);
	}
	
	public List<EmployeeVO> list3Employee() {
		System.out.println("mybatis�� list3Employee() ��� ó��");
		
		return mybatis.selectList("EmployeeDAO.list3Employee");
	}
	
	public int getChartEmployee() {
		System.out.println("mybatis�� getChartEmployee() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getChartEmployee");
	}
	
	public int getChartAssistantManager() {
		System.out.println("mybatis�� getChartAssistantManager() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getChartAssistantManager");
	}
	
	public int getChartSectionChief() {
		System.out.println("mybatis�� getChartSectionChief() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getChartSectionChief");
	}
	
	public int getDeputyDepartmentHead() {
		System.out.println("mybatis�� getDeputyDepartmentHead() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getDeputyDepartmentHead");
	}
	
	public int getDepartmentHead() {
		System.out.println("mybatis�� getDepartmentHead() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getDepartmentHead");
	}
	
	public int getChartSeoul() {
		System.out.println("mybatis�� getChartSeoul() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getChartSeoul");
	}
	
	public int getChartBusan() {
		System.out.println("mybatis�� getChartBusan() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getChartBusan");
	}
	
	public int getChartIncheon() {
		System.out.println("mybatis�� getChartIncheon() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getChartIncheon");
	}
	
	public int getChartKyungGi() {
		System.out.println("mybatis�� getChartKyungGi() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getChartKyungGi");
	}
	
	public int getCheongNam() {
		System.out.println("mybatis�� getCheongNam() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getCheongNam");
	}
	
	public int getKyungName() {
		System.out.println("mybatis�� getKyungName() ��� ó��");
		
		return mybatis.selectOne("EmployeeDAO.getKyungName");
	}
	
	
	
	
}

