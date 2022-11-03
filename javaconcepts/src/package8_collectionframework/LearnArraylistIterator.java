package package8_collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArraylistIterator {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print("iterator : " + it.next() + " ");
		}
		System.out.println();
	}
}
