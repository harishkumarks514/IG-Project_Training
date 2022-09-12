package Composition;

import java.util.ArrayList;
import java.util.List;

public class Book {

	public String title;
	public String author;

//	Constructor
	public Book(String title, String author) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.author = author;
	}
}

//		Class2
class Library {
	private final List<Book> books;

//	Library class contains list of books
	Library(List<Book> books) {
		this.books = books;
	}

//	Method to get total nummber of books in library.
	public List<Book> getTotalBooksInLibrary() {
		return books;
	}
}

class main {
	public static void main(String[] args) {
		
//	 {
		// TODO Auto-generated constructor stub
		Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");

		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

		// Creating the list which contains number of books

		List<Book> books = new ArrayList<Book>();

		// Adding books
		// using add() method
		books.add(b1);
		books.add(b2);
		books.add(b3);
		Library lib = new Library(books);

//Calling method to get total books in library
// and storing it in list of user0defined type -
// Books

		List<Book> bks = lib.getTotalBooksInLibrary();

// Iterating over books using for each loop

		for (Book bk : bks) {
			// Printing the title and author name of book on
            // console
			
			System.out.println("TITLE : " + bk.title
					+ " and " 
					+"Author : " + bk.author);
		}
	}
}
