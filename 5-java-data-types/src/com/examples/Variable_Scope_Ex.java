package com.examples;

class Employee {

	static int count = 0; // class variable

	String name;
	// int count = 0; // instance variable

	public void sayHelo() {
//		int count = 0; // local variable
		count++;
		System.out.println(name + "=> hello : " + count);
	}
}

public class Variable_Scope_Ex {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "E1";

		Employee e2 = new Employee();
		e2.name = "E2";

		e1.sayHelo();
		e1.sayHelo();
		e2.sayHelo();

	}

}
