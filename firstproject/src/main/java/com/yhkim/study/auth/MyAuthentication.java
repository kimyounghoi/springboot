package com.yhkim.study.auth;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.yhkim.study.member.Member;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class MyAuthentication extends UsernamePasswordAuthenticationToken{
	private static final long serialVersionUID = 1L;
	
	Member member;
	
	public MyAuthentication(String id, String pw, List<GrantedAuthority> authList, Member member) {
		super(id, pw, authList);
		this.member = member;
	}
	
}
