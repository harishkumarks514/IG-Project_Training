package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Collection {

	public static void main(String[] args) {
//		A linkedHashSet is very similar to a HashSet. The difference is that uses a double linked list 
//		to store the data and returns the ordering of the elements.
		
		
//		creating LinkedHashSet and adding elements
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Geeks");
		lhs.add("For");
		lhs.add("Geeks");
		lhs.add("Is");
		lhs.add("Very helpfull");
		
//		Traversing elements
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
