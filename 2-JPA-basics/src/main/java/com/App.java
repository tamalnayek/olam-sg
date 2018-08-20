package com;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.OlamEmployee;


public class App {

	public static void main(String[] args) {

		// ----------------------------------------------
 
		// JPA API

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		OlamEmployee employee=new OlamEmployee();
		employee.setEmpId(123);
		employee.setEmpName("OLAM-SG");
		employee.setGender("MALE");
		employee.setProfile("bla bla");
		
		em.persist(employee);
		

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------------

	}

}
