package com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection17HashMap {
	public static void main(String[] args) {
		Map<String, Integer> numberMapping = new HashMap<String, Integer>();
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		numberMapping.put("Five", 5);
		numberMapping.put(null, 6);
		
		System.out.println(numberMapping);
		
		//Check if a HashMap is empty
		Boolean result = numberMapping.isEmpty();
		System.out.println(result);
		
		//Find the size of a HashMap
		int resultsize = numberMapping.size();
		System.out.println(resultsize);
		
		//Check if a key exists in the HashMap
		Boolean resultkey  = numberMapping.containsKey("One");
		System.out.println(resultkey);
		Boolean resultvalue = numberMapping.containsValue(1);
		System.out.println(resultvalue);
		
		//Get value by key
		int value = numberMapping.get("One");
		System.out.println(value);
		
		//Remove keys from HashMap
		numberMapping.remove("One");
		System.out.println(numberMapping);
		
		//Get only keys from HashMap
		Set<String> keys = numberMapping.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = numberMapping.values();
		System.out.println(values);
		
		
		//Different ways iterate over HashMap
		for(Map.Entry<String, Integer>  entry : numberMapping.entrySet()) {
			System.out.print("Key : " + entry.getKey() + " Value : " + entry.getValue() + " ");
			System.out.println();
		}
		
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.print("Key : " + entry.getKey() + "Value : " + entry.getValue() + " ");
			System.out.println();
		}
		
		
		numberMapping.forEach((K, V)-> {
			System.out.println("Key : " + K + " ");
			System.out.print("Value : " + V);
			System.out.println();
		});
		
	}
}
