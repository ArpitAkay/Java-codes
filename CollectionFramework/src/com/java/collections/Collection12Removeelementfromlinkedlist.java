package com.java.collections;

import java.util.LinkedList;

public class Collection12Removeelementfromlinkedlist {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		
		System.out.println(fruits);
		
		//Remove first element from linkedlist
		String removefirstelement = fruits.removeFirst();
		System.out.println(removefirstelement);
		System.out.println(fruits);
		
		//Remove last element from linkedlist
		String removelastelement = fruits.removeLast();
		System.out.println(removelastelement);
		System.out.println(fruits);
		
		fruits.remove("Apple");
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
	}
}
