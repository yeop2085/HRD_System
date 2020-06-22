package com.green.biz.retirement.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.retirement.RetirementService;
import com.green.biz.retirement.RetirementVO;
import com.green.biz.util.Criteria;

@Service("retirementService")
public class RetirementServiceImpl implements RetirementService {
	
	@Autowired
	private RetirementDAO retirementDAO;
	
	@Override
	public List<RetirementVO> listAllRetirement() {
		return retirementDAO.listAllRetirement();
	}

	@Override
	public RetirementVO getRetirement(int retirement_number) {
		return retirementDAO.getRetirement(retirement_number);
	}

	@Override
	public RetirementVO getRetirementByEmployeeId(String employee_id) {
		return retirementDAO.getRetirementByEmployeeId(employee_id);
	}

	@Override
	public void insertRetirement(RetirementVO rvo) {
		retirementDAO.insertRetirement(rvo);
	}

	@Override
	public void deleteRetirement(int retirement_number) {
		retirementDAO.deleteRetirement(retirement_number);
	}

	@Override
	public int countRetirementList(String employee_id) {
		return retirementDAO.countRetirementList(employee_id);
	}

	@Override
	public List<RetirementVO> getListWithPaging(Criteria criteria, String key) {
		return retirementDAO.getListWithPaging(criteria, key);
	}

	@Override
	public int getChart5000000DowmEmployee() {
		return retirementDAO.getChart5000000DowmEmployee();
	}

	@Override
	public int getChart10000000DowmEmployee() {
		return retirementDAO.getChart10000000DowmEmployee();
	}

	@Override
	public int getChart10000000OverEmployee() {
		return retirementDAO.getChart10000000OverEmployee();
	}

	@Override
	public List<RetirementVO> list3Retirement() {
		return retirementDAO.list3Retirement();
	}
	
	
	
	
}
