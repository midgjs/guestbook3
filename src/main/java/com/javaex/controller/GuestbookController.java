package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Controller
public class GuestbookController {

	// 필드

	// 생성자

	// 메소드 gs

	// 메소드 일반
	// 방명록 등록
	@RequestMapping(value = "/addList", method = { RequestMethod.GET, RequestMethod.POST })
	public String addList(Model model) {
		System.out.println("GuestbookController>addList()");

		// Dao를 통해서 리스트 주소를 가져온다
		GuestbookDao guestbookDao = new GuestbookDao();
		List<GuestbookVo> guestbookList = guestbookDao.guestbookList();
		System.out.println(guestbookList);

		// ds에 데이터보내기 --> request attribute에 넣는다
		model.addAttribute("guestbookList", guestbookList);

		return "WEB-INF/views/addList.jsp";
	}

	@RequestMapping(value = "/add", method = { RequestMethod.GET, RequestMethod.POST })
	public String add(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("GuestbookController>add()");

		// 파라미터 꺼내기+vo로 묶기를 DS해서 메소드의 파라미터로 보내준다

		// Dao로 저장하기
		GuestbookDao guestbookDao = new GuestbookDao();
		int count = guestbookDao.guestbookInsert(guestbookVo);
		System.out.println(count);

		// 리다이렉트
		return "redirect:/addList";
		// 안쓰면 포워드 redirect: 쓰면 리다이렉트

	}
}
