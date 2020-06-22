package com.green.biz.hrd.hrdAdmin.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.hrdAdmin.HrdAdminService;
import com.green.biz.hrdAdmin.HrdAdminVO;

@Service("hrdAdminService")
public class HrdAdminServiceImpl implements HrdAdminService {
	
	@Autowired
	private HrdAdminDAO hrdAdminDAO;
	
	@Override
	public HrdAdminVO loginAdmin(HrdAdminVO hvo) {
		return hrdAdminDAO.loginAdmin(hvo);
	}

	@Override
	public HrdAdminVO getAdmin(String hrd_admin_id) {
		return hrdAdminDAO.getAdmin(hrd_admin_id);
	}

	@Override
	public void updateAdmin(String hrd_admin_id) {
		hrdAdminDAO.updateAdmin(hrd_admin_id);
	}

	@Override
	public void insertAdmin(HrdAdminVO hvo) {
		hrdAdminDAO.insertAdmin(hvo);
	}

	@Override
	public HrdAdminVO getAdminPwd(String hrd_admin_pwd) {
		return hrdAdminDAO.getAdminPwd(hrd_admin_pwd);
	}

	@Override
	public void deleteAdmin(String hrd_admin_id) {
		hrdAdminDAO.deleteAdmin(hrd_admin_id);
	}

	@Override
	public int getChartSeoul() {
		return hrdAdminDAO.getChartSeoul();
	}

	@Override
	public int getChartIncheon() {
		return hrdAdminDAO.getChartIncheon();
	}

	@Override
	public int getChartKyungGi() {
		return hrdAdminDAO.getChartKyungGi();
	}

	@Override
	public int getChartBusan() {
		return hrdAdminDAO.getChartBusan();
	}

	@Override
	public int getChungNam() {
		return hrdAdminDAO.getChungNam();
	}

	@Override
	public int getKyungNam() {
		return hrdAdminDAO.getKyungNam();
	}
	
	
	
	
}
