package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Spa;
import com.mfu.service.SpaService;
@Stateless
@Remote(SpaService.class)
public class SpaServiceBean implements SpaService{
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(Spa spa) {
		this.em.persist(spa);
	}

	public Spa findSpaId(long spaId) {
		return this.em.find(Spa.class, spaId);
	}

	public void update(Spa spa) {
		this.em.merge(spa);

	}

	public void delete(long spaId) {
		Spa spa = findSpaId(spaId);
		if (spa != null) {
			em.remove(spa);
		}
	}

	public List<Spa> getAllSpa() {
		return em.createQuery("SELECT x FROM Spa x").getResultList();
	}

	public List<Spa> findSpaNameame(String spaName) {
		return em.createQuery("SELECT em FROM Spa em WHERE em.spaName LIKE :sn ")
				.setParameter("sn", spaName + "%").getResultList();
	}

}
