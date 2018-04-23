package com.mfu.serviceBean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.BookRoom;
import com.mfu.service.BookRoomService;


@Service
@Repository
@Transactional
public class BookRoomServiceBean implements BookRoomService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(BookRoom bookRoom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookRoom findbookRoomById(long bookRoomId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BookRoom bookRoom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long bookRoomId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookRoom> getAllbookRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	
}