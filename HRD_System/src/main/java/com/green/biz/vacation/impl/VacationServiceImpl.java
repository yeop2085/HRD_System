package com.green.biz.vacation.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.util.Criteria;
import com.green.biz.vacation.VacationService;
import com.green.biz.vacation.VacationVO;

@Service("vacationService")
public class VacationServiceImpl implements VacationService {
	
	@Autowired
	private VacationDAO vacationDAO;
	
	@Override
	public List<VacationVO> listAllVacaction() {
		return vacationDAO.listAllVacaction();
	}

	@Override
	public VacationVO getVacation(int vacation_number) {
		return vacationDAO.getVacation(vacation_number);
	}
	
	@Override
	public VacationVO getVacationByEmployeeId(String employee_id) {
		return vacationDAO.getVacationByEmployeeId(employee_id);
	}

	@Override
	public void deleteVacation(int vacation_number) {
		vacationDAO.deleteVacation(vacation_number);
	}

	@Override
	public void insertVacation(VacationVO vvo) {
		vacationDAO.insertVacation(vvo);
	}

	@Override
	public int countVacation(String employee_id) {
		return vacationDAO.countVacation(employee_id);
	}

	@Override
	public List<VacationVO> getListWithPaging(Criteria criteria, String key) {
		return vacationDAO.getListWithPaging(criteria, key);
	}
	
	@Override
	public int getChartMyungjeongVacation() {
		return vacationDAO.getChartMyungjeongVacation();
	}

	@Override
	public int getChartOverseasTrip() {
		return vacationDAO.getChartOverseasTrip();
	}

	@Override
	public int getChartFamilyTrip() {
		return vacationDAO.getChartFamilyTrip();
	}

	@Override
	public int getChartSickLeave() {
		return vacationDAO.getChartSickLeave();
	}

	@Override
	public List<VacationVO> list3Vacation() {
		return vacationDAO.list3Vacation();
	}
	
	
}
