package com.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Owner {

	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return 12345;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

}

class Car {

	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		Car car = (Car) obj;
		return this.model.equals(car.model);
	}

	@Override
	public int hashCode() {
		return 12345;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

}

public class Ex {

	public static void main(String[] args) {

		Car car1 = new Car("bmw", "black");
		Car car2 = new Car("toy", "red");

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Ria");

		Map<Owner, Car> map = new HashMap<>();
		map.put(owner1, car1);
		map.put(owner2, car2);

		// -----------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter owner name");
		String name = sc.nextLine();

		Owner key = new Owner(name);
		Car car = map.get(key);

		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("dream it");
		}
		sc.close();

		// -----------------------------------------

//		System.out.println(car1.hashCode());
//		System.out.println(car2.hashCode());
//
//		System.out.println(car1.equals(car2));
//
//		Set<Car> cars = new HashSet<>();
//		cars.add(car1);
//		cars.add(car2);
//
//		System.out.println(cars.size());

	}

}
