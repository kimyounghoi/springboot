package com.yhkim.study.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Entity
@Alias("member")
@Getter @Setter
public class Member {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idx;
	
	@Column(name="user_id", nullable=false, length=256)
	private String id;
	
	@Column(name="user_name", nullable=false, length=256)
	private String name;

	@Column(nullable=false, length=512)
	private String pw;

	@Column(nullable=true, length=120)
	private String email;

	@Column(nullable=true, length=20)
	private String cellphone;
	
	@Column(columnDefinition="datetime")
	private String createDate;
	
	public Member() {}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("{ idx: ").append(idx).append(", id: ").append(id).append(", name: ").append(name).append(", email: ").append(email).append(", cellphone: ").append(cellphone).append(", createDate: ").append(createDate).append(" }").toString();
	}
}
