package com.mfu.service;

import java.util.List;

import com.mfu.entity.Rooms;

public interface RoomService {
	public void insert(Rooms room);

	public Rooms findRoomById(long roomId);

	public void update(Rooms room);

	public void delete(long roomId);

	public List<Rooms> getAllRoom();

	public List<Rooms> findRoomByRoomType(String roomType);
}
