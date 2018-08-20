package com.bank.service;

import org.apache.log4j.Logger;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("bank");

	private AccountRepository accountRepository;

	public TxrServiceImpl() {
		logger.info("TxrService instance created...");
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("AccountRepository injected to TxrService ");
	}

	public boolean txr(double amount, String fromAccNum, String toAccNum) {
		logger.info("Txr initiated...");
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		//fromAccount.setBalance(fromAccount.getBalance() - amount);
		//toAccount.setBalance(toAccount.getBalance() + amount);

		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);
		logger.info("Txr finished");
		return false;
	}

}
