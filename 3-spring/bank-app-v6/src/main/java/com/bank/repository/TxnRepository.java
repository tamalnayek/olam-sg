package com.bank.repository;

import java.util.List;

import com.bank.model.Txn;

public interface TxnRepository {
	void save(Txn txn);

	List<Txn> findAll(String accNum);
}
