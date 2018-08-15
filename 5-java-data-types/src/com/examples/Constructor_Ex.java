package com.examples;

/*
 * 
 *  default-values
 *  
 *  integral  ==> 0
 *  real      ==> 0.0
 *  char      ==> \u0000
 *  boolean   ==> false
 *  reference ==> null
 * 
 */

class NewEmployee {

	int id;
	String name;
	double salary;

//	public NewEmployee(int id) {
//		if (id > 0)
//			this.id = id;
//	}
//
//	public NewEmployee(int id, String name) {
//		if (id > 0)
//			this.id = id;
//		if (name != null)
//			this.name = name;
//	}
//
//	public NewEmployee(int id, String name, double salary) {
//		if (id > 0)
//			this.id = id;
//		if (name != null)
//			this.name = name;
//		if (salary > 1000.00)
//			this.salary = salary;
//	}

	// or

	public NewEmployee(int id) {
		this(id, "Nil", 100.00);
	}

	public NewEmployee(int id, String name) {
		this(id, name, 100.00);
	}

	public NewEmployee(int id, String name, double salary) {
		if (id > 0)
			this.id = id;
		if (name != null)
			this.name = name;
		if (salary > 1000.00)
			this.salary = salary;
	}

}

public class Constructor_Ex {

	public static void main(String[] args) {
//
//		NewEmployee e1 = new NewEmployee();
//		
//		System.out.println(e1.id);
//		System.out.println(e1.name);
//		System.out.println(e1.salary);
//
//		e1.id = 101;
//		e1.name = "Nag";
//		e1.salary = 100.00;
//		
//		System.out.println();
//		System.out.println(e1.id);
//		System.out.println(e1.name);
//		System.out.println(e1.salary);

		// constructor with params

		NewEmployee e1 = new NewEmployee(101);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);

		System.out.println();
		NewEmployee e2 = new NewEmployee(102, "Abc");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);

		NewEmployee newEmployee = new NewEmployee(104, "Xyz", 3000.00);

	}

}
