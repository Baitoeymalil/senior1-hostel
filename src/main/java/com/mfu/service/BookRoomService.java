package com.mfu.service;

import java.util.List;

import com.mfu.entity.BookRoom;

public interface BookRoomService {
	public void insert(BookRoom bookRoom);

	public BookRoom findbookRoomById(long bookRoomId);

	public void update(BookRoom bookRoom);

	public void delete(long bookRoomId);

	public List<BookRoom> getAllbookRoom();
}
