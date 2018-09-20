package com.yhkim.study.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public List<Member> getUserList() {
		log.info("call api -----");
		List<Member> list = service.getMemberList();
		for (Member member : list) {
			log.info(member.toString());
		}
		log.info("end api");
		return list;
	}
}
