package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
public class JpaAccountRepository implements AccountRepository {

	@PersistenceContext
	private EntityManager em; // connection to db

	@Override
	public Account find(String num) {
		return em.find(Account.class, num);// select * from ACCOUNT where num=?
	}

	@Override
	public Account update(Account account) {
		return em.merge(account); // update ACCOUNT set .... where num=?
	}

}
