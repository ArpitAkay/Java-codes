package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection6Accesselementsfromarraylist {
	public static void main(String args[]) {
		
		//Checks if an ArrayList is empty
		List<String> topProgrammingLanguages = new ArrayList<String>();
		System.out.println("Is the topProgrammingLanguages list empty? : " + topProgrammingLanguages.isEmpty());
		
		topProgrammingLanguages.add("C");
		topProgrammingLanguages.add("C++");
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add(".net");
		
		//Find the size of ArrayList
		System.out.println("Here are the top " + topProgrammingLanguages.size() + " Programming Languages in the world.");
		
		//Retrieve the elements at a given index
		String bestProgrammingLang = topProgrammingLanguages.get(2);
		System.out.println("Best Programming Language is " + bestProgrammingLang);
		
		String secondBestProgrammingLang = topProgrammingLanguages.get(3);
		System.out.println("Second Best Programming Language is " + secondBestProgrammingLang);
		
		//Modify the element at a given index
		topProgrammingLanguages.set(4, "C#");
		
		System.out.println(topProgrammingLanguages);
	}
}
