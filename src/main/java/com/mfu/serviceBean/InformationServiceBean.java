package com.mfu.serviceBean;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.mfu.entity.Information;
import com.mfu.service.InformationService;



@Service
public class InformationServiceBean implements InformationService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Information information) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Information findInformationById(long informationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Information information) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long informationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Information> getAllinformation() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
