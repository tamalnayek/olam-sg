package com.bank;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bank.model.Txn;
import com.bank.repository.TxnRepository;
import com.bank.service.TxnService;
import com.bank.service.TxrService;

@SpringBootApplication
public class BankAppV5Application {

	public static void main(String[] args) {

		System.out.println("----------------------------------");
		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(BankAppV5Application.class, args);
		System.out.println("----------------------------------");

		TxnService txnService = context.getBean(TxnService.class);
		List<Txn> list = txnService.getTxns("2", 100.0);
		for (Txn txn : list) {
			System.out.println(txn);
		}

		System.out.println("----------------------------------");
		context.close();
		System.out.println("----------------------------------");

	}
}
