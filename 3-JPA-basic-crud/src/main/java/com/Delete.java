package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.model.OlamEmployee;

public class Delete {

	public static void main(String[] args) {

		// ----------------------------------------------

		// JPA API

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		OlamEmployee olamEmployee = em.find(OlamEmployee.class, 127); // managed

		em.remove(olamEmployee); // removed

		em.getTransaction().commit();
		em.close();
		emf.close();

	}
}
