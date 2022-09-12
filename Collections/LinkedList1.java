package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ram");
		al.add("Rahul");
		al.add("Rajath");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}