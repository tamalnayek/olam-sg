package com.bank.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.Txn;
import com.bank.repository.TxnRepository;

@Service
public class TxnServiceImpl implements TxnService {

	@Autowired
	private TxnRepository txnRepository;

	@Override
	public List<Txn> getTxns(String accNum) {
		List<Txn> allTxns = txnRepository.findAll(accNum);
		return allTxns;
	}

	@Override
	public List<Txn> getTxns(String accNum, double amount) {
		List<Txn> allTxns = txnRepository.findAll(accNum);

//		List<Txn> outTxns = new ArrayList<>();
//		for (Txn txn : allTxns) {
//			if (txn.getAmount() == amount) {
//				outTxns.add(txn);
//			}
//		}
//		return outTxns;

		// java-8 : functional programming with stream lib

		return allTxns.stream().filter(txn -> txn.getAmount() == amount).collect(Collectors.toList());

	}

	@Override
	public List<Txn> getTxns(String accNum, Date date) {
		List<Txn> allTxns = txnRepository.findAll(accNum);

		List<Txn> outTxns = new ArrayList<>();
		for (Txn txn : allTxns) {
			if (txn.getDate() == date) {
				outTxns.add(txn);
			}
		}
		return outTxns;

	}

	@Override
	public List<Txn> getTxns(String accNum, Date fromDate, Date toDate) {
		return null;
	}

}
