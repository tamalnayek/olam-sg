package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init
		BillingImpl billing = new BillingImpl();

		// use
		String[] cart1 = { "123123", "234234", "3445234" };
		double totalPrice = billing.getTotalPrice(cart1);
		System.out.println(totalPrice);

		// destroy

	}

}
