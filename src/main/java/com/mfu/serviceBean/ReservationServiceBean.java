package com.mfu.serviceBean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.Reservation;
import com.mfu.service.ReservationService;


@Service
@Repository
@Transactional
public class ReservationServiceBean implements ReservationService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Reservation reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reservation findReservById(long reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Reservation reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long reservationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reservation> getAllReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
