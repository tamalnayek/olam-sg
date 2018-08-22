package com.shop.pc;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.shop.pc.model.Product;
import com.shop.pc.repository.ProductRepository;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class ShopProductCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopProductCatalogApplication.class, args);
	}
}
