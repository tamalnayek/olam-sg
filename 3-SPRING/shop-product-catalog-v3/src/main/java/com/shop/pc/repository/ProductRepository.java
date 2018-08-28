package com.shop.pc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shop.pc.model.Product;

@CrossOrigin(origins= {"*"})
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByPrice(double price);
	
}
