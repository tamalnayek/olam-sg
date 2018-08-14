package com.drive;

import com.drive.car.Car;
import com.drive.wheel.CEATWheel;
import com.drive.wheel.MRFWheel;

public class TestDrive {

	public static void main(String[] args) {

		// init
		Car car = new Car();
		car.setWheel(new MRFWheel());

		// use
		car.move();
		car.move();

		car.setWheel(new CEATWheel());

		car.move();
		car.move();

		// destroy
		// ..

	}

}
