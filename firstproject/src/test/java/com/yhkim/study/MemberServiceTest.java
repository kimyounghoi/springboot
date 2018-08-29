package com.yhkim.study;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.yhkim.study.member.Member;
import com.yhkim.study.member.MemberMapper;

@SpringBootTest()
@RunWith(SpringRunner.class)
@Transactional
public class MemberServiceTest {

	@Autowired
	MemberMapper mapper;
	
	@Test
	public void getMemberList() {
		List<Member> list = mapper.getMemberList();
		for (Member member : list) {
			System.out.println("=====>"+member);
		}
	}
}
