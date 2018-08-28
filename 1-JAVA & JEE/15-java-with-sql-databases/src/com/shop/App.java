package com.shop;

import java.sql.SQLException;
import java.util.List;

import com.shop.model.Product;
import com.shop.repository.ProductRepository;

public class App {

	public static void main(String[] args) {

		ProductRepository productRepository = new ProductRepository();

		// -----------------------------------------------------
		try {
			List<Product> list = productRepository.findAll();
			for (Product product : list) {
				System.out.println(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// -----------------------------------------------------

		Product product = new Product();
		product.setId(333);
		product.setName("New Item");
		product.setPrice(3000);
		product.setDescription("New item");

		try {
			boolean b = productRepository.save(product);
			if (b)
				System.out.println("New item saved");
			else
				System.out.println("Not saved..");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
