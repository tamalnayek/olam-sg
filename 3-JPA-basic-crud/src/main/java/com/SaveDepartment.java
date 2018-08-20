package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Department;
import com.model.OlamEmployee;

public class SaveDepartment {

	public static void main(String[] args) {

		// ----------------------------------------------

		// JPA API

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Department department = new Department();
		department.setId(222);
		department.setName("SALES");

		em.persist(department); // managed

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------------

	}

}
