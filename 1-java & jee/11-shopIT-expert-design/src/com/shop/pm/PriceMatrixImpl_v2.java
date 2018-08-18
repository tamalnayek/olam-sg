package com.shop.pm;

public class PriceMatrixImpl_v2 implements PriceMatrix {

	public double getPrice(String item) {
		// .........
		return 200.00;
	}

	@Override
	public double getDiscount(String item) {
		return 10;
	}
}
