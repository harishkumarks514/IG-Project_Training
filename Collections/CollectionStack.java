package Collection;

import java.util.Iterator;
import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Geek");
		stack.push("For");
		stack.push("Geek");
		stack.push("Geeks");
		
//		Iterator for the stack
		Iterator<String> itr = stack.iterator();
		
//		printing the stack
		while (itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		
		System.out.println();
		
		stack.pop()
		;
		
//		Iterator for the stack
		itr = stack.iterator();
		
//		printing the stack
		
		while(itr.hasNext())
		{
		System.out.print(itr.next() + " ");
		}

	}
}
