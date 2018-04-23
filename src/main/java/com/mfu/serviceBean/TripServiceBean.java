package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Trip;
import com.mfu.service.TripService;
@Stateless
@Remote(TripService.class)
public class TripServiceBean implements TripService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Trip trip) {
		this.em.persist(trip);
	}

	public Trip findTripId(long tripId) {
		return this.em.find(Trip.class, tripId);
	}

	public void update(Trip trip) {
		this.em.merge(trip);

	}

	public void delete(long tripId) {
		Trip trip = findTripId(tripId);
		if (trip != null) {
			em.remove(trip);
		}
	}

	public List<Trip> getAllTrip() {
		return em.createQuery("SELECT x FROM Trip x").getResultList();
	}

	public List<Trip> findTripName(String tripName) {
		return em.createQuery("SELECT em FROM Trip em WHERE em.tripName LIKE :sn ")
				.setParameter("sn", tripName + "%").getResultList();
	}

}
