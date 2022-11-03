package com.java.collections;

import java.util.LinkedList;

public class Collection11Retreiveelementsfromlinkedlist {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		
		//Getting the first element in the linkedlist using getFirst()
		String firstelement = fruits.getFirst();
		System.out.println(firstelement);
		
		//Getting the last element in the linkedlist using getLast()
		String lastelement = fruits.getLast();
		System.out.println(lastelement);
		
		//Getting the element at a given position in the linkedlist
		String element = fruits.get(1);
		System.out.println(element);
		
		for(String value : fruits) {
			System.out.print(value + " ");
		}

		
	}
}
