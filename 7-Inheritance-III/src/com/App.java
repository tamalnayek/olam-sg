package com;

import com.god.God;
import com.live.Animal;
import com.live.Female;
import com.live.Human;
import com.live.LivingThing;
import com.live.Male;
import com.live.Robot;

public class App {

	public static void main(String[] args) {

		// init
		God god = new God();

		// use
		Human human = new Male();
		Animal animal = new Animal();
		Robot robot = new Robot();
		LivingThing livingThing = new Female();

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
//		god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robot);
		System.out.println();
		god.manageLT(livingThing);

		// destory

	}

}
