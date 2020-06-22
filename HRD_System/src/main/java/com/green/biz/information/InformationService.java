package com.green.biz.information;

import java.util.List;

import com.green.biz.util.Criteria;

public interface InformationService {
	
	// �Խ��� ��ü ��� ��������
	public List<InformationVO> listAllInformation();
	
	// �Խ��� ��� �� �ϳ� ��������
	public InformationVO getInformation(int information_number);
	
	// �Խ��� �۾���
	public void insertInformation(InformationVO ivo);
	
	// �Խ��� �� �����ϱ�
	public void deleteInformation(int information_number);
	
	// �������� ���� ��ȸ
	public int countInformation(String title);
	
	// �������� ��� ��ȸ
	public List<InformationVO> getListWithPaging(Criteria criteria, String key);
	
	// �������� ��� ��ȸ (Ű���� ����)
	public List<InformationVO> getListWithPagingNotKey(Criteria criteria, String key);
	
	// �������� �ֱ� ��� 3�� ��������
	public List<InformationVO> list3Information();
	
}

