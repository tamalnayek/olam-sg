package com.shop.pm;

public interface PriceMatrix {
	double getPrice(String item);
	double getDiscount(String item);
}
