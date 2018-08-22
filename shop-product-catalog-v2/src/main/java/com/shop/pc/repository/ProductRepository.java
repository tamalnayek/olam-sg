package com.shop.pc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.pc.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByPrice(double price);
	
}
