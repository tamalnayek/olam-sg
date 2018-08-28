package com.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.examples.model.Product;

public class Smart_Java_Code {
	
	public static void main(String[] args) {
		
		Product product1 = new Product(234231, "item-1", 100.00);
		Product product2 = new Product(134230, "item-2", 300.00);
		Product product3 = new Product(234238, "item-2", 200.00);
		Product product4 = new Product(534234, "item-4", 400.00);
		Product product5 = new Product(234239, "item-5", 500.00);

		
		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product5);
		products.add(product5);
		products.add(product5);
		
		
		
		products
		.stream()
		.parallel()
		.filter(p->p.getPrice()>300)
		.limit(3)
		.sorted(Comparator.comparing(Product::getName).reversed())
		.forEach(System.out::println);
		
	}

}
