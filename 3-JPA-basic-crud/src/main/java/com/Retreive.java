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

/*
 * 
 *  4 ways  to select data from tables
 *  
 *  -> by primary KEY
 *  -> JPQL ( Java Persistence Query Language )
 *  -> criteria API
 *  -> Native SQL
 *  
 * 
 */

public class Retreive {

	public static void main(String[] args) {

		// ----------------------------------------------

		// JPA API

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// ----------------------------------------------------------
		// way-1: by Id
		// ----------------------------------------------------------

		OlamEmployee olamEmployee=em.find(OlamEmployee.class, 127); // Managed state
		System.out.println(olamEmployee);
		System.out.println(olamEmployee.getDepartment());
		
		// ----------------------------------------------------------
		// way-2: by JPQL
		// ----------------------------------------------------------
		/*
		 * SQL vs JPQL
		 * 
		 * SQL
		 * 
		 * ==> structure based i.e it works on table & columns ==> partially depends on
		 * DBMS
		 * 
		 * JPQL
		 * 
		 * ==> OO based ==> DBMS independent
		 * 
		 */

		// ------------------------------------------------

		// String qlString="from OlamEmployee oe";
		// Query query=em.createQuery(qlString);

		// Pagination
		// query.setFirstResult(0);
		// query.setMaxResults(2);

		// List<OlamEmployee> employees=query.getResultList();
		// display(employees);

		// ------------------------------------------------

//		String qlString="select oe.empName from OlamEmployee oe";
//		Query query=em.createQuery(qlString);
//		
//		List<String> list=query.getResultList();
//		System.out.println(list);
//		

//		------------------------------------------------

//		String qlString="select oe.empName,oe.gender from OlamEmployee oe";
//		Query query=em.createQuery(qlString);
//		
//		List<Object[]> list=query.getResultList();
//		for(Object[] oa:list) {
//			System.out.println(oa[0]+":"+oa[1]);
//		}
//		

//		------------------------------------------------

//		
//		String qlString="select new list(oe.empName,oe.gender) from OlamEmployee oe";
//		Query query=em.createQuery(qlString);
//		List<List<String>> list=query.getResultList();
//		for(List<String> l:list) {
//			System.out.println(l);
//		}

//		--------------------------------------------------

//		String gender="MALE";

//		String qlString="from OlamEmployee oe where oe.gender='MALE'";
//		String qlString="from OlamEmployee oe where oe.gender='"+gender+"'";
//		String qlString="from OlamEmployee oe where oe.gender=?1";
//		String qlString="from OlamEmployee oe where oe.gender=:gName";
//		Query query=em.createQuery(qlString);
//		query.setParameter("gName", gender);
//		List<OlamEmployee> employees=query.getResultList();
//		display(employees);

//		--------------------------------------------------
		// way-3 : Criteria API ==> good for dynamic queries
//		--------------------------------------------------
//
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<OlamEmployee> q = builder.createQuery(OlamEmployee.class);
//
//		Root<OlamEmployee> c = q.from(OlamEmployee.class);
//		q.select(c);
//
//		TypedQuery<OlamEmployee> query = em.createQuery(q);
//		List<OlamEmployee> employees = query.getResultList();
//		display(employees);
//
//		em.getTransaction().commit();
//		em.close();
//		emf.close();

		// ----------------------------------------------

//		--------------------------------------------------
		// way-4 : Native SQL
//		--------------------------------------------------

//		String sql = "select * from OLAM_EMPLOYEE";
//		Query query = em.createNativeQuery(sql, OlamEmployee.class);
//		List<OlamEmployee> employees = query.getResultList();
//		display(employees);

//		--------------------------------------------------
		// Named Query
//		--------------------------------------------------
//
//		Query query = em.createNamedQuery("OlamEmployee.findAll");
//		List<OlamEmployee> employees = query.getResultList();
//		display(employees);
//		
		
//		--------------------------------------------------
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

	private static void display(List<OlamEmployee> employees) {
		for (OlamEmployee employee : employees) {
			System.out.println(employee);
		}
	}

}
