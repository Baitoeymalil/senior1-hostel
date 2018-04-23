package com.mfu.service;

import java.util.List;

import com.mfu.entity.Promotion;

public interface PromotionService {
	public void insert(Promotion promo);

	public Promotion findPromotionId(long promotionId);

	public void update(Promotion promo);

	public void delete(long promotionId);

	public List<Promotion> getAllPromotion();

	public List<Promotion> findPromotionByPromoCode(String promoCode);
}
