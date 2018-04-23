package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Rooms;
import com.mfu.service.RoomService;

@Stateless
@Remote(RoomService.class)
public class RoomServiceBean implements RoomService{
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Rooms room) {
		this.em.persist(room);
	}

	public Rooms findRoomById(long roomId) {
		return this.em.find(Rooms.class, roomId);
	}

	public void update(Rooms room) {
		this.em.merge(room);

	}

	public void delete(long roomId) {
		Rooms room = findRoomById( roomId);
		if (room != null) {
			em.remove(room);
		}
	}

	public List<Rooms> getAllRoom() {
		return em.createQuery("SELECT x FROM Rooms x").getResultList();
	}

	public List<Rooms> findRoomByRoomType(String roomType) {
		return em.createQuery("SELECT em FROM Rooms em WHERE em.roomType LIKE :fn ").setParameter("fn", roomType + "%")
				.getResultList();
	}



}
