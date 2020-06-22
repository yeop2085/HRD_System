package com.green.biz.salary;

import java.util.List;

import com.green.biz.util.Criteria;

public interface SalaryService {
	
	// 급여 목록 전체 다 가져오기
	public List<SalaryVO> listAllSalary();
	
	// 급여 목록 중에서 하나만 가져오기
	public SalaryVO getSalary(int salary_number);
	
	// 급여 목록 중에서 하나만 가져오기
	public SalaryVO getSalaryByEmployeeId(String employee_id);
	
	// 급여 정보 등록하기
	public void insertSalary(SalaryVO svo);
	
	// 급여 정보 삭제하기
	public void deleteSalary(int salary_number);
	
	// 급여 개수 조회
	public int countSalary(String employee_id);
	
	// 페이지별 목록 조회
	public List<SalaryVO> getListWithPaging(Criteria criteria, String key);
	
	// 급여 목록 최근 3개 가져오기
	public List<SalaryVO> list3Salary();
	
	// 급여금이 2,000,000 원 이하인 사람 수 가져오기
	public int getChart2000000DownEmployee();
	
	// 급여금이 2,000,000원에서 ~ 3,000,000원인 사람 수 가져오기
	public int getChart3000000DownEmployee();
	
	// 급여금이 3,000,000원에서 ~ 4,000,000원인 사람 수 가져오기
	public int getChart4000000DownEmployee();
	
	// 급여금이 4,000,000원에서 ~ 5,000,000원인 사람 수 가져오기
	public int getChart5000000DownEmployee();
	
	// 급여금이 5,000,000원 이상인 사람 수 가져오기
	public int getChart5000000OverEmployee();
	
	
}


