package com.green.biz.vacation;

import java.util.List;

import com.green.biz.util.Criteria;

public interface VacationService {
	
	// ���� ��� ��ü ��������
	public List<VacationVO> listAllVacaction();
	
	// ���� ��� �ϳ� ��������
	public VacationVO getVacation(int vacation_number);
	
	// ���� ��� �߿��� �ϳ� �������� (Employee ���̵��)
	public VacationVO getVacationByEmployeeId(String employee_id);
	
	// ���� ��� �����ϱ�
	public void deleteVacation(int vacation_number);
	
	// ���� ��� ����ϱ�
	public void insertVacation(VacationVO vvo);
	
	// ���� ���� ��ȸ�ϱ�
	public int countVacation(String employee_id);
	
	// �������� ��� ��ȸ
	public List<VacationVO> getListWithPaging(Criteria criteria, String key);
	
	// ���� ������ �����ް��� ��� �� ��������
	public int getChartMyungjeongVacation(); 
	
	// ���� ������ �ؿܿ����� ��� �� ��������
	public int getChartOverseasTrip();
	
	// ���� ������ ���������� ��� �� ��������
	public int getChartFamilyTrip();
	
	// ���� ������ ������ ��� �� ��������
	public int getChartSickLeave();
	
	// �ް���� 3�� ��������
	public List<VacationVO> list3Vacation();
	
	
	
}

