package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Admin;
import com.mfu.service.AdminService;

@Stateless
@Remote(AdminService.class)
public class AdnimServiceBean implements AdminService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Admin admin) {
		this.em.persist(admin);
	}

	public Admin findAdminId(long adminId) {
		return this.em.find(Admin.class, adminId);
	}

	public void update(Admin admin) {
		this.em.merge(admin);

	}

	public void delete(long adminId) {
		Admin admin = findAdminId(adminId);
		if (admin != null) {
			em.remove(admin);
		}
	}

	public List<Admin> getAllAdmin() {
		return em.createQuery("SELECT x FROM Admin x").getResultList();
	}

	public List<Admin> findAdminUsername(String adminUsername) {
		return em.createQuery("SELECT em FROM Admin em WHERE em.adminUsername LIKE :uname ")
				.setParameter("uname", adminUsername + "%").getResultList();
	}

	public Admin findAdminUsernameAndAdminPassword(String adminUsername, String adminPassword) {
		return (Admin) this.em
				.createQuery("SELECT em FROM Admin em WHERE em.adminUsername  =:uname AND em.adminPassword =:pass ")
				.setParameter("uname", adminUsername).setParameter("pass", adminPassword).getSingleResult();
	}

}
