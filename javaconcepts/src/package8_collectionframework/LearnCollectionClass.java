package package8_collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		
		
		System.out.println("Minimum element : " + Collections.min(list));
		System.out.println("Minimum element : " + Collections.max(list));
		System.out.println("Frequency of element : " + Collections.frequency(list, 5));
		
		Collections.sort(list);								//Ascending order.
		Collections.sort(list, Comparator.reverseOrder());	//Descending order.
		System.out.println(list);
	}
}
