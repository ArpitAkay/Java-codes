//You can insert and remove element from both side of queue.
package package8_collectionframework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
	public static void main(String args[]) {
		ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
		adq.offer(3);
		adq.offer(4);
		System.out.println(adq);
		
		adq.offerFirst(2);
		adq.offerFirst(1);
		adq.offerFirst(0);
		
		System.out.println(adq);
		
		adq.offerLast(5);
		
		System.out.println(adq);
		
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		
		adq.poll();
		System.out.println(adq);
		adq.pollFirst();
		System.out.println(adq);
		adq.pollLast();
		System.out.println(adq);
		
	}
}
