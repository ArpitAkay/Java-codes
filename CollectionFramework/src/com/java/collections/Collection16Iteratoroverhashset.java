package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection16Iteratoroverhashset {
	public static void main(String[] args) {
		Set<String> courses = new HashSet<String>();
		courses.add("C");
		courses.add("C++");
		courses.add("Java");
		courses.add("Python");
		courses.add("Scala");
		
		System.out.println(courses);
		
		
		for(String value : courses) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string + " ");
		}
		System.out.println();
		
		
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		courses.forEach(course -> System.out.print(course + " "));
		
		courses.stream().filter(course -> !"Java".equals(course))
		.forEach(course -> System.out.print(course + " "));
		
	}
}
