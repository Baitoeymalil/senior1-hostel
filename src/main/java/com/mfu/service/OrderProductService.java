package com.mfu.service;

import java.util.List;

import com.mfu.entity.OrderProduct;

public interface OrderProductService {
	public void insert(OrderProduct orderProduct);

	public OrderProduct findOrderProductById(long orderProductId);

	public void update(OrderProduct orderProduct);

	public void delete(long orderProductId);

	public List<OrderProduct> getAllOrderProduct();
}
