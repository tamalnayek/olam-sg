package com.accessors;

public class App {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("Nag");
		e1.setSalary(1000);

		// ------------------------------------------

		// ------------------------------------------
		System.out.println(e1.getBonus());
	}

}
