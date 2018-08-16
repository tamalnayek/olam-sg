package com.examples;

import java.util.Map;
import java.util.TreeMap;

public class Map_Colln_Ex {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>();
		map.put("23123", "cocoa1");
		map.put("d3322", "cocoa2");
		map.put("32344", "cocoa3");
		map.put("23234", "cocoa4");
		map.put("53455", "cocoa5");
		map.put("45645", "cocoa6");
		
		
		System.out.println(map.get("23234"));

	}

}
