package com.mfu.serviceBean;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.Admin;
import com.mfu.service.AdminService;


@Service
@Repository
@Transactional
public class AdminServiceBean implements AdminService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin findAdminId(long adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long adminId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findAdminUsername(String adminUsername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findAdminUsernameAndA2dminPassword(String adminUsername, String adminPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
