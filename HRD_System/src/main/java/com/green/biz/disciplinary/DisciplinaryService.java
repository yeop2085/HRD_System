package com.green.biz.disciplinary;

import java.util.List;

import com.green.biz.util.Criteria;

public interface DisciplinaryService {
	
	// 징계 목록 가져오기
	public List<DisciplinaryVO> listAllDisciplinary();
	
	// 하나의 징계 정보 가져오기 (징계 번호 이용)
	public DisciplinaryVO getDisciplinary(int disciplinary_number);
	
	// 하나의 징계 정보 가져오기 (아이디 이용)
	public DisciplinaryVO getDisciplinaryByEmployeeId(String employee_id);
	
	// 징계 정보 등록
	public void insertDisciplinary(DisciplinaryVO dvo);
	
	// 징계 정보 삭제
	public void deleteDisciplinary(int disciplinary_number);
	
	// 징계사항 개수 조회
	public int countDisciplinary(String employee_id);
	
	// 페이지별 목록 조회
	public List<DisciplinaryVO> getListWithPaging(Criteria criteria, String key);
	
	// 징계 목록 최근 3개 가져오기
	public List<DisciplinaryVO> list3Disciplinary();
	
	// 징계기록 없는 사람 수 가져오기
	public int getChartDisciplinaryNo();
	
	// 징계기록 있는 사람 수 가져오기
	public int getChartDisciplinaryYes();
	
	
}




