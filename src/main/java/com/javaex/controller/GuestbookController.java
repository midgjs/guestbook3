package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.GuestbookService;
import com.javaex.vo.GuestbookVo;

@Controller
public class GuestbookController {

	// 필드
	@Autowired
	private GuestbookService guestbookService;
	// 생성자

	// 메소드 gs

	// 메소드 일반

	// 리스트
	@RequestMapping(value = "/addList", method = { RequestMethod.GET, RequestMethod.POST })
	public String addList(Model model) {
		System.out.println("GuestbookController>addList()");

		// service를 통해서 리스트 주소를 가져온다
		List<GuestbookVo> guestbookList = guestbookService.getList();
		System.out.println(guestbookList);

		// ds에 데이터보내기 --> request attribute에 넣는다
		model.addAttribute("guestbookList", guestbookList);

		return "addList";
	}

	// 리스트 등록
	@RequestMapping(value = "/add", method = { RequestMethod.GET, RequestMethod.POST })
	public String add(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("GuestbookController>add()");

		// Service를 통해서 저장한다
		int count = guestbookService.guestbookInsert(guestbookVo);

		// 리다이렉트
		return "redirect:/addlist";

	}

	@RequestMapping(value = "/deleteForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteForm(Model model, @RequestParam("no") int no) {
		System.out.println("GuestbookController>deleteForm");
		System.out.println(no);
		
		GuestbookVo guestbookVo = (GuestbookVo)guestbookService.getList();
		//ㄴ오류
		model.addAttribute("GuestbookVo", guestbookVo);
		
		return "deleteForm";
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.GET, RequestMethod.POST })
	public String delete(@ModelAttribute GuestbookVo guestbookVo) {
		System.out.println("GuestbookController>delete");

		System.out.println(guestbookVo);

		// Service를 통해서 저장한다
		int count = guestbookService.guestbookDelete(guestbookVo);

		// 리다이렉트
		return "redirect:/list";

	}
}
