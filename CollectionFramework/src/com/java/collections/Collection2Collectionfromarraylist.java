package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2Collectionfromarraylist {
	public static void main(String args[]) {
		Collection<String> fruitcollection = new ArrayList<String>();
		
		fruitcollection.add("Mango");
		fruitcollection.add("Apple");
		fruitcollection.add("Banana");
		fruitcollection.add("Orange");
		
		System.out.println(fruitcollection);
		
		fruitcollection.remove("Banana");
		
		System.out.println(fruitcollection);
		
		System.out.println(fruitcollection.contains("Mango"));
		
		for(String value : fruitcollection) {
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		fruitcollection.clear();
		
		System.out.println(fruitcollection);
	}
}
