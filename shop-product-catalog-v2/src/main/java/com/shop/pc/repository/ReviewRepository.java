package com.shop.pc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shop.pc.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

//	@Query(value = "select * from REVIEW where product_id=?1", nativeQuery = true) // SQL  ==> based on relational model
	@Query(value = "from Review rev where rev.product.id=?1", nativeQuery = false) // JPQL ==> based on object model
	List<Review> loadReviewsByProduct(int productId);

}
