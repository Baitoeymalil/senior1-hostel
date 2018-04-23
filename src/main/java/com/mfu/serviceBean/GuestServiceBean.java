package com.mfu.serviceBean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.Guest;
import com.mfu.service.GuestService;



@Service
@Repository
@Transactional
public class GuestServiceBean implements GuestService{
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Guest guest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Guest findGuestId(long guestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Guest guest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long guestId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Guest> getAllGuest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guest> findGuestFirstname(String guestFirstname) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
