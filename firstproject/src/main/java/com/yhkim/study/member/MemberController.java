package com.yhkim.study.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemberController {

	@Autowired
	MemberService service;

	@RequestMapping(value= {"/", "/user", "/admin"})
	public String main() {
		return "/index.html";
	}

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if ( error != null ) {
			model.addAttribute("errorMsg", "Your username and password are invalid.");
		}
		if ( logout != null ) {
			model.addAttribute("msg", "You have been logged out successfully");
		}
		return "login.html"; 
	}

	// 로그인 실패시
	@RequestMapping(value="/loginError")
	public String loginError(Model model, String username ){
		model.addAttribute("error", "Your username and password is invalid.");
		model.addAttribute("username",username);
		return "login";
	}
	// admin 사용자 테스트 
	@RequestMapping("/admin")
	public String admin(){
		return "/admin/admin";
	}

	// user 사용자 테스트 
	@RequestMapping("/user")
	public String user(){
		return "/user/user";
	}

	// 권한없는 페이지를 들어갔을때 
	@RequestMapping("/403")
	public String access(){
		return "/access";
	}

}
