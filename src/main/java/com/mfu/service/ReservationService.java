package com.mfu.service;

import java.util.List;

import com.mfu.entity.Reservation;

public interface ReservationService {
	public void insert(Reservation reservation);

	public Reservation findReservById(long reservationId);

	public void update(Reservation reservation);

	public void delete(long reservationId);

	public List<Reservation> getAllReservation();

}
