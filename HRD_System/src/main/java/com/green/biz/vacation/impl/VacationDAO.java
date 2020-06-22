package com.green.biz.vacation.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.util.Criteria;
import com.green.biz.vacation.VacationVO;

@Repository
public class VacationDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<VacationVO> listAllVacaction() {
		System.out.println("mybatis�� listAllVacaction() ��� ó��");
		return mybatis.selectList("VacationDAO.listAllVacaction");
	}
	
	public VacationVO getVacation(int vacation_number) {
		System.out.println("mybatis�� getVacation() ��� ó��");
		return mybatis.selectOne("VacationDAO.getVacation", vacation_number);
	}
	
	public VacationVO getVacationByEmployeeId(String employee_id) {
		System.out.println("mybatis�� getVacationByEmployeeId() ��� ó��");
		return mybatis.selectOne("VacationDAO.getVacationByEmployeeId", employee_id);
	}
	
	public void deleteVacation(int vacation_number) {
		System.out.println("mybatis�� deleteVacation() ��� ó��");
		mybatis.delete("VacationDAO.deleteVacation", vacation_number);
	}
	
	public void insertVacation(VacationVO vvo) {
		System.out.println("mybatis�� insertVacation() ��� ó��");
		mybatis.insert("VacationDAO.insertVacation", vvo);
	}
	
	public int countVacation(String employee_id) {
		System.out.println("mybatis�� countVacation() ��� ó��");
		
		return mybatis.selectOne("VacationDAO.countVacation", employee_id);
	}

	public List<VacationVO> getListWithPaging(Criteria criteria, String key) {
		System.out.println("mybatis�� getListWithPaging() ��� ó��");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("VacationDAO.listWithPaging", map);
	}
	
	public int getChartMyungjeongVacation() {
		System.out.println("mybatis�� getChartMyungjeongVacation() ��� ó��");
		
		return mybatis.selectOne("VacationDAO.getChartMyungjeongVacation");
	}
	
	public int getChartOverseasTrip() {
		System.out.println("mybatis�� getChartOverseasTrip() ��� ó��");
		
		return mybatis.selectOne("VacationDAO.getChartOverseasTrip");
	}
	
	public int getChartFamilyTrip() {
		System.out.println("mybatis�� getChartFamilyTrip() ��� ó��");
		
		return mybatis.selectOne("VacationDAO.getChartFamilyTrip");
	}
	
	public int getChartSickLeave() {
		System.out.println("mybatis�� getChartSickLeave() ��� ó��");
		
		return mybatis.selectOne("VacationDAO.getChartSickLeave");
	}
	
	public List<VacationVO> list3Vacation() {
		System.out.println("mybatis�� list3Vacation() ��� ó��");
		
		return mybatis.selectList("VacationDAO.list3Vacation");
	}
	
	
}

