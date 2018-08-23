package com.shop.pc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class ShopProductCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopProductCatalogApplication.class, args); // create context
	}
}
