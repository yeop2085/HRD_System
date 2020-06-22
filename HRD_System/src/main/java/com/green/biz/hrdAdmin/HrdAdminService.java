package com.green.biz.hrdAdmin;

public interface HrdAdminService {
	
	// 관리자 로그인할 때 가져와 쓰는 거임
	public HrdAdminVO loginAdmin(HrdAdminVO hvo);
	
	// 관리자 하나 목록 가져오기 + 아이디 찾기 기능
	public HrdAdminVO getAdmin(String hrd_admin_id);
	
	// 업데이트 기능
	public void updateAdmin(String hrd_admin_id);
	
	// 회원가입
	public void insertAdmin(HrdAdminVO hvo);
	
	// 비밀번호 찾기
	public HrdAdminVO getAdminPwd(String hrd_admin_pwd);
	
	// 관리자 삭제하기
	public void deleteAdmin(String hrd_admin_id);
	
	// 서울사는 관리자 수 가져오기
	public int getChartSeoul();
	
	// 인천사는 관리자 수 가져오기
	public int getChartIncheon();
	
	// 경기도 사는 관리자 수 가져오기
	public int getChartKyungGi();
	
	// 부산 사는 관리자 수 가져오기
	public int getChartBusan();
	
	// 충남 사는 관리자 수 가져오기
	public int getChungNam();
	
	// 경남 사는 관리자 수 가져오기
	public int getKyungNam();
	
	
	
	
	
}




