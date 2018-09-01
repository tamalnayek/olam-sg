package com.olam.contract.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.olam.contract.model.Contract;

@Repository
public class ContractRepositoryImpl implements ContractRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Contract createNewContact(Contract contract) {

		StoredProcedureQuery query = em.createStoredProcedureQuery("");

		query.setParameter(1, contract.getCompany());
		query.setParameter(2, contract.getOrder());
		query.setParameter(3, "N");

		query.execute();

		String orderId = (String) query.getOutputParameterValue(4);

		contract.setOrder(orderId);
		
		// insert

		return contract;
	}

}
