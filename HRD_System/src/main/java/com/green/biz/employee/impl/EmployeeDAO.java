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
	
	// 사원 로그인할 때 가져와 쓰는 거임
	public EmployeeVO loginEmployee(EmployeeVO evo) {
		System.out.println("mybatis로 loginEmployee() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.loginEmployee", evo);
	}
	
	// 회원가입 할 때 회원 등록
	public void insertEmployee(EmployeeVO evo) {
		System.out.println("mybatis로 insertEmployee() 기능 처리");
		
		mybatis.insert("EmployeeDAO.insertEmployee", evo);
	}
	
	// 회원 하나 목록 가져오기
	public EmployeeVO getEmployee(String employee_id) {
		System.out.println("mybatis로 getEmployee() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getEmployee", employee_id);
	}
	
	// 비밀번호 찾기
	public EmployeeVO getEmployeePwd(String employee_pwd) {
		System.out.println("mybatis로 getEmployeePwd() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getEmployeePwd", employee_pwd);
	}
	
	public void deleteEmployee(String employee_pwd) {
		System.out.println("mybatis로 deleteEmployee() 기능 처리");
		
		mybatis.delete("EmployeeDAO.deleteEmployee", employee_pwd);
	}
	
	public List<EmployeeVO> listAllEmployee() {
		System.out.println("mybatis로 listAllEmployee() 기능 처리");
		return mybatis.selectList("EmployeeDAO.listAllEmployee");
	}
	
	public int countEmployee(String employee_name) {
		System.out.println("mybatis로 countEmployee() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.countEmployee", employee_name);
	}

	public List<EmployeeVO> getListWithPaging(Criteria criteria, String key) {
		System.out.println("mybatis로 getListWithPaging() 기능 처리");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("EmployeeDAO.listWithPaging", map);
	}
	
	public List<EmployeeVO> list3Employee() {
		System.out.println("mybatis로 list3Employee() 기능 처리");
		
		return mybatis.selectList("EmployeeDAO.list3Employee");
	}
	
	public int getChartEmployee() {
		System.out.println("mybatis로 getChartEmployee() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getChartEmployee");
	}
	
	public int getChartAssistantManager() {
		System.out.println("mybatis로 getChartAssistantManager() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getChartAssistantManager");
	}
	
	public int getChartSectionChief() {
		System.out.println("mybatis로 getChartSectionChief() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getChartSectionChief");
	}
	
	public int getDeputyDepartmentHead() {
		System.out.println("mybatis로 getDeputyDepartmentHead() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getDeputyDepartmentHead");
	}
	
	public int getDepartmentHead() {
		System.out.println("mybatis로 getDepartmentHead() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getDepartmentHead");
	}
	
	public int getChartSeoul() {
		System.out.println("mybatis로 getChartSeoul() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getChartSeoul");
	}
	
	public int getChartBusan() {
		System.out.println("mybatis로 getChartBusan() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getChartBusan");
	}
	
	public int getChartIncheon() {
		System.out.println("mybatis로 getChartIncheon() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getChartIncheon");
	}
	
	public int getChartKyungGi() {
		System.out.println("mybatis로 getChartKyungGi() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getChartKyungGi");
	}
	
	public int getCheongNam() {
		System.out.println("mybatis로 getCheongNam() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getCheongNam");
	}
	
	public int getKyungName() {
		System.out.println("mybatis로 getKyungName() 기능 처리");
		
		return mybatis.selectOne("EmployeeDAO.getKyungName");
	}
	
	
	
	
}

