package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.OrderProduct;
import com.mfu.service.OrderProductService;

@Stateless
@Remote(OrderProductService.class)
public class OrderProductServiceBean implements OrderProductService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;

	public void insert(OrderProduct orderProduct) {
		this.em.persist(orderProduct);
	}

	public OrderProduct findOrderProductById(long orderProductId) {
		return this.em.find(OrderProduct.class, orderProductId);
	}

	public void update(OrderProduct orderProduct) {
		this.em.merge(orderProduct);

	}

	public void delete(long orderProductId) {
		OrderProduct orderProduct = findOrderProductById(orderProductId);
		if (orderProduct != null) {
			em.remove(orderProduct);
		}
	}

	public List<OrderProduct> getAllOrderProduct() {
		return em.createQuery("SELECT x FROM OrderProduct x").getResultList();
	}

	// public List<OrderProduct> findOrderProductByOrderProductType(String
	// OrderProductType) {
	// return em.createQuery("SELECT em FROM OrderProduct em WHERE em.OrderProductType
	// LIKE
	// :fn
	// ").setParameter("fn", OrderProductType + "%")
	// .getResultList();
	// }

}
