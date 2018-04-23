package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Reservation;
import com.mfu.service.ReservationService;

@Stateless
@Remote(ReservationService.class)
public class ReservationServiceBean implements ReservationService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Reservation reservation) {
		this.em.persist(reservation);
	}

	public Reservation findReservById(long reservationId) {
		return this.em.find(Reservation.class, reservationId);
	}

	public void update(Reservation reservation) {
		this.em.merge(reservation);

	}

	public void delete(long reservationId) {
		Reservation reservation = findReservById(reservationId);
		if (reservation != null) {
			em.remove(reservation);
		}
	}

	public List<Reservation> getAllReservation() {
		return em.createQuery("SELECT x FROM Reservation x").getResultList();
	}

	// public List<Reservation> findReservByReservType(String ReservType) {
	// return em.createQuery("SELECT em FROM Reserv em WHERE em.ReservType LIKE :fn
	// ").setParameter("fn", ReservType + "%")
	// .getResultList();
	// }

}
