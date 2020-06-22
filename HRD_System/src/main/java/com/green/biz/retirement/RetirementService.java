package com.green.biz.retirement;

import java.util.List;

import com.green.biz.util.Criteria;

public interface RetirementService {
	
	// 은퇴 목록 전부 가져오기
	public List<RetirementVO> listAllRetirement();
	
	// 은퇴 목록 중에서 하나 가져오기
	public RetirementVO getRetirement(int retirement_number);
	
	// 은퇴 목록 중에서 하나 가져오기
	public RetirementVO getRetirementByEmployeeId(String employee_id);
	
	// 은퇴목록 하나 추가하기
	public void insertRetirement(RetirementVO rvo);
	
	// 은퇴목록 하나 삭제하기
	public void deleteRetirement(int retirement_number);
	
	// 급여 개수 조회
	public int countRetirementList(String employee_id);
	
	// 페이지별 목록 조회
	public List<RetirementVO> getListWithPaging(Criteria criteria, String key);
	
	// 은퇴금이 500만원 이하인 사람
	public int getChart5000000DowmEmployee();
	
	// 은퇴금이 500만원 ~ 1000만원인 사람
	public int getChart10000000DowmEmployee();
	
	// 은퇴금이 1000만원 넘는 사람
	public int getChart10000000OverEmployee();
	
	// 은퇴목록 3개 가져오기
	public List<RetirementVO> list3Retirement();
	
	
}


