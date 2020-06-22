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
		System.out.println("mybatis로 listAllDisciplinary() 기능 처리");
		return mybatis.selectList("DisciplinaryDAO.listAllDisciplinary");
	}
	
	public DisciplinaryVO getDisciplinary(int disciplinary_number) {
		System.out.println("mybatis로 getDisciplinary() 기능 처리");
		return mybatis.selectOne("DisciplinaryDAO.getDisciplinary", disciplinary_number);
	}
	
	public DisciplinaryVO getDisciplinaryByEmployeeId(String employee_id) {
		System.out.println("mybatis로 getDisciplinaryByEmployeeId() 기능 처리");
		return mybatis.selectOne("DisciplinaryDAO.getDisciplinaryByEmployeeId", employee_id);
	}
	
	public void insertDisciplinary(DisciplinaryVO dvo) {
		System.out.println("mybatis로 insertDisciplinary() 기능 처리");
		mybatis.insert("DisciplinaryDAO.insertDisciplinary", dvo);
	}
	
	public void deleteDisciplinary(int disciplinary_number) {
		System.out.println("mybatis로 deleteDisciplinary() 기능 처리");
		mybatis.delete("DisciplinaryDAO.deleteDisciplinary", disciplinary_number);
	}
	
	public int countDisciplinary(String employee_id) {
		System.out.println("mybatis로 countDisciplinary() 기능 처리");
		
		return mybatis.selectOne("DisciplinaryDAO.countDisciplinary", employee_id);
	}

	public List<DisciplinaryVO> getListWithPaging(Criteria criteria, String key) {
		System.out.println("mybatis로 countDisciplinary() 기능 처리");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("DisciplinaryDAO.listWithPaging", map);
	}
	
	public List<DisciplinaryVO> list3Disciplinary() {
		System.out.println("mybatis로 countDisciplinary() 기능 처리");
		
		return mybatis.selectList("DisciplinaryDAO.list3Disciplinary");
	}
	
	public int getChartDisciplinaryNo() {
		System.out.println("mybatis로 getChartDisciplinaryPercent() 기능 처리");
		
		return mybatis.selectOne("DisciplinaryDAO.getChartDisciplinaryNo");
	}
	
	public int getChartDisciplinaryYes() {
		System.out.println("mybatis로 getChartDisciplinaryYes() 기능 처리");
		
		return mybatis.selectOne("DisciplinaryDAO.getChartDisciplinaryYes");
	}
	
	
}

