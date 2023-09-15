package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.object.Member;
import com.example.demo.repo.MemberRepo;

@Service
public class LoginService {
	@Autowired
	private MemberRepo repo;

	public boolean loginIdCheck(String id, String password) {
		List<Member> matchingMembers = repo.findWithDynamicQuery(id, password);
		System.out.println(matchingMembers);
		// 매칭되는 멤버가 하나 이상 있다면 첫 번째 멤버의 id를 반환
		if (!matchingMembers.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
