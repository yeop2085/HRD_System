package com.green.biz.employee;

import java.util.List;

import com.green.biz.util.Criteria;

public interface EmployeeService {
	
	// 사원 로그인할 때 가져와 쓰는 거임
	public EmployeeVO loginEmployee(EmployeeVO evo);
	
	// 회원가입
	public void insertEmployee(EmployeeVO evo);
	
	// 회원 하나 목록 가져오기 + 아이디 찾기 기능
	public EmployeeVO getEmployee(String employee_id);
	
	// 비밀번호 찾기
	public EmployeeVO getEmployeePwd(String employee_pwd);
	
	// 회원탈퇴
	public void deleteEmployee(String employee_pwd);
	
	// 회원 목록 전체 가져오기
	public List<EmployeeVO> listAllEmployee();
	
	// 사원 목록 개수 조회
	public int countEmployee(String employee_name);
	
	// 페이지별 목록 조회
	public List<EmployeeVO> getListWithPaging(Criteria criteria, String key);
	
	// 회원 목록 최근 3개 가져오기
	public List<EmployeeVO> list3Employee();
	
	// 사원 수 가져오기
	public int getChartEmployee();
	
	// 대리 수 가져오기
	public int getChartAssistantManager();
	
	// 과장 수 가져오기
	public int getChartSectionChief();
	
	// 차장 수 가져오기
	public int getDeputyDepartmentHead();
	
	// 부장 수 가져오기
	public int getDepartmentHead();
	
	// 서울 사는 사원 수 가져오기
	public int getChartSeoul();
	
	// 부산 사는 사원 수 가져오기
	public int getChartBusan();
	
	// 인천 사는 사원 수 가져오기
	public int getChartIncheon();
	
	// 경기도 사는 사원 수 가져오기
	public int getChartKyungGi();
	
	// 충청남도 사는 사원 수 가져오기
	public int getCheongNam();
	
	// 경상남도 사는 사원 수 가져오기
	public int getKyungName();
	
	
}


