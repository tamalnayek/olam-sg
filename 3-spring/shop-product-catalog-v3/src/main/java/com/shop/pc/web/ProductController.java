package com.shop.pc.web;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shop.pc.model.Product;
import com.shop.pc.repository.ProductRepository;

@RestController
@RequestMapping(value = "/v1/api/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;


	@PostMapping(consumes = { "application/xml", "application/json" })
	public ResponseEntity<Product> createNewProduct(@RequestBody Product product) {
		product = productRepository.save(product);
		ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(product, HttpStatus.CREATED);
		return responseEntity;
	}

	@PutMapping(value = "/{id}", consumes = { "application/xml", "application/json" })
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable int id) {
		product = productRepository.save(product);
		ResponseEntity<Product> responseEntity = new ResponseEntity<Product>(product, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping
	public ResponseEntity<List<Product>> readAllProducts() {
		List<Product> products = productRepository.findAll();
		ResponseEntity<List<Product>> responseEntity = new ResponseEntity<>(products, HttpStatus.OK);
		return responseEntity;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> readProduct(@PathVariable int id,Principal principal) {
		Optional<Product> optional = productRepository.findById(id);
		ResponseEntity<?> responseEntity = null;
		if (optional.isPresent()) {
			responseEntity = new ResponseEntity<Product>(optional.get(), HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<String>("Product dosent exist", HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}

}
