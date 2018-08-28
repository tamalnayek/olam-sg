package com.bank.service;

import java.util.Date;
import java.util.List;

import com.bank.model.Txn;

public interface TxnService {

	List<Txn> getTxns(String accNum,int top);

	List<Txn> getTxns(String accNum,double amount);

	List<Txn> getTxns(String accNum,Date date);

	List<Txn> getTxns(String accNum,Date fromDate, Date toDate);

}
