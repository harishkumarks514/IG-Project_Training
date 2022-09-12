package Collection;
import java.util.*;
import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		
	
		java.util.ArrayList al = new  java.util.ArrayList();   // Create new arraylist
		al.add("Jack");
		al.add("Tyler");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}