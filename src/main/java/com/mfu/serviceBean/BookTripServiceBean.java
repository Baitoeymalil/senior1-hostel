package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.BookTrip;
import com.mfu.service.BookTripService;
@Stateless
@Remote(BookTripService.class)
public class BookTripServiceBean implements BookTripService{
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(BookTrip bookTrip) {
		this.em.persist(bookTrip);
	}

	public BookTrip findBookTripById(long bookTripId) {
		return this.em.find(BookTrip.class, bookTripId);
	}

	public void update(BookTrip bookTrip) {
		this.em.merge(bookTrip);

	}

	public void delete(long bookTripId) {
		BookTrip bookTrip = findBookTripById(bookTripId);
		if (bookTrip != null) {
			em.remove(bookTrip);
		}
	}

	public List<BookTrip> getAllBookTrip() {
		return em.createQuery("SELECT x FROM BookTrip x").getResultList();
	}

	public BookTrip findBookTripByPromocode(String promotionCode) {
		return this.em.find(BookTrip.class, promotionCode);
	}
//	public List<BookTrip> findBookTripByBookTripName(String
//	 BookTripType) {
//	 return em.createQuery("SELECT em FROM BookTrip em WHERE em.BookTripName LIKE :fn ").setParameter("fn", BookTripType + "%")
//	 .getResultList();
//	 }

}
