package com.green.biz.retirement.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.retirement.RetirementVO;
import com.green.biz.util.Criteria;

@Repository
public class RetirementDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<RetirementVO> listAllRetirement() {
		System.out.println("mybatis�� listAllRetirement() ��� ó��");
		return mybatis.selectList("RetirementDAO.listAllRetirement");
	}
	
	public RetirementVO getRetirement(int retirement_number) {
		System.out.println("mybatis�� getRetirement() ��� ó��");
		return mybatis.selectOne("RetirementDAO.getRetirement", retirement_number);
	}
	
	public RetirementVO getRetirementByEmployeeId(String employee_id) {
		System.out.println("mybatis�� getRetirementByEmployeeId() ��� ó��");
		return mybatis.selectOne("RetirementDAO.getRetirementByEmployeeId", employee_id);
	}
	
	public void insertRetirement(RetirementVO rvo) {
		System.out.println("mybatis�� insertRetirement() ��� ó��");
		mybatis.insert("RetirementDAO.insertRetirement", rvo);
	}
	
	public void deleteRetirement(int retirement_number) {
		System.out.println("mybatis�� deleteRetirement() ��� ó��");
		mybatis.delete("RetirementDAO.deleteRetirement", retirement_number);
	}
	
	public int countRetirementList(String employee_id) {
		System.out.println("mybatis�� countRetirementList() ��� ó��");
		
		return mybatis.selectOne("RetirementDAO.countRetirementList", employee_id);
	}
	
	public List<RetirementVO> getListWithPaging(Criteria criteria, String key) {
		System.out.println("mybatis�� getListWithPaging() ��� ó��");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("RetirementDAO.listWithPaging", map);
	}
	
	public int getChart5000000DowmEmployee() {
		System.out.println("mybatis�� getChart5000000DowmEmployee() ��� ó��");
		
		return mybatis.selectOne("RetirementDAO.getChart5000000DowmEmployee");
	}
	
	public int getChart10000000DowmEmployee() {
		System.out.println("mybatis�� getChart10000000DowmEmployee() ��� ó��");
		
		return mybatis.selectOne("RetirementDAO.getChart10000000DowmEmployee");
	}
	
	public int getChart10000000OverEmployee() {
		System.out.println("mybatis�� getChart10000000OverEmployee() ��� ó��");
		
		return mybatis.selectOne("RetirementDAO.getChart10000000OverEmployee");
	}
	
	public List<RetirementVO> list3Retirement() {
		System.out.println("mybatis�� list3Retirement() ��� ó��");
		
		return mybatis.selectList("RetirementDAO.list3Retirement");
	}
	
	
	
}


