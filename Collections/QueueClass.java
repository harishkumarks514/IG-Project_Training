package Collection;

import java.util.PriorityQueue;

public class QueueClass {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(30);
		pQueue.add(40);
		
//		printing the top element of the PriorityQueue
		System.out.println(pQueue.peek());
		
//		printing the top element and removing it from the priorityQueue container
		System.out.println(pQueue.poll());
		
//		printing the top element again
		System.out.println(pQueue.peek());
		
		System.out.println(pQueue);
	}
}
