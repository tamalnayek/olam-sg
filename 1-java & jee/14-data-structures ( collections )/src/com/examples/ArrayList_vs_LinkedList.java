package com.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {

	public static void main(String[] args) {

		compareList(new ArrayList<>());
		compareList(new LinkedList<>());

	}

	private static void compareList(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add("olam - " + 1);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
