package com.java.collections;

class student {
	public int value;
}

class book {
	
}


public class Collection1Arrayofaclass {
	public static void main(String args[]) {
		student[] students = new student[10];
		for(int i=0; i<students.length; i++) {
			students[i] = new student();
		}
		for(int i=0; i<students.length; i++) {
			students[i].value = i+1;
		}
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].value);
		}
		
		
		Object[] objects = new Object[10];
		objects[0] = new student();
		objects[1] = new student();
		objects[2] = new book();
		
		
		for(int i=0; i<objects.length; i++) {
			System.out.println(objects[i]);
		}
		
		
		
	}
}
