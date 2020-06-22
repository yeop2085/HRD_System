package com.green.biz.retirement;

import java.util.List;

import com.green.biz.util.Criteria;

public interface RetirementService {
	
	// ���� ��� ���� ��������
	public List<RetirementVO> listAllRetirement();
	
	// ���� ��� �߿��� �ϳ� ��������
	public RetirementVO getRetirement(int retirement_number);
	
	// ���� ��� �߿��� �ϳ� ��������
	public RetirementVO getRetirementByEmployeeId(String employee_id);
	
	// ������ �ϳ� �߰��ϱ�
	public void insertRetirement(RetirementVO rvo);
	
	// ������ �ϳ� �����ϱ�
	public void deleteRetirement(int retirement_number);
	
	// �޿� ���� ��ȸ
	public int countRetirementList(String employee_id);
	
	// �������� ��� ��ȸ
	public List<RetirementVO> getListWithPaging(Criteria criteria, String key);
	
	// ������� 500���� ������ ���
	public int getChart5000000DowmEmployee();
	
	// ������� 500���� ~ 1000������ ���
	public int getChart10000000DowmEmployee();
	
	// ������� 1000���� �Ѵ� ���
	public int getChart10000000OverEmployee();
	
	// ������ 3�� ��������
	public List<RetirementVO> list3Retirement();
	
	
}


