package com.yhkim.study.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.yhkim.study.member.Member;
import com.yhkim.study.member.MemberMapper;

@Service
public class AuthService {

	@Autowired
	MemberMapper mapper;
	
	public Member login(String id, String pw) {
		Member m = new Member();
		m.setId(id);
		m = mapper.getMember(m);
		if ( m == null ) {
			return null;
		}
		if ( !m.getPw().equals(pw) ) {
			return null;
		}
		
		return m;
	}
	
	public static Member getCurrentUser() {
        Authentication authentication = (Authentication) SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof MyAuthentication)
            return ((MyAuthentication) authentication).getMember();
        return null;
    }

    public static void setCurrentUser(Member member) {
        ((MyAuthentication)SecurityContextHolder.getContext().getAuthentication()).setMember(member);
    }

}
