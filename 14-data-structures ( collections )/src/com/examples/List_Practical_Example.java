package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.examples.model.Product;

public class List_Practical_Example {

	public static void main(String[] args) {

		Product product1 = new Product(234231, "item-1", 100.00);
		Product product2 = new Product(134230, "item-2", 300.00);
		Product product3 = new Product(234238, "item-2", 200.00);
		Product product4 = new Product(534234, "item-4", 400.00);
		Product product5 = new Product(234239, "item-5", 500.00);

		// --------------------------------------------------------------

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);

		// --------------------------------------------------------------

		// way-1
//		display1(products);
//		System.out.println();
//		// way-2
//		display2(products);
//		System.out.println();
//		// way-3
//		display3(products);

		// --------------------------------------------------------------

		// How to sort list collections ?

		Collections.sort(products);
		display1(products);

		// ----------------------------------------------------------------

		System.out.println();

		// way-1 : Local inner class
//		class PriceComparator implements Comparator<Product> {
//			@Override
//			public int compare(Product o1, Product o2) {
//				if (o1.getPrice() == o2.getPrice())
//					return 0;
//				else if (o1.getPrice() > o2.getPrice())
//					return 1;
//				else
//					return -1;
//			}
//		}

		// way-2 : Anonymous inner class
//		Comparator<Product> priceComaparator = new Comparator<Product>() {
//			@Override
//			public int compare(Product o1, Product o2) {
//				if (o1.getPrice() == o2.getPrice())
//					return 0;
//				else if (o1.getPrice() > o2.getPrice())
//					return 1;
//				else
//					return -1;
//			}
//		};

		// way-3 : Function

//		Comparator<Product> priceComaparator = (o1, o2) -> {
//			if (o1.getPrice() == o2.getPrice())
//				return 0;
//			else if (o1.getPrice() > o2.getPrice())
//				return 1;
//			else
//				return -1;
//		};

		
		Comparator<Product> nameComparator=Comparator.comparing(Product::getName);
		Comparator<Product> priceComparator=Comparator.comparingDouble(Product::getPrice);
		Comparator<Product> nameAndThenPrice=nameComparator.thenComparing(priceComparator);
		
		Collections.sort(products, nameAndThenPrice);
		display1(products);

	}

	private static void display1(List<Product> products) {
		for (int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			System.out.println(product);
		}
	}

	private static void display2(List<Product> products) {
		Iterator<Product> iterator = products.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void display3(List<Product> products) {
		// for-each loop ( JDK 1.5 )
		for (Product i : products) {
			System.out.println(i);
		}
	}

}
