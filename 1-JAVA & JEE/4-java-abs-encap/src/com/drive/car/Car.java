package com.drive.car;

import com.drive.wheel.Wheel;

/*
 *  design issue
 *  ----------------
 * 
 *   ==> tight-coupling b/w dependent & dependency
 * 
 */

public class Car {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();
		System.out.println("car moving...");
	}

}
