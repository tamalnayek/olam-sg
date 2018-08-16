package com.examples;

import java.util.ArrayList;
import java.util.List;

public class List_Colln_Ex {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<>();
//		list.add("veg-1");
//		list.add("veg-2");
//		list.add(0, "veg-0");
//		list.remove(2);
//		list.set(1, "VEG");
//		
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		System.out.println(list.contains("VEG"));
//
//		list.clear();

		// -----------------------------------------

		List<String> sheet1 = new ArrayList<>();
		sheet1.add("A");
		sheet1.add("E");
		sheet1.add("D");
		sheet1.add("C");

		List<String> sheet2 = new ArrayList<>();
		sheet2.add("A");
		sheet2.add("E");
		sheet2.add("F");
		sheet2.add("G");

		sheet1.retainAll(sheet2);

		System.out.println(sheet1);

	}

}
