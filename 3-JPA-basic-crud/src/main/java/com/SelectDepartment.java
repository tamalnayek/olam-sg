package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Department;
import com.model.OlamEmployee;

public class SelectDepartment {

	public static void main(String[] args) {

		// ----------------------------------------------

		// JPA API

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Department department=em.find(Department.class, 222);
		System.out.println(department);
		for(OlamEmployee employee:department.getEmployees()) {
			System.out.println(employee);
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------------

	}

}
