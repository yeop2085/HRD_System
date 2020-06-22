package com.green.biz.information.impl;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.green.biz.information.InformationVO;
import com.green.biz.util.Criteria;

@Repository
public class InformationDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<InformationVO> listAllInformation() {
		System.out.println("mybatis�� listAllInformation() ��� ó��");
		
		return mybatis.selectList("InformationDAO.listAllInformation");
	}
	
	public InformationVO getInformation(int information_number) {
		System.out.println("mybatis�� getInformation() ��� ó��");
		
		return mybatis.selectOne("InformationDAO.getInformation", information_number);
	}
	
	public void insertInformation(InformationVO ivo) {
		System.out.println("mybatis�� insertInformation() ��� ó��");
		
		mybatis.insert("InformationDAO.insertInformation", ivo);
	}
	
	public void deleteInformation(int information_number) {
		System.out.println("mybatis�� deleteInformation() ��� ó��");
		
		mybatis.delete("InformationDAO.deleteInformation", information_number);
	}
	
	public int countInformation(String title) {
		System.out.println("mybatis�� countInformation() ��� ó��");
		
		return mybatis.selectOne("InformationDAO.countInformation", title);
	}
	
	public List<InformationVO> getListWithPaging(Criteria criteria, String key) {
		System.out.println("mybatis�� getListWithPaging() ��� ó��");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("InformationDAO.listWithPaging", map);
	}
	
	public List<InformationVO> getListWithPagingNotKey(Criteria criteria, String key) {
		System.out.println("mybatis�� getListWithPagingNotKey() ��� ó��");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		map.put("key", key);
		
		return mybatis.selectList("InformationDAO.getListWithPagingNotKey", map);
	}
	
	public List<InformationVO> list3Information() {
		System.out.println("mybatis�� list3Information() ��� ó��");
		
		return mybatis.selectList("InformationDAO.list3Information");
	}
	
	
	
}

