package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
	public static void main(String[] args) {
		Map<Integer ,StudentH> studentMap = new HashMap<Integer ,StudentH>();
		studentMap.put(1, new StudentH("Arpit" ,"Kumar"));
		studentMap.put(2, new StudentH("Ayush" ,"Agarwal"));
		
		System.out.println(studentMap);
	}
}
