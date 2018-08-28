package com.bank.service;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

public class TxrService {
	
	public boolean txr(double amount,String fromAccNum,String toAccNum){
		System.out.println("Txr initiated...");
		AccountRepository accountRepository=new AccountRepository();
		
		Account fromAccount=accountRepository.loadAccount(fromAccNum);
		Account toAccount=accountRepository.loadAccount(toAccNum);
		
		fromAccount.balance=fromAccount.balance-amount;
		toAccount.balance=toAccount.balance+amount;
		
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);
		
		System.out.println("Txr success");
		return true;
	}

}
