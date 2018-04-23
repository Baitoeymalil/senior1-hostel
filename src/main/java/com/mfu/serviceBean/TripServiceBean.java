package com.mfu.serviceBean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.mfu.entity.Trip;
import com.mfu.service.TripService;


@Service
public class TripServiceBean implements TripService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Trip trip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trip findTripId(long tripId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Trip trip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long tripId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Trip> getAllTrip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trip> findTripName(String tripName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
