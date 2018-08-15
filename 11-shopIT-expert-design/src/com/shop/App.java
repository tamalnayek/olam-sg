package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		
		// third-party  / component-manager / container

		// ---------------------------------------------------

		// init
		PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();
		Billing billing = new BillingImpl(priceMatrixV1); // DI

		// use
		String[] cart1 = { "123123", "234234", "3445234" };
		double totalPrice = billing.getTotalPrice(cart1);
		System.out.println(totalPrice);

		// destroy

//		---------------------------------------------------
	}

}
