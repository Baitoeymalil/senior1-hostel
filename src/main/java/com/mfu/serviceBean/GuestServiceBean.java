package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Guest;
import com.mfu.service.GuestService;

@Stateless
@Remote(GuestService.class)
public class GuestServiceBean implements GuestService{
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Guest guest) {
		this.em.persist(guest);
	}

	public Guest findGuestId(long guestId) {
		return this.em.find(Guest.class, guestId);
	}

	public void update(Guest guest) {
		this.em.merge(guest);

	}

	public void delete(long guestId) {
		Guest guest = findGuestId(guestId);
		if (guest != null) {
			em.remove(guest);
		}
	}

	public List<Guest> getAllGuest() {
		return em.createQuery("SELECT x FROM Guest x").getResultList();
	}

	public List<Guest> findGuestFirstname(String GuestFirstname) {
		return em.createQuery("SELECT em FROM Guest em WHERE em.GuestFirstname LIKE :fn ")
				.setParameter("fn", GuestFirstname + "%").getResultList();
	}

//	public Guest findGuestEmailAndGuestPassword(String GuestEmail, String GuestPassword) {
//		return (Guest) this.em
//				.createQuery("SELECT em FROM Guest em WHERE em.GuestEmail  =:fn AND em.GuestPassword =:ln ")
//				.setParameter("fn", GuestEmail).setParameter("ln", GuestPassword).getSingleResult();
//	}

}
