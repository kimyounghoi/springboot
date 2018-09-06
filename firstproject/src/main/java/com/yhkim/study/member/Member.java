package com.yhkim.study.member;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Alias("member")
@Getter @Setter
public class Member {
	private int idx;
	private String id;
	private String name;
	private String pw;
	
	public Member() {}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("{ idx : ").append(idx).append(", id : ").append(id).append(", name : ").append(name).append(" }").toString();
	}
}
