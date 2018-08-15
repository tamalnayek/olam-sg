package com.examples;

class Mobile {
	String name;
	double price;
}

class Person {
	String name;
	Mobile mobile; // reference var
}

public class References_Ex {

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		mobile.name = "iphone";
		mobile.price = 1000.00;

		Person person = new Person();
		person.name = "Nag";
		person.mobile = mobile;

		person.mobile.price = 2000.00;
	}

}
