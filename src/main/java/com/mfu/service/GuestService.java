package com.mfu.service;

import java.util.List;

import com.mfu.entity.Guest;

public interface GuestService {
	public void insert(Guest guest);

	public Guest findGuestId(long guestId);

	public void update(Guest guest);

	public void delete(long guestId);

	public List<Guest> getAllGuest();

	public List<Guest> findGuestFirstname(String guestFirstname);
}
