package com.mfu.serviceBean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.Rooms;
import com.mfu.service.RoomService;


@Service
@Repository
@Transactional
public class RoomServiceBean implements RoomService{
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Rooms room) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rooms findRoomById(long roomId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Rooms room) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long roomId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Rooms> getAllRoom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rooms> findRoomByRoomType(String roomType) {
		// TODO Auto-generated method stub
		return null;
	}



}
