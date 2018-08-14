package com.bank;

import com.bank.service.TxrService;

public class BankApp {

	public static void main(String[] args) {

		// init
		TxrService txrService = new TxrService();
		
		// use
		txrService.txr(100, "1", "2");
		txrService.txr(200, "3", "4");
		
		// destroy
		txrService = null;

	}

}
