package com.mfu.serviceBean;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.BookTrip;
import com.mfu.service.BookTripService;


@Service
@Repository
@Transactional
public class BookTripServiceBean implements BookTripService{
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(BookTrip bookTrip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookTrip findBookTripById(long bookTripId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookTrip findBookTripByPromocode(String promotionCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BookTrip bookTrip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long bookTripId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookTrip> getAllBookTrip() {
		// TODO Auto-generated method stub
		return null;
	}

}
