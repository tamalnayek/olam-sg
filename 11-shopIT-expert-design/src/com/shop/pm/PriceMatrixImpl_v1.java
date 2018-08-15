package com.shop.pm;

public class PriceMatrixImpl_v1 implements PriceMatrix {

	public double getPrice(String item) {
		// .........
		return 100.00;
	}

	@Override
	public double getDiscount(String item) {
		return 10;
	}

}
