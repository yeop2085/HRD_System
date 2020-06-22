package com.green.biz.disciplinary.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.disciplinary.DisciplinaryService;
import com.green.biz.disciplinary.DisciplinaryVO;
import com.green.biz.util.Criteria;

@Service("disciplinaryService")
public class DisciplinaryServiceImpl implements DisciplinaryService {
	
	@Autowired
	private DisciplinaryDAO disciplinaryDAO;
	
	@Override
	public List<DisciplinaryVO> listAllDisciplinary() {
		return disciplinaryDAO.listAllDisciplinary();
	}

	@Override
	public DisciplinaryVO getDisciplinary(int disciplinary_number) {
		return disciplinaryDAO.getDisciplinary(disciplinary_number);
	}

	@Override
	public DisciplinaryVO getDisciplinaryByEmployeeId(String employee_id) {
		return disciplinaryDAO.getDisciplinaryByEmployeeId(employee_id);
	}

	@Override
	public void insertDisciplinary(DisciplinaryVO dvo) {
		disciplinaryDAO.insertDisciplinary(dvo);
	}

	@Override
	public void deleteDisciplinary(int disciplinary_number) {
		disciplinaryDAO.deleteDisciplinary(disciplinary_number);
	}

	@Override
	public int countDisciplinary(String employee_id) {
		return disciplinaryDAO.countDisciplinary(employee_id);
	}

	@Override
	public List<DisciplinaryVO> getListWithPaging(Criteria criteria, String key) {
		return disciplinaryDAO.getListWithPaging(criteria, key);
	}

	@Override
	public List<DisciplinaryVO> list3Disciplinary() {
		return disciplinaryDAO.list3Disciplinary();
	}

	@Override
	public int getChartDisciplinaryNo() {
		return disciplinaryDAO.getChartDisciplinaryNo();
	}

	@Override
	public int getChartDisciplinaryYes() {
		return disciplinaryDAO.getChartDisciplinaryYes();
	}
	
	
	
}

