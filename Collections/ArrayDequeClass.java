package Collection;

import java.util.ArrayDeque;

public class ArrayDequeClass {

	public static void main(String[] args) {
//		ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array. This is a 
//		special kind of array that grows and allows users to add or remove an element from both side of the queue. Array dequeues have no capacity restrictions 
//		and they grow as necessary to support usage. 
		
//		Initializing an deque
		ArrayDeque<Integer> arrDeq = new ArrayDeque<Integer>();
		
//		add() method to insert
		arrDeq.add(10);
		arrDeq.add(20);
		arrDeq.add(30);
		arrDeq.add(40);
		arrDeq.add(50);
		
		System.out.println(arrDeq);
//		
//		clear() method
		arrDeq.clear();
		
//		addFirst() method to insert the elements at the head
		
		arrDeq.addFirst(567);
		arrDeq.addFirst(234);
		
//		addLast() method to insert the element at the tail
		
		arrDeq.addLast(24);
		arrDeq.addLast(14);
		
		System.out.println(arrDeq);
		
	}
}
