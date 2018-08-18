package com.bank.repository;

import com.bank.model.Account;

public class AccountRepository {

	public Account loadAccount(String num) {
		// .......
		System.out.println("loading account "+num);
		Account acc = new Account();
		acc.num = num;
		acc.balance = 1000.00;
		return acc;
	}

	public boolean update(Account acc){
		//..
		System.out.println(acc.num+" account updated...");
		return true;
	}

}
