package com.green.biz.hrd.hrdAdmin.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.hrdAdmin.HrdAdminVO;

@Repository
public class HrdAdminDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public HrdAdminVO loginAdmin(HrdAdminVO hvo) {
		System.out.println("mybatis�� loginAdmin() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.loginAdmin", hvo);
	}
	
	public HrdAdminVO getAdmin(String hrd_admin_id) {
		System.out.println("mybatis�� getAdmin() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.getAdmin", hrd_admin_id);
	}
	
	public void updateAdmin(String hrd_admin_id) {
		System.out.println("mybatis�� updateAdmin() ��� ó��");
		mybatis.update("HrdAdminDAO.updateAdmin", hrd_admin_id);
	}
	
	public void insertAdmin(HrdAdminVO hvo) {
		System.out.println("mybatis�� insertAdmin() ��� ó��");
		mybatis.insert("HrdAdminDAO.insertAdmin", hvo);
	}
	
	public HrdAdminVO getAdminPwd(String hrd_admin_pwd) {
		System.out.println("mybatis�� getAdminPwd() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.getAdminPwd", hrd_admin_pwd);
	}
	
	public void deleteAdmin(String hrd_admin_id) {
		System.out.println("mybatis�� deleteAdmin() ��� ó��");
		mybatis.delete("HrdAdminDAO.deleteAdmin", hrd_admin_id);
	}
	
	public int getChartSeoul() {
		System.out.println("mybatis�� getChartSeoul() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.getChartSeoul");
	}
	
	public int getChartIncheon() {
		System.out.println("mybatis�� getChartIncheon() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.getChartIncheon");
	}
	
	public int getChartKyungGi() {
		System.out.println("mybatis�� getChartKyungGi() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.getChartKyungGi");
	}
	
	public int getChartBusan() {
		System.out.println("mybatis�� getChartBusan() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.getChartBusan");
	}
	
	public int getChungNam() {
		System.out.println("mybatis�� getChungNam() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.getChungNam");
	}
	
	public int getKyungNam() {
		System.out.println("mybatis�� getKyungNam() ��� ó��");
		return mybatis.selectOne("HrdAdminDAO.getKyungNam");
	}
	
	
}

