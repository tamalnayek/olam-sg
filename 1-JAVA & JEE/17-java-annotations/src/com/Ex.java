package com;

import java.util.ArrayList;

class Super {
	public void abc() {
		System.out.println("super-abc()");
	}
}

class Sub extends Super {

	@Override
	public void abc() {
		System.out.println("sub-abc()");
	}

}

class Lib {

	@Deprecated
	public void v1() {
		System.out.println("v1()");
	}

	public void v2() {
		System.out.println("v2()");
	}
}

class Box<E> {

}

public class Ex {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Sub sub = new Sub();
		sub.abc();

		Lib lib = new Lib();
		lib.v1();

		ArrayList arrayList = new ArrayList();
		arrayList.add("str");
		arrayList.add(123);

		ArrayList<String> arrayList2 = new ArrayList<>();

	}

}
