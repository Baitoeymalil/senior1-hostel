package com.mfu.serviceBean;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.Spa;
import com.mfu.service.SpaService;


@Service
@Repository
@Transactional
public class SpaServiceBean implements SpaService{
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Spa spa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Spa findSpaId(long spaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Spa spa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long spaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Spa> getAllSpa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spa> findSpaNameame(String spaName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
