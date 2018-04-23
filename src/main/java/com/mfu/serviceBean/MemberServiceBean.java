package com.mfu.serviceBean;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.Member;
import com.mfu.service.MemberService;



@Service
@Repository
@Transactional
public class MemberServiceBean implements MemberService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Member mem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member findMemberId(long memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Member mem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long memberId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> findMemberFirstname(String memberFirstname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member findMemberEmailAndMemberPassword(String memberEmail, String memberPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
