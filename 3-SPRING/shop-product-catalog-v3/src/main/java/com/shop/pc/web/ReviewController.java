package com.shop.pc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pc.model.Review;
import com.shop.pc.repository.ProductRepository;
import com.shop.pc.repository.ReviewRepository;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping(value = "/v1/api/products/{id}/reviews")
public class ReviewController {

	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private ProductRepository productRepository;

	@PostMapping
	public void post(@PathVariable int id,@RequestBody Review review) {
		review.setProduct(productRepository.findById(id).get());
		reviewRepository.save(review);
	}
	
	@GetMapping
	public List<Review> get(@PathVariable int id) {
		return reviewRepository.loadReviewsByProduct(id);
	}
	
}
