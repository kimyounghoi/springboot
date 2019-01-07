package com.yhkim.study.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberService {
	
	@Autowired
	MemberRepository repo;
	
	public List<Member> getMemberList(){
		repo.findAll().forEach(mem->{
			log.info(mem.toString());
		});
		return (List<Member>) repo.findAll();
	}
	
	public void saveMember(Member member) {
		repo.save(member);
	}
	
	public void deleteMember(Member member) {
		repo.delete(member);
	}
}
