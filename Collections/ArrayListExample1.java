package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("HARISH");
		al.add("RAVI");
		al.add("BANANA");
		al.add("Mango");
//		print the list
		System.out.println(al);

//		Traversing list through Iterator
		Iterator itr = al.iterator(); // Getting the Iterator

//		check if iterator has the elements
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

//		Iterating ArrayList using For-each loop
		for (String obj : al) {
			System.out.println(obj);
		}

//		Get and Set ArrayList
//		The get() method returns the element at the specified index, whereas the set() method changes the element.

		System.out.println("Returning the Elements " + al.get(1));
//		Changing the element
		al.set(1, "Sharath");  
		System.out.println("Returning the Elements " + al.get(1));

//		Sorting the ArrayList
		Collections.sort(al);
//		Traversing list through the for-each loop
		for (String names : al)
			System.out.println(names);
	}
}
