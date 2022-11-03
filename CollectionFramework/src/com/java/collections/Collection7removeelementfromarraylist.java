package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection7removeelementfromarraylist {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Pineapple");
		fruits.add("Grapes");
		fruits.add("Apple");
		
		System.out.println(fruits);
		
		fruits.remove(4);
		System.out.println(fruits);
		
		List<String> subfruits = new ArrayList<String>();
		subfruits.add("Mango");
		subfruits.add("Banana");
		
		fruits.removeAll(subfruits);
		System.out.println(fruits);
		
		
		
		fruits.clear();
		System.out.println(fruits);


	}
}
