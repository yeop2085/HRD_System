package com.green.biz.hrdAdmin;

public interface HrdAdminService {
	
	// ������ �α����� �� ������ ���� ����
	public HrdAdminVO loginAdmin(HrdAdminVO hvo);
	
	// ������ �ϳ� ��� �������� + ���̵� ã�� ���
	public HrdAdminVO getAdmin(String hrd_admin_id);
	
	// ������Ʈ ���
	public void updateAdmin(String hrd_admin_id);
	
	// ȸ������
	public void insertAdmin(HrdAdminVO hvo);
	
	// ��й�ȣ ã��
	public HrdAdminVO getAdminPwd(String hrd_admin_pwd);
	
	// ������ �����ϱ�
	public void deleteAdmin(String hrd_admin_id);
	
	// ������ ������ �� ��������
	public int getChartSeoul();
	
	// ��õ��� ������ �� ��������
	public int getChartIncheon();
	
	// ��⵵ ��� ������ �� ��������
	public int getChartKyungGi();
	
	// �λ� ��� ������ �� ��������
	public int getChartBusan();
	
	// �泲 ��� ������ �� ��������
	public int getChungNam();
	
	// �泲 ��� ������ �� ��������
	public int getKyungNam();
	
	
	
	
	
}




