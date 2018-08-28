package com.olam.pm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olam.pm.model.Product;
import com.olam.pm.repository.ProductRepository;

@RestController
@RequestMapping("/v1/api/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	// @RequestMapping(method=RequestMethod.POST)
	// or
	@PostMapping
	public void create(@RequestBody Product product) {
		productRepository.save(product);
	}

}
