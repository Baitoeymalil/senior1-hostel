package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Information;
import com.mfu.service.InformationService;

@Stateless
@Remote(InformationService.class)
public class InformationServiceBean implements InformationService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Information information) {
		this.em.persist(information);
	}

	public Information findInformationById(long informationId) {
		return this.em.find(Information.class, informationId);
	}

	public void update(Information information) {
		this.em.merge(information);

	}

	public void delete(long informationId) {
		Information information = findInformationById(informationId);
		if (information != null) {
			em.remove(information);
		}
	}

	public List<Information> getAllinformation() {
		return em.createQuery("SELECT x FROM Information x").getResultList();
	}

}
