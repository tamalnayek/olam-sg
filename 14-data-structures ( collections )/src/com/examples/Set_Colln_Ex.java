package com.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Colln_Ex {

	public static void main(String[] args) {
		
//		Set<String> set=new TreeSet<>();
//		Set<String> set=new HashSet<>();
		Set<String> set=new LinkedHashSet<>();
		set.add("A");
		set.add("D");
		set.add("B");
		set.add("C");
		set.add("Z");
		set.add("P");
		set.add("A");
		
		System.out.println(set);
		
	}
}
