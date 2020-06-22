package com.green.biz.vacation;

import java.util.List;

import com.green.biz.util.Criteria;

public interface VacationService {
	
	// 연차 목록 전체 가져오기
	public List<VacationVO> listAllVacaction();
	
	// 연차 목록 하나 가져오기
	public VacationVO getVacation(int vacation_number);
	
	// 연차 목록 중에서 하나 가져오기 (Employee 아이디로)
	public VacationVO getVacationByEmployeeId(String employee_id);
	
	// 연차 목록 삭제하기
	public void deleteVacation(int vacation_number);
	
	// 연차 목록 등록하기
	public void insertVacation(VacationVO vvo);
	
	// 연차 개수 조회하기
	public int countVacation(String employee_id);
	
	// 페이지별 목록 조회
	public List<VacationVO> getListWithPaging(Criteria criteria, String key);
	
	// 연차 사유중 명절휴가인 사람 수 가져오기
	public int getChartMyungjeongVacation(); 
	
	// 연차 사유중 해외여행인 사람 수 가져오기
	public int getChartOverseasTrip();
	
	// 연차 사유중 가족여행인 사람 수 가져오기
	public int getChartFamilyTrip();
	
	// 연차 사유중 병가인 사람 수 가져오기
	public int getChartSickLeave();
	
	// 휴가목록 3개 가져오기
	public List<VacationVO> list3Vacation();
	
	
	
}

