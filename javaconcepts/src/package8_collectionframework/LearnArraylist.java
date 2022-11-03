package package8_collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LearnArraylist {
	public static void main(String args[]) {
		ArrayList<String> students = new ArrayList<String>();		//ArrayList uses array internally 
		students.add("Arpit Kumar");		//Adds element in ArrayList.
		System.out.println(students);		
		
//		size = n;
//		formula  n + n/2 + 1
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		list.add(4);
		System.out.println(list);
		
		list.add(1, 50);		//Adds element at particular index.
		System.out.println(list);
		
		ArrayList<Integer> newlist = new ArrayList<Integer>();
		newlist.add(150);
		newlist.add(200);
		
		list.addAll(newlist);		//Adds a list to other list.
		System.out.println(list);
		
		
		System.out.println(list.get(1));		//Gives element at particular index.
		
		
		list.remove(1);		//Remove element at particular index.
		System.out.println(list);
		
		list.remove(Integer.valueOf(150));		//Remove element from ArrayList.
		System.out.println(list);
		
		list.set(5, 150);		//Update element at particular index.
		System.out.println(list);
		
		System.out.println(list.contains(150));
		
		
		
		for(int i=0; i< list.size(); i++) {
			list.set(i, list.get(i)*2);
		}
		System.out.println(list);
		
		for(Integer element : list) {		//for Each loop.
			System.out.print(element*2 + " ");
		}
		System.out.println();
		
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print("iterator : " + it.next() + " ");
		}
		System.out.println();
		
		
		
		Collections.sort(list);
		System.out.println(list);
		
		list.clear();		//Clears the ArrayList.
		System.out.println(list);
	}
}
