package com.java.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection8Differentwaystoiterateoverlist {
	public static void main(String args[]) {
		List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");
		
		for(int i=0; i<courses.size(); i++) {
			System.out.print(courses.get(i) + " ");
		}
		System.out.println();
		
		for(String value : courses) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String)iterator.next();
			System.out.print(course + " ");
		}
		System.out.println();
		
		
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//Java 8 stream + lambda expression
		courses.stream().forEach(course -> System.out.print(course + " "));
		System.out.println();
		
		//Java 8 forEach + lambda expression
		courses.forEach((course) -> System.out.print(course + " "));
		
	}
}
