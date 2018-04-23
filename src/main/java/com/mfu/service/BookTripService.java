package com.mfu.service;

import java.util.List;

import com.mfu.entity.BookTrip;

public interface BookTripService {
	public void insert(BookTrip bookTrip);

	public BookTrip findBookTripById(long bookTripId);
	
	public BookTrip findBookTripByPromocode(String promotionCode);

	public void update(BookTrip bookTrip);

	public void delete(long bookTripId);

	public List<BookTrip> getAllBookTrip();
}
