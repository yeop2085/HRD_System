package com.green.biz.salary;

import java.util.List;

import com.green.biz.util.Criteria;

public interface SalaryService {
	
	// �޿� ��� ��ü �� ��������
	public List<SalaryVO> listAllSalary();
	
	// �޿� ��� �߿��� �ϳ��� ��������
	public SalaryVO getSalary(int salary_number);
	
	// �޿� ��� �߿��� �ϳ��� ��������
	public SalaryVO getSalaryByEmployeeId(String employee_id);
	
	// �޿� ���� ����ϱ�
	public void insertSalary(SalaryVO svo);
	
	// �޿� ���� �����ϱ�
	public void deleteSalary(int salary_number);
	
	// �޿� ���� ��ȸ
	public int countSalary(String employee_id);
	
	// �������� ��� ��ȸ
	public List<SalaryVO> getListWithPaging(Criteria criteria, String key);
	
	// �޿� ��� �ֱ� 3�� ��������
	public List<SalaryVO> list3Salary();
	
	// �޿����� 2,000,000 �� ������ ��� �� ��������
	public int getChart2000000DownEmployee();
	
	// �޿����� 2,000,000������ ~ 3,000,000���� ��� �� ��������
	public int getChart3000000DownEmployee();
	
	// �޿����� 3,000,000������ ~ 4,000,000���� ��� �� ��������
	public int getChart4000000DownEmployee();
	
	// �޿����� 4,000,000������ ~ 5,000,000���� ��� �� ��������
	public int getChart5000000DownEmployee();
	
	// �޿����� 5,000,000�� �̻��� ��� �� ��������
	public int getChart5000000OverEmployee();
	
	
}


