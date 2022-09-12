package Collection;

import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		
//		Declaring the vector
		Vector<Integer> v = new Vector<Integer>();
		
//		Appending new elements at the end of the list
		for(int i=1;i<=5;i++)
			v.add(i);
		
//		printing the elements
		System.out.println(v);
		
//		Remove elements at index 3
		v.remove(3);
		
//		Displaying the Vector after deletion
		System.out.println(v);
		
		
//		Printing elements one by one
		for(int i=0;i<v.size();i++)
			System.out.print(v.get(i) + " ");
	
	}
}
