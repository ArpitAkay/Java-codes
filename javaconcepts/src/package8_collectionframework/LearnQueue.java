package package8_collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(0);
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.peek());		//Gives next element which will be removed from queue.
	
		System.out.println(queue);
	}
}
