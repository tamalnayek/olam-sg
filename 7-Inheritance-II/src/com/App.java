package com;

import com.god.God;
import com.live.Animal;
import com.live.Human;
import com.live.Robot;

public class App {

	public static void main(String[] args) {

		// init
		God god = new God();

		// use
		Human human = new Human();
		Animal animal = new Animal();
		Robot robot = new Robot();

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
//		god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robot);

		// destory

	}

}
