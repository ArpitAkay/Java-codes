package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection4Arraylist {
	public static void main(String args[]) {
		List<String> fruit = new ArrayList<String>();
		fruit.add("Mango");
		fruit.add("Orange");
		fruit.add("Banana");
		fruit.add("Grapes");
		
		
//		for(int i=0; i<fruit.size(); i++) {
//			System.out.println(fruit.get(i));
//		}
		System.out.println(fruit);
	}
}
