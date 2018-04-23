package com.mfu.serviceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mfu.entity.Product;
import com.mfu.service.ProductService;

@Stateless
@Remote(ProductService.class)
public class ProductServiceBean implements ProductService {
	@PersistenceContext(unitName = "HostelDatabase")
	EntityManager em;
	public void insert(Product product) {
		this.em.persist(product);
	}

	public Product findProductById(long productId) {
		return this.em.find(Product.class, productId);
	}

	public void update(Product product) {
		this.em.merge(product);

	}

	public void delete(long productId) {
		Product Product = findProductById(productId);
		if (Product != null) {
			em.remove(Product);
		}
	}

	public List<Product> getAllProduct() {
		return em.createQuery("SELECT x FROM Product x").getResultList();
	}

	// public List<Product> findProductByProductType(String ProductType) {
	// return em.createQuery("SELECT em FROM Product em WHERE em.ProductType LIKE
	// :fn
	// ").setParameter("fn", ProductType + "%")
	// .getResultList();
	// }

}