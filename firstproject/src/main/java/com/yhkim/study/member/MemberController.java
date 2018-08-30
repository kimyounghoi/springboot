package com.yhkim.study.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping("/test")
	public List<Member> test() {
		System.out.println("test page");
		return service.getMemberList();
	}
	
}
