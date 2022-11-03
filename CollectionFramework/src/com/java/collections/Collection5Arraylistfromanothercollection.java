package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection5Arraylistfromanothercollection {
	public static void main(String[] args) {
		List<Integer> first5primenumbers = new ArrayList<Integer>();
		first5primenumbers.add(2);
		first5primenumbers.add(3);
		first5primenumbers.add(5);
		first5primenumbers.add(7);
		first5primenumbers.add(11);
		
		System.out.println(first5primenumbers);
		
		List<Integer> first10primenumbers = new ArrayList<Integer>(first5primenumbers);
		System.out.println(first10primenumbers);
		
		
		List<Integer> Next5primenumbers = new ArrayList<Integer>();
		Next5primenumbers.add(13);
		Next5primenumbers.add(17);
		Next5primenumbers.add(19);
		Next5primenumbers.add(23);
		Next5primenumbers.add(29);
		
		first10primenumbers.addAll(Next5primenumbers);
		
		System.out.println(first10primenumbers);
		
		
		
	}
}
