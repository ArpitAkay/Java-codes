package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection14HashSet {
	public static void main(String[] args) {
		Set<String> Programminglanguages = new HashSet<String>();
		Programminglanguages.add("C");
		Programminglanguages.add("C++");
		Programminglanguages.add("Java");
		Programminglanguages.add("Python");
		Programminglanguages.add(".net");
		Programminglanguages.add("Golang");
		Programminglanguages.add("C++");

		
		System.out.println(Programminglanguages);
		
//		Set<Integer> fiveevennumbers = new HashSet<Integer>();
		List<Integer> fiveevennumbers = new ArrayList<Integer>();
		fiveevennumbers.add(2);
		fiveevennumbers.add(4);
		fiveevennumbers.add(6);
		fiveevennumbers.add(8);
		fiveevennumbers.add(10);
		
		Set<Integer> tenevennumbers = new HashSet<Integer>(fiveevennumbers);
		
//		Set<Integer> nextevennumbers = new HashSet<Integer>();
		List<Integer> nextevennumbers = new ArrayList<Integer>();
		nextevennumbers.add(12);
		nextevennumbers.add(14);
		nextevennumbers.add(16);
		nextevennumbers.add(18);
		nextevennumbers.add(20);
		
		tenevennumbers.addAll(nextevennumbers);
		
		System.out.println(tenevennumbers);
		
		
	}
}
