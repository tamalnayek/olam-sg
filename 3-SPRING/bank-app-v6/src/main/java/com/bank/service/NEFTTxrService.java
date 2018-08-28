package com.bank.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.Account;
import com.bank.model.Txn;
import com.bank.model.TxnType;
import com.bank.repository.AccountRepository;
import com.bank.repository.TxnRepository;

@Service
public class NEFTTxrService implements TxrService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TxnRepository txnRepository;

	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = {TxrFailedException.class})
	@Override
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		Account fromAccount = accountRepository.find(fromAccNum);
		Account toAccount = accountRepository.find(toAccNum);

		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		fromAccount = accountRepository.update(fromAccount);
		toAccount = accountRepository.update(toAccount);

		if (fromAccount.getBalance() < 0)
			throw new TxrFailedException();

		Txn debitTxn = new Txn();
		debitTxn.setType(TxnType.DEBIT);
		debitTxn.setAmount(amount);
		debitTxn.setClosing_balance(fromAccount.getBalance());
		debitTxn.setDate(new Date());
		debitTxn.setAccount(fromAccount);

		Txn creditTxn = new Txn();
		creditTxn.setType(TxnType.CREDIT);
		creditTxn.setAmount(amount);
		creditTxn.setClosing_balance(toAccount.getBalance());
		creditTxn.setDate(new Date());
		creditTxn.setAccount(toAccount);

		txnRepository.save(debitTxn);
		txnRepository.save(creditTxn);

		return true;
	}

}
