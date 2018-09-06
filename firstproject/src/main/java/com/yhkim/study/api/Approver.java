package com.yhkim.study.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter @Setter
@Slf4j
@AllArgsConstructor
public class Approver {
	private String id;
	private String name;
	private String dept;
	private String position;
	private String email;
	private String cellphone;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("id: ").append(id).append(", name: ").append(name).append(", dept: ").append(dept).append(", position: ").append(position)
			.append("email: ").append(email).append("cellphone: ").append(cellphone);
		log.info(sb.toString());
		return sb.toString();
	}
}
