package com.yhkim.study.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yhkim.study.member.Member;
import com.yhkim.study.member.MemberService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class APIController {
	
	@Autowired
	MemberService service;

	@RequestMapping(value="/api/userlist", method=RequestMethod.GET)
	public List<Member> getUserList(HttpServletRequest req) {
		log.info("call api from ", req.getRemoteAddr());
		return service.getMemberList();
	}

	@RequestMapping(value="/api/adduser", method=RequestMethod.GET)
	public List<Member> addUser(@RequestParam String userId, 
			@RequestParam String userName, 
			@RequestParam(required=false) String email, 
			@RequestParam(required=false) String cellphone
	) {
		Member m = new Member(userId, "");
		m.setName(userName);
		m.setEmail(email);
		m.setCellphone(cellphone);
		service.saveMember(m);
		return service.getMemberList();
	}

	@RequestMapping(value="/api/updateuser", method=RequestMethod.GET)
	public List<Member> updateUser(@RequestParam Integer userIdx, 
			@RequestParam String userId, 
			@RequestParam String userName, 
			@RequestParam(required=false) String email, 
			@RequestParam(required=false) String cellphone) {
		Member m = new Member(userId, "");
		m.setIdx(userIdx);
		m.setName(userName);
		m.setEmail(email);
		m.setCellphone(cellphone);
		service.saveMember(m);
		return service.getMemberList();
	}
	
	@RequestMapping(value="/api/deluser", method=RequestMethod.GET)
	public List<Member> delUser(@RequestParam Integer userIdx) {
		Member m = new Member();
		m.setIdx(userIdx);
		service.deleteMember(m);
		return service.getMemberList();
	}
}
