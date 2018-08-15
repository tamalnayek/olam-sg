package com;

class A {
	int id;

	public A(int arg) {
		super();
		System.out.println("im A");
		this.id = id;
	}
}

class B extends A {
	public B(int arg) {
		super(arg);
		System.out.println("im B");
	}
}

class C extends B {
	public C(int arg) {
		super(arg);
		System.out.println("im C");
	}
}

public class Constructor_Exe_Flow {

	public static void main(String[] args) {

		C c = new C(101);
	}

}
