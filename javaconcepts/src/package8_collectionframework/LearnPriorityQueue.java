package package8_collectionframework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
	public static void main(String args[]) {
		Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		pq.offer(40);
		pq.offer(12);
		pq.offer(24);
		pq.offer(36);
		
		System.out.println(pq);		//min heap is implemented here and Comparator.reverseOrder() converts into max heap.
		
		pq.poll();
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
	}
}
