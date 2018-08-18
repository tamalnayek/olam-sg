package com.bank;

import com.bank.repository.AccountRepository;
import com.bank.repository.JdbcAccountRepository;
import com.bank.service.SGTxrService;

public class App {

	public static void main(String[] args) {

		// init...
		System.out.println("------------------------------------------------------");
		AccountRepository accountRepository = new JdbcAccountRepository();
		SGTxrService txrService = new SGTxrService();
		txrService.setAccountRepository(accountRepository);

		// Use
		System.out.println("------------------------------------------------------");
		txrService.txr(10.00, "1", "2");
		System.out.println("------------------------------------------------------");

		// Destroy
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
	}

}
