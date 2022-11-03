//Map is used to store key value pair.
package package8_collectionframework;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
	public static void main(String args[]) {
		Map<String, Integer> numbers = new HashMap<String, Integer>();
		
		numbers.put("One", 1);	
		numbers.put("Two", 2);
		numbers.put("Three", 3);	
		numbers.put("Four", 4);	
		numbers.put("Five", 5);	
//		numbers.put("One", 45);		//Will override.
		
		if(!numbers.containsKey("Two")) {
			numbers.put("One", 45);
		}
		
		//or
		
		numbers.putIfAbsent("One", 45);
		
		System.out.println(numbers.containsValue(3));
		
		System.out.println(numbers.containsKey("One"));
		
		System.out.println(numbers);
		
		numbers.remove("Three");
		
		System.out.println(numbers);
		
		System.out.println();
		
		for(Map.Entry<String, Integer> e : numbers.entrySet() ) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println(); 
		}
		
		for(String key : numbers.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value : numbers.values()) {
			System.out.println(value);
		}
		
		
		System.out.println(numbers.isEmpty());
		numbers.clear();
		System.out.println(numbers);
		
	}
}
