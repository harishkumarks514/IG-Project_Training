package Collection;

import java.util.LinkedList;

public class CollectionDemoLinkedList {

	public static void main(String[] args) {

//		Declaring the linkedList
		LinkedList<Integer> ll = new LinkedList<Integer>();
//		Appending new elements at the end of the list
		for(int i= 1 ; i<=5;i++)
			ll.add(i);
//		printing the elements.
		System.out.println(ll);
//		Remove elements at index 3
		ll.remove(3);
		
//		Displaying the List after deletion
		System.out.println(ll);
		
//		Printing the elements one by one
		for(int i=0;i<ll.size();i++)
			System.out.print(ll.get(i) + " ");
	}
}
