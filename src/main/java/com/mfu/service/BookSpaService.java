package com.mfu.service;

import java.util.List;

import com.mfu.entity.BookSpa;

public interface BookSpaService {
	public void insert(BookSpa bookSpa) ;

	public BookSpa findBookSpaById(long bookSpaId) ;

	public void update(BookSpa bookSpa) ;

	public void delete(long bookSpaId) ;

	public List<BookSpa> getAllBookSpa() ;
}
