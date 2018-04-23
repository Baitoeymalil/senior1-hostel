package com.mfu.service;

import java.util.List;

import com.mfu.entity.Product;

public interface ProductService {
	public void insert(Product product);

	public Product findProductById(long productId);

	public void update(Product product);

	public void delete(long productId);

	public List<Product> getAllProduct();
}
