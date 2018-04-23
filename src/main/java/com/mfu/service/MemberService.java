package com.mfu.service;

import java.util.List;

import com.mfu.entity.Member;

public interface MemberService {
	public void insert(Member mem);

	public Member findMemberId(long memberId);

	public void update(Member mem);

	public void delete(long memberId);

	public List<Member> getAllMember();

	public List<Member> findMemberFirstname(String memberFirstname);

	public Member findMemberEmailAndMemberPassword(String memberEmail, String memberPassword);
}
