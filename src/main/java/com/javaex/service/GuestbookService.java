package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	//필드
	@Autowired
	private GuestbookDao guestbookDao;
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	
	//리스트
	public List<GuestbookVo> getList() {
		
		List<GuestbookVo> guestbookList = guestbookDao.getList();
		
		return guestbookList;
	}
	
	//리스트 등록
	public int guestbookInsert(GuestbookVo guestbookVo) {
		
		int count = guestbookDao.guestbookInsert(guestbookVo);
		
		return count;
	}
	
	//리스트 삭제
	public int guestbookDelete(GuestbookVo guestbookVo) {
		
		int count = guestbookDao.guestbookDelete(guestbookVo);
		
		return count;
	}
}
