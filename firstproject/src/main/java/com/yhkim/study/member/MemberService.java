package com.yhkim.study.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberMapper mapper;

	public List<Member> getMemberList(){
		return mapper.getMemberList();
	}
	
	public Member getMemberByUserName(String username) {
		return mapper.getMemberByUserName(username);
	}
	
	public Member getMember(Member member) {
		return mapper.getMember(member);
	}
	
	public void insertMember(Member member) {
		mapper.insertMember(member);
	}
	
	public void deleteMember(Member member) {
		mapper.deleteMember(member);
	}
}
