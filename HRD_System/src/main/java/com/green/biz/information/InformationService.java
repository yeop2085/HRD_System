package com.green.biz.information;

import java.util.List;

import com.green.biz.util.Criteria;

public interface InformationService {
	
	// 게시판 전체 목록 가져오기
	public List<InformationVO> listAllInformation();
	
	// 게시판 목록 중 하나 가져오기
	public InformationVO getInformation(int information_number);
	
	// 게시판 글쓰기
	public void insertInformation(InformationVO ivo);
	
	// 게시판 글 삭제하기
	public void deleteInformation(int information_number);
	
	// 공지사항 개수 조회
	public int countInformation(String title);
	
	// 페이지별 목록 조회
	public List<InformationVO> getListWithPaging(Criteria criteria, String key);
	
	// 페이지별 목록 조회 (키값이 없음)
	public List<InformationVO> getListWithPagingNotKey(Criteria criteria, String key);
	
	// 공지사항 최근 목록 3개 가져오기
	public List<InformationVO> list3Information();
	
}

