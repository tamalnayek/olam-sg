package com.live;

public abstract class LivingThing {

	// common state

	// common behav
	public void eat() {
		System.out.println("LT eat()");
	}

	public final void sleep() {
		System.out.println("LT sleep()");
	}

	public abstract void work();
}
