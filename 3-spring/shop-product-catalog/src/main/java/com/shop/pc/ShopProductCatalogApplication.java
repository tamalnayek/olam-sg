package com.shop.pc;

import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shop.pc.model.Product;
import com.shop.pc.repository.ProductRepository;

@SpringBootApplication
public class ShopProductCatalogApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(ShopProductCatalogApplication.class, args);

		ProductRepository productRepository = context.getBean(ProductRepository.class);

//		Product product = new Product();
//		product.setId(222);
//		product.setName("Mobile");
//		product.setPrice(18000.00);
//		product.setImage("images/Mobile.png");
//		product.setDate(new Date());
//		product.setDescription("New pro");
		
//		productRepository.save(product);
		
		
//		Product product=productRepository.find(111);
//		System.out.println(product.getName());
		
		
		List<Product> products=productRepository.findAll();
		for(Product product:products) {
			System.out.println(product.getName());
		}

		//context.close();
	}
}
