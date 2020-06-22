package com.green.biz.employee;

import java.util.List;

import com.green.biz.util.Criteria;

public interface EmployeeService {
	
	// ��� �α����� �� ������ ���� ����
	public EmployeeVO loginEmployee(EmployeeVO evo);
	
	// ȸ������
	public void insertEmployee(EmployeeVO evo);
	
	// ȸ�� �ϳ� ��� �������� + ���̵� ã�� ���
	public EmployeeVO getEmployee(String employee_id);
	
	// ��й�ȣ ã��
	public EmployeeVO getEmployeePwd(String employee_pwd);
	
	// ȸ��Ż��
	public void deleteEmployee(String employee_pwd);
	
	// ȸ�� ��� ��ü ��������
	public List<EmployeeVO> listAllEmployee();
	
	// ��� ��� ���� ��ȸ
	public int countEmployee(String employee_name);
	
	// �������� ��� ��ȸ
	public List<EmployeeVO> getListWithPaging(Criteria criteria, String key);
	
	// ȸ�� ��� �ֱ� 3�� ��������
	public List<EmployeeVO> list3Employee();
	
	// ��� �� ��������
	public int getChartEmployee();
	
	// �븮 �� ��������
	public int getChartAssistantManager();
	
	// ���� �� ��������
	public int getChartSectionChief();
	
	// ���� �� ��������
	public int getDeputyDepartmentHead();
	
	// ���� �� ��������
	public int getDepartmentHead();
	
	// ���� ��� ��� �� ��������
	public int getChartSeoul();
	
	// �λ� ��� ��� �� ��������
	public int getChartBusan();
	
	// ��õ ��� ��� �� ��������
	public int getChartIncheon();
	
	// ��⵵ ��� ��� �� ��������
	public int getChartKyungGi();
	
	// ��û���� ��� ��� �� ��������
	public int getCheongNam();
	
	// ��󳲵� ��� ��� �� ��������
	public int getKyungName();
	
	
}


