package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class CreateEmployee {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Nag");

		// ----------------------------------------------

		// Hibernate API

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();


		session.save(employee);
		
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();

		// ----------------------------------------------

	}

}
