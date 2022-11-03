package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection13Searchiteratation {
	public static void main(String[] args) {
		LinkedList<String> progLang = new LinkedList<String>();
		progLang.add("C");
		progLang.add("C++");
		progLang.add("Python");
		progLang.add("Java");
		progLang.add(".net");
		progLang.add("Springboot");
		progLang.add("C++");

		
		System.out.println(progLang);
		
		Boolean result = progLang.contains("C");
		System.out.println(result );
		
		//Find the index of the first occurrence of an element in the linkedlist
		int firstindex = progLang.indexOf("C++");
		System.out.println(firstindex);
		
		//Find the index of the last occurrence of an element in the linkedlist
		int lastindex = progLang.lastIndexOf("C++");
		System.out.println(lastindex);
		//forEach advanced loop
		for(String value : progLang) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		Iterator<String> it = progLang.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//forEach loop
		progLang.forEach((element) ->{
			System.out.print(element + " ");
		});

		
	}
}
