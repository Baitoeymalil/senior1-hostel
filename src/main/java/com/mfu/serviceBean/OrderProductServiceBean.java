package com.mfu.serviceBean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.mfu.entity.OrderProduct;
import com.mfu.service.OrderProductService;


@Service
public class OrderProductServiceBean implements OrderProductService {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insert(OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderProduct findOrderProductById(long orderProductId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long orderProductId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderProduct> getAllOrderProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
