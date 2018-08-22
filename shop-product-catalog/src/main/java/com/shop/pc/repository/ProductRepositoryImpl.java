package com.shop.pc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shop.pc.model.Product;

@Transactional
@Repository
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Product product) {
		em.persist(product);
	}

	@Override
	public Product find(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public List<Product> findAll() {
		String qlString = "from Product";
		Query query = em.createQuery(qlString);
		return query.getResultList();
	}

}
