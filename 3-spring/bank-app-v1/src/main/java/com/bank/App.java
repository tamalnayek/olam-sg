package com.bank;

import com.bank.repository.JdbcAccountRepository;
import com.bank.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		System.out.println("------------------------------------------");
		JdbcAccountRepository jdbcAccountRepository = new JdbcAccountRepository();
		TxrServiceImpl txrService = new TxrServiceImpl();
		txrService.setAccountRepository(jdbcAccountRepository); // assembly
		System.out.println("------------------------------------------");

		System.out.println("------------------------------------------");
		txrService.txr(1000, "1", "2");
		System.out.println("------------------------------------------");

		System.out.println("------------------------------------------");

		System.out.println("------------------------------------------");
	}

}
