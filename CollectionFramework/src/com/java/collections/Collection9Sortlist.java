package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection9Sortlist {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(60);
		list.add(40);
		list.add(20);
		list.add(80);
		
		System.out.println(list);
		
//		int temp;
//		for(int i=0; i<list.size()-1; i++) {
//			for(int j=i+1; j<list.size(); j++) {
//				if(list.get(i)>list.get(j)) {
//					temp = list.get(i);
//					list.set(i, list.get(j));
//					list.set(j, temp);
//				}
//			}
//		}
//		
//		System.out.println(list);
		
		Collections.sort(list);		//Ascending order
		System.out.println(list);
		
		Collections.reverse(list);		//Descending order
		System.out.println(list);
	}
}
