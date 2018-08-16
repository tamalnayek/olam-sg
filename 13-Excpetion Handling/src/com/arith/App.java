package com.arith;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		//
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number-1");
		int n1 = scanner.nextInt();

		System.out.println("Enter number-2");
		int n2 = scanner.nextInt();

		// Add
		System.out.println("1-Add");

		// Sub
		System.out.println("2-Sub");

		// Div
		try {
			System.out.println("3-Div");
			int result = n1 / n2;
		} catch (ArithmeticException e) {
			// handling code...
			/*
			 * 
			 *  - report to end user with friendly message
			 *  - log the exception in log-file for future fix
			 *  - release any used resources
			 *  - re-throw the exception other module... 
			 * 
			 */
			System.out.println("Ex- "+e.getMessage());
		}

		// Mul
		System.out.println("4-Mul");

		System.out.println("Good appln");

		scanner.close();

	}

}
