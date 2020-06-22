package com.green.biz.disciplinary.impl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.disciplinary.DisciplinaryVO;
import com.green.biz.util.Criteria;

@Repository
public class DisciplinaryDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<DisciplinaryVO> listAllDisciplinary() {
		System.out.println("mybatis�� listAllDisciplinary() ��� ó��");
		return mybatis.selectList("DisciplinaryDAO.listAllDisciplinary");
	}
	
	public DisciplinaryVO getDisciplinary(int disciplinary_number) {
		System.out.println("mybatis�� getDisciplinary() ��� ó��");
		return mybatis.selectOne("DisciplinaryDAO.getDisciplinary", disciplinary_number);
	}
	
	public DisciplinaryVO getDisciplinaryByEmployeeId(String employee_id) {
		System.out.println("mybatis�� getDisciplinaryByEmployeeId() ��� ó��");
		return mybatis.selectOne("DisciplinaryDAO.getDisciplinaryByEmployeeId", employee_id);
	}
	
	public void insertDisciplinary(DisciplinaryVO dvo) {
		System.out.println("mybatis�� insertDisciplinary() ��� ó��");
		mybatis.insert("DisciplinaryDAO.insertDisciplinary", dvo);
	}
	
	public void deleteDisciplinary(int disciplinary_number) {
		System.out.println("mybatis�� deleteDisciplinary() ��� ó��");
		mybatis.delete("DisciplinaryDAO.deleteDisciplinary", disciplinary_number);
	}
	
	public int countDisciplinary(String employee_id) {
		System.out.println("mybatis�� countDisciplinary() ��� ó��");
		
		return mybatis.selectOne("DisciplinaryDAO.countDisciplinary", employee_id);
	}

	public List<DisciplinaryVO> getListWithPaging(Criteria criteria, String key) {
		System.out.println("mybatis�� countDisciplinary() ��� ó��");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("DisciplinaryDAO.listWithPaging", map);
	}
	
	public List<DisciplinaryVO> list3Disciplinary() {
		System.out.println("mybatis�� countDisciplinary() ��� ó��");
		
		return mybatis.selectList("DisciplinaryDAO.list3Disciplinary");
	}
	
	public int getChartDisciplinaryNo() {
		System.out.println("mybatis�� getChartDisciplinaryPercent() ��� ó��");
		
		return mybatis.selectOne("DisciplinaryDAO.getChartDisciplinaryNo");
	}
	
	public int getChartDisciplinaryYes() {
		System.out.println("mybatis�� getChartDisciplinaryYes() ��� ó��");
		
		return mybatis.selectOne("DisciplinaryDAO.getChartDisciplinaryYes");
	}
	
	
}

