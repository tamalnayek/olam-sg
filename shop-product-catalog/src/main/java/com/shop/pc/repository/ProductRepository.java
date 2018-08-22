package com.shop.pc.repository;

import java.util.List;

import com.shop.pc.model.Product;

public interface ProductRepository {

	void save(Product product);
	Product find(int id);
	List<Product> findAll();
	//...

}
