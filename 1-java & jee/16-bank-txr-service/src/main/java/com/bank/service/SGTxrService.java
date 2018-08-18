package com.bank.service;

import org.apache.log4j.Logger;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

public class SGTxrService implements TxrService {

	private Logger logger = Logger.getLogger("bank-txr");

	private AccountRepository accountRepository;

	public SGTxrService() {
		logger.info("SGTxrService instance created");
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("accountRepository instance injected to SGTxrService");
	}

	@Override
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		logger.info("txr initiated...");

		boolean status = false;
		// load accounts
		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		// check conditions
		if (fromAccount.getBalance() >= amount) {

			// debit & credit
			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);

			// update accounts
			accountRepository.updateAccount(fromAccount);
			accountRepository.updateAccount(toAccount);
			status = true;
			logger.info("txr success...");
		} else {
			logger.warn("Txr failed.");
		}

		return status;
	}

}
