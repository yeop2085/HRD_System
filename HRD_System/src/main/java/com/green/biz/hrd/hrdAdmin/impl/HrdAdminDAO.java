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
		System.out.println("mybatis로 loginAdmin() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.loginAdmin", hvo);
	}
	
	public HrdAdminVO getAdmin(String hrd_admin_id) {
		System.out.println("mybatis로 getAdmin() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.getAdmin", hrd_admin_id);
	}
	
	public void updateAdmin(String hrd_admin_id) {
		System.out.println("mybatis로 updateAdmin() 기능 처리");
		mybatis.update("HrdAdminDAO.updateAdmin", hrd_admin_id);
	}
	
	public void insertAdmin(HrdAdminVO hvo) {
		System.out.println("mybatis로 insertAdmin() 기능 처리");
		mybatis.insert("HrdAdminDAO.insertAdmin", hvo);
	}
	
	public HrdAdminVO getAdminPwd(String hrd_admin_pwd) {
		System.out.println("mybatis로 getAdminPwd() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.getAdminPwd", hrd_admin_pwd);
	}
	
	public void deleteAdmin(String hrd_admin_id) {
		System.out.println("mybatis로 deleteAdmin() 기능 처리");
		mybatis.delete("HrdAdminDAO.deleteAdmin", hrd_admin_id);
	}
	
	public int getChartSeoul() {
		System.out.println("mybatis로 getChartSeoul() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.getChartSeoul");
	}
	
	public int getChartIncheon() {
		System.out.println("mybatis로 getChartIncheon() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.getChartIncheon");
	}
	
	public int getChartKyungGi() {
		System.out.println("mybatis로 getChartKyungGi() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.getChartKyungGi");
	}
	
	public int getChartBusan() {
		System.out.println("mybatis로 getChartBusan() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.getChartBusan");
	}
	
	public int getChungNam() {
		System.out.println("mybatis로 getChungNam() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.getChungNam");
	}
	
	public int getKyungNam() {
		System.out.println("mybatis로 getKyungNam() 기능 처리");
		return mybatis.selectOne("HrdAdminDAO.getKyungNam");
	}
	
	
}

