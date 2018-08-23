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

public class Update {

	public static void main(String[] args) {

		// ----------------------------------------------

		// JPA API

		// Req-1
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		OlamEmployee olamEmployee = em.find(OlamEmployee.class, 127); // Managed
		em.getTransaction().commit();
		em.close(); // Detached

		System.out.println("-----------------------------------");
		olamEmployee.setGender("MALE");
		System.out.println("-----------------------------------");

		// Req-2
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(olamEmployee);
		em.getTransaction().commit();
		em.close();

		emf.close();

	}
}
