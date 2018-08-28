package com.bank.repository;

import com.bank.model.Account;

public interface AccountRepository {

	Account find(String num);

	Account update(Account account);
	
}
