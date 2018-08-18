package com.examples;

public class Primitives_Ex {

	public static void main(String[] args) {

		byte byteVar = 12;
		short shortVar = 1212;
		int intVar = 121212;
		long longVar = 1212121212121212L;

		double doubleVar = 12.12;
		float floatVar = 12.12F;

		char charVar1 = 'A';
		char charVar2 = 65;
		char charVar3 = '\u8377';

		System.out.println(charVar3);

		boolean b = true;

		// ------------------------------------

//		int v=12;
//		int v=012; // 1*8^1 + 2*8^0 ==> 10
//		int v=0x12; // 1*16^1 + 2*16^0 ==> 18
//		int v=0b1100; // 
//		System.out.println(v);

		// ---------------------------------------

		long longNum = 10_00_00_000;
		System.out.println(longNum);

	}

}
