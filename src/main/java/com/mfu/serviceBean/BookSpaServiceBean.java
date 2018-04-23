package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.BookSpa;
import com.mfu.service.BookSpaService;

@Stateless
@Remote(BookSpaService.class)
public class BookSpaServiceBean implements BookSpaService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(BookSpa bookSpa) {
		this.em.persist(bookSpa);
	}

	public BookSpa findBookSpaById(long bookSpaId) {
		return this.em.find(BookSpa.class, bookSpaId);
	}

	public void update(BookSpa bookSpa) {
		this.em.merge(bookSpa);

	}

	public void delete(long bookSpaId) {
		BookSpa bookSpa = findBookSpaById(bookSpaId);
		if (bookSpa != null) {
			em.remove(bookSpa);
		}
	}

	public List<BookSpa> getAllBookSpa() {
		return em.createQuery("SELECT x FROM BookSpa x").getResultList();
	}

}
