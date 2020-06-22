package com.green.biz.disciplinary;

import java.util.List;

import com.green.biz.util.Criteria;

public interface DisciplinaryService {
	
	// ¡�� ��� ��������
	public List<DisciplinaryVO> listAllDisciplinary();
	
	// �ϳ��� ¡�� ���� �������� (¡�� ��ȣ �̿�)
	public DisciplinaryVO getDisciplinary(int disciplinary_number);
	
	// �ϳ��� ¡�� ���� �������� (���̵� �̿�)
	public DisciplinaryVO getDisciplinaryByEmployeeId(String employee_id);
	
	// ¡�� ���� ���
	public void insertDisciplinary(DisciplinaryVO dvo);
	
	// ¡�� ���� ����
	public void deleteDisciplinary(int disciplinary_number);
	
	// ¡����� ���� ��ȸ
	public int countDisciplinary(String employee_id);
	
	// �������� ��� ��ȸ
	public List<DisciplinaryVO> getListWithPaging(Criteria criteria, String key);
	
	// ¡�� ��� �ֱ� 3�� ��������
	public List<DisciplinaryVO> list3Disciplinary();
	
	// ¡���� ���� ��� �� ��������
	public int getChartDisciplinaryNo();
	
	// ¡���� �ִ� ��� �� ��������
	public int getChartDisciplinaryYes();
	
	
}




