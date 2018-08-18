package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("nveg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		list.add("veg");

		// what + how ==> imperative style
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String item = (String) iterator.next();
//			if (item.equals("nveg"))
//				iterator.remove();
//		}
//		System.out.println(list);

		// what   ==> functional style
		list.removeIf(item -> item.equals("nveg"));
		System.out.println(list);

	}

}
