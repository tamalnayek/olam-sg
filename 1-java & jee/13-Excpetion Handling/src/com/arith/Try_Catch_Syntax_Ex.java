package com.arith;

class Employee {
	public void doWork() {
		// ..
	}
}

public class Try_Catch_Syntax_Ex {

	public static void main(String[] args) {

		try {
			System.out.println("A");
			int ari = 1 / 1; // ArithmeticException
			int[] arr = { 10, 20 };
			System.out.println(arr[1]); // AarrayIndex
			System.out.println("Ex..");
			Employee employee = null;
			employee.doWork();
			System.out.println("B");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("C");
			System.out.println("Ex-" + ae.getMessage());
		} catch (Exception e) {
			System.out.println("Ex-" + e.getMessage());
		}

		System.out.println("D");

	}

}
