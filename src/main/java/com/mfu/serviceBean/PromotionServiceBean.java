package com.mfu.serviceBean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfu.entity.Promotion;
import com.mfu.service.PromotionService;

@Service
@Repository
@Transactional
public class PromotionServiceBean implements PromotionService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(Promotion promo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Promotion findPromotionId(long promotionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Promotion promo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long promotionId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Promotion> getAllPromotion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Promotion> findPromotionByPromoCode(String promoCode) {
		// TODO Auto-generated method stub
		return null;
	}
	

}


