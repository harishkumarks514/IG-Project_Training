package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue1 {
	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
//		created the priorityqueue
		queue.add("Amith");
		queue.add("ARJUN");
		queue.add("Rahul");
		queue.add("Akash");
		System.out.println("head:" +queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		System.out.println();
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext())
		{
		System.out.println(itr2.next());	
		}
	}
}