package com;

/*
 *  
 *  1. primitive
 *  	- implicit
 *      - explicit
 *      
 *  2. reference
 *  	- implicit
 *      - explicit
 * 
 * 
 */

class Vehicle {
}

class Car extends Vehicle {
}

class Bike extends Vehicle {
}

public class Casting_Ex {

	public static void main(String[] args) {

		// -------------------------------------------------------
		// what we need casting ?

		int a = 6;
		int b = 4;
		float c = (float) a / b;
		System.out.println(c);

		// -------------------------------------------------------

		byte byteVar = 12;
		int intVar = byteVar; // implicit casting ( JRE will do internally )

		byteVar = (byte) intVar; // explicit casting

		/*
		 * 
		 * byte->short->int->long->float->double
		 * 
		 * char -> int -> long
		 * 
		 */

		// Quiz

		int i = 456;
		byte by = (byte) i;
		System.out.println(by);

		// -----------------------------------------------------------------

		Car car = new Car();
		Bike bike = new Bike();

		// show-room perspective

		Vehicle vehicle = car; /// implicit....
		//vehicle = bike;

		if (vehicle instanceof Car) {
			// owner perspective
			car = (Car) vehicle;

			System.out.println("Happy casting..");
		} else {
			System.out.println("we cannot cast..");
		}

	}

}
