package com.olam.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olam.pm.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
