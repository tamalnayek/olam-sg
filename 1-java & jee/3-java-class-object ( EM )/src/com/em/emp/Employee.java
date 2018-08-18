// package dec
package com.em.emp;

// import statement(s)

// public type
public class Employee {

	// 1. variables
	// a.class/static variable
	public final static String COMP_NAME = "olam";
	public static String tnrName;

	// b.object/instance variable
	public int id; // 0
	public String name; // null
	public double salary; // 0.0

	// 2.constructor

	// 3. behav
	// a.class/static behav
	public static void doTeach() {
		System.out.println(tnrName + " - doTeach()");
	}

	// b.obj behav
	public void doListenAndWork() {
		System.out.println(name + " - listening");
	}
	// 4.inner-types

}

//default type(s)
class Abc {

}
