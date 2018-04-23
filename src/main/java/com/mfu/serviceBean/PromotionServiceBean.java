package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Promotion;
import com.mfu.service.PromotionService;

@Stateless
@Remote(PromotionService.class)
public class PromotionServiceBean implements PromotionService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;
	public void insert(Promotion promo) {
		this.em.persist(promo);
	}

	public Promotion findPromotionId(long promotionId) {
		return this.em.find(Promotion.class, promotionId);
	}

	public void update(Promotion promo) {
		this.em.merge(promo);

	}

	public void delete(long promotionId) {
		Promotion promo = findPromotionId(promotionId);
		if (promo != null) {
			em.remove(promo);
		}
	}

	public List<Promotion> getAllPromotion() {
		return em.createQuery("SELECT x FROM Promotion x").getResultList();
	}

	public List<Promotion> findPromotionByPromoCode(String promoCode) {
		return em.createQuery("SELECT em FROM Promotion em WHERE em.promotionCode LIKE :pc ").setParameter("pc", promoCode + "%")
				.getResultList();
	}
	

}


