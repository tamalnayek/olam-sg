package com.client.app;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.client.app.model.Product;

public class App {

	public static void main(String[] args) {

//		Product product = new Product();
//		product.setId(777);
//		product.setName("java-client-product");
//		product.setDate(new Date());
//		product.setDescription("added by java client app");

//		String url = "http://localhost:8080/api/products";

		//

		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.postForObject(url, product, Product.class);
//		System.out.println("product saved");

		// ---------------------------------------------------
		String url = "http://localhost:8080/api/products/555";
		Product product = restTemplate.getForObject(url, Product.class);
		System.out.println(product);

	}

}
