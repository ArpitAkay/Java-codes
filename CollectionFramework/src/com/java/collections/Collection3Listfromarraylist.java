package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection3Listfromarraylist {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		
		//List allows you to add duplicate elements
		list.add("Element1");
		list.add("Element1");
		list.add("Element2");
		list.add("Element2");
		
		System.out.println(list);
		
		//List allows you to have null element
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		//Access element from list
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	
	}
}
