package com.bank;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.service.TxrService;

public class App {

	public static void main(String[] args) {

		System.out.println("------------------------------------------");

		ConfigurableApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("bank-txr.xml");

		System.out.println("------------------------------------------");

		System.out.println("------------------------------------------");
		TxrService txrService = context.getBean("txrService", TxrService.class);
		txrService.txr(1000, "1", "2");
		System.out.println("------------------------------------------");

		System.out.println("------------------------------------------");
		context.close();
		System.out.println("------------------------------------------");
	}

}
