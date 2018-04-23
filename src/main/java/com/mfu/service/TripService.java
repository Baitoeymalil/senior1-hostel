package com.mfu.service;

import java.util.List;

import com.mfu.entity.Trip;

public interface TripService {
	public void insert(Trip trip);

	public Trip findTripId(long tripId);

	public void update(Trip trip);

	public void delete(long tripId);

	public List<Trip> getAllTrip();

	public List<Trip> findTripName(String tripName);

}
