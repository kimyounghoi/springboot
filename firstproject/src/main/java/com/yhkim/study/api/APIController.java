package com.yhkim.study.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	@RequestMapping(value="/api/approverlist", method=RequestMethod.GET)
	public List<Approver> getApproverList() {
		List<Approver> approverList = new ArrayList<>();
		approverList.add(new Approver("test.yhkim", "김영회", "웹플랫폼팀", "차장", "kjimyhcj@gmail.com", "010-1234-5678"));
		return approverList;
	}
}
