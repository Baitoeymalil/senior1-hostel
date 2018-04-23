package com.mfu.serviceBean;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.mfu.entity.Bill;
import com.mfu.service.BillService;



@Service
public class BillServiceBean implements BillService{
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Bill bill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bill findbillById(long billId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Bill bill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long billId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bill> getAllbill() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
