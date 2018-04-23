package com.mfu.serviceBean;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.BookSpa;
import com.mfu.service.BookSpaService;


@Service
@Repository
@Transactional
public class BookSpaServiceBean implements BookSpaService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(BookSpa bookSpa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookSpa findBookSpaById(long bookSpaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BookSpa bookSpa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long bookSpaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookSpa> getAllBookSpa() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
