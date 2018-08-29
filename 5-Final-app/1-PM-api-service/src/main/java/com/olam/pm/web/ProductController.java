package com.olam.pm.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olam.pm.model.Product;
import com.olam.pm.repository.ProductRepository;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/v1/api/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@PostMapping
	public ResponseEntity<Product> create(@RequestBody Product product) {
		product = productRepository.save(product);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Product>> get() {
		List<Product> products = productRepository.findAll();
		// for intentional response delay
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<?> getOne(@PathVariable int id) {
		Optional<Product> optional = productRepository.findById(id);
		if (optional.isPresent())
			return new ResponseEntity<Product>(optional.get(), HttpStatus.OK);
		else
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<Product> update(@PathVariable int id, @RequestBody Product product) {
		product = productRepository.save(product);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@DeleteMapping(value = "{id}")
	public ResponseEntity<String> deleteOne(@PathVariable int id) {
		productRepository.deleteById(id);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
