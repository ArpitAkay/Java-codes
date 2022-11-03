package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class Collection15HashSetRemoveelement {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(numbers);
		
		Boolean result = numbers.remove(1);
		System.out.println(result);
		
		System.out.println(numbers);
		
		Set<Integer> evenNumbers = new HashSet<Integer>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(8);
		
		numbers.removeAll(evenNumbers);
		System.out.println(numbers);
		
		
		numbers.clear();
		System.out.println(numbers);
		
		
	}
}
