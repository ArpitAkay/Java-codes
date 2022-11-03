package com.java.collections;

import java.util.LinkedList;
public class Collection10Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pineapple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println(fruits);
		
		fruits.add(2, "Watermelon");
		System.out.println(fruits);
		
//		Adding an element at the beginning of the linkedlist
		fruits.addFirst("Lichi");
		System.out.println(fruits);
		
//		Adding an element at the ending of the linkedlist
		fruits.addLast("Strawberry");
		System.out.println(fruits);
		
	}
}
