package Collections;

import java.util.HashMap;
import java.util.Map;

public class Book {

	int id, quantity;
	String name, author, publisher;

	public Book(int id, String name, String author, String publisher, int quantity) {

		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

  class MapExample {
	public static void main(String[] args) {
//		creating map of Books
		Map<Integer, Book> map = new HashMap<Integer, Book>();
		
//		Creating books
		Book b1 = new Book(101,"Let us C","Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communication & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		
		//Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);  
	    
	    //Traversing map  
	    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Book b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
	}
}
