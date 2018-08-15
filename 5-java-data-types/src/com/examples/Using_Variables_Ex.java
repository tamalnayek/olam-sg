package com.examples;

class Xyz {
	static int classVar;
	int insVar;

	static void classMethod() {
		System.out.println(classVar);
//		System.out.println(insVar); // cant access instance data in class-behav
	}

	void insMethod() {
		System.out.println(classVar);
		System.out.println(insVar);
	}
}

public class Using_Variables_Ex {

	public static void main(String[] args) {

		Xyz.classVar = 100;

		Xyz.classMethod();
		System.out.println();

		Xyz ins1 = new Xyz();
		ins1.insVar = 10;

		Xyz ins2 = new Xyz();
		ins2.insVar = 20;

		ins1.insMethod();
		System.out.println();
		ins2.insMethod();

	}

}
