package package7_arraylist;

import java.util.ArrayList;		//or import java.util.*;
import java.util.Collections;

public class Arraylist {
	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		ArrayList<String> list2 = new ArrayList<String>();
//		ArrayList<Boolean> list3 = new ArrayList<Boolean>();
		
		//add element
		list1.add(0);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		
		
		//get element
		int element;
		element = list1.get(0);
		System.out.println(element);
		
		//add element in between
		list1.add(1,1);
		System.out.println(list1);
		
		//set element
		list1.set(0,5);
		System.out.println(list1);
		
		//delete element
		list1.remove(0);
		System.out.println(list1);
		
		
		//size of array list
		int size;
		size = list1.size();
		System.out.println(size);
		
		//loops on ArrayList
		for(int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		
		//sorting on ArrayList
		Collections.sort(list1);
		System.out.println(list1);
	}

}
