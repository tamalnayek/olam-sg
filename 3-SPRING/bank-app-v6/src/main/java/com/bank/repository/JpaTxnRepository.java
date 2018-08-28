package com.bank.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bank.model.Txn;

@Repository
public class JpaTxnRepository implements TxnRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Txn txn) {
		em.persist(txn); // insert 
	}

	@Override
	public List<Txn> findAll(String accNum) {
		// JPQL
		String jpql = "from Txn txn where txn.account.num=?1";  
		Query query = em.createQuery(jpql);
		query.setParameter(1, accNum);
		return query.getResultList();
	}

}
