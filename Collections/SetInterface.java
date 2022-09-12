//		Java program to demonstrate the 
//		working of a HashSet
package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	public static void main(String[] args) {
//		Creating HashSet and adding elements
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Geeks");
		hs.add("For");
		hs.add("Geek");
		hs.add("is");
		hs.add("Very Helpfull");
		
//		Traversing elements
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
}
