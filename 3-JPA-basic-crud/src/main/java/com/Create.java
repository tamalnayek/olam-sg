package com;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Department;
import com.model.OlamEmployee;


public class Create {

	public static void main(String[] args) {

		// ----------------------------------------------
 
		// JPA API

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		OlamEmployee employee=new OlamEmployee(); // Transient
		employee.setEmpId(128);
		employee.setEmpName("OLAM-SG-7");
		employee.setGender("FEMALE");
		employee.setProfile("bla bla");
		
		Department department=new Department();
		department.setId(222);
		
		employee.setDepartment(department);
		
		em.persist(employee);  // managed
		
		

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------------

	}

}
