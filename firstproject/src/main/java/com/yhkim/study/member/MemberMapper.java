package com.yhkim.study.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberMapper {

	Member getMemberByUserName(String username);
	
	List<Member> getMemberList();
	
	Member getMember(Member member);
	
	void insertMember(Member member);
	
	void deleteMember(Member member);
}
