package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Member;
import com.mfu.service.MemberService;

@Stateless
@Remote(MemberService.class)
public class MemberServiceBean implements MemberService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Member mem) {
		this.em.persist(mem);
	}

	public Member findMemberId(long memberId) {
		return this.em.find(Member.class, memberId);
	}

	public void update(Member mem) {
		this.em.merge(mem);

	}

	public void delete(long memberId) {
		Member mem = findMemberId(memberId);
		if (mem != null) {
			em.remove(mem);
		}
	}

	public List<Member> getAllMember() {
		return em.createQuery("SELECT x FROM Member x").getResultList();
	}

	public List<Member> findMemberFirstname(String memberFirstname) {
		return em.createQuery("SELECT em FROM Member em WHERE em.memberFirstname LIKE :fn ")
				.setParameter("fn", memberFirstname + "%").getResultList();
	}

	public Member findMemberEmailAndMemberPassword(String memberEmail, String memberPassword) {
		return (Member) this.em
				.createQuery("SELECT em FROM Member em WHERE em.memberEmail  =:fn AND em.memberPassword =:ln ")
				.setParameter("fn", memberEmail).setParameter("ln", memberPassword).getSingleResult();
	}

}
