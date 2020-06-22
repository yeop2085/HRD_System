package com.green.biz.information.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.information.InformationService;
import com.green.biz.information.InformationVO;
import com.green.biz.util.Criteria;

@Service("informationService")
public class InformationServiceImpl implements InformationService {
	
	@Autowired
	private InformationDAO informationDAO;
	
	@Override
	public List<InformationVO> listAllInformation() {
		return informationDAO.listAllInformation();
	}

	@Override
	public InformationVO getInformation(int information_number) {
		return informationDAO.getInformation(information_number);
	}

	@Override
	public void insertInformation(InformationVO ivo) {
		informationDAO.insertInformation(ivo);
	}

	@Override
	public void deleteInformation(int information_number) {
		informationDAO.deleteInformation(information_number);
	}

	@Override
	public int countInformation(String title) {
		return informationDAO.countInformation(title);
	}

	@Override
	public List<InformationVO> getListWithPaging(Criteria criteria, String key) {
		return informationDAO.getListWithPaging(criteria, key);
	}
	
	@Override
	public List<InformationVO> getListWithPagingNotKey(Criteria criteria, String key) {
		return informationDAO.getListWithPagingNotKey(criteria, key);
	}
	
	@Override
	public List<InformationVO> list3Information() {
		return informationDAO.list3Information();
	}
	
	
	
	
}


