package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.BookRoom;
import com.mfu.service.BookRoomService;

@Stateless
@Remote(BookRoomService.class)
public class BookRoomServiceBean implements BookRoomService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(BookRoom bookRoom) {
		this.em.persist(bookRoom);
	}

	public BookRoom findbookRoomById(long bookRoomId) {
		return this.em.find(BookRoom.class, bookRoomId);
	}

	public void update(BookRoom bookRoom) {
		this.em.merge(bookRoom);

	}

	public void delete(long bookRoomId) {
		BookRoom bookRoom = findbookRoomById(bookRoomId);
		if (bookRoom != null) {
			em.remove(bookRoom);
		}
	}

	public List<BookRoom> getAllbookRoom() {
		return em.createQuery("SELECT x FROM BookRoom x").getResultList();
	}

	// public List<BookRoom> findbookRoomBybookRoomType(String bookRoomType) {
	// return em.createQuery("SELECT em FROM bookRoom em WHERE em.bookRoomType LIKE
	// :fn
	// ").setParameter("fn", bookRoomType + "%")
	// .getResultList();
	// }

}