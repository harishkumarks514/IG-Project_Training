package com.springboot.LibraryManagementSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

	@Id        //To make the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Provides for the specification of generation 
//	strategies for thevalues of primary keys. Provides for the specification of generation strategies for thevalues of primary keys. 
	private long bookId;
	
	@Column(name="Book_Name" , nullable=false)
	private String bookName;
	
	@Column(name ="Author",  nullable = false )
	private String bookAuthor;
	
	@Column(name = "Publisher", nullable = false)
	private String bookpublication;
	
	@Column(name="price", nullable = false)
	private int bookPrice;
	
	@Column(name = "Books_Available", nullable = false)
	private int availableBooks;

	public Book() {

	}

	public Book(long bookId, String bookName, String bookAuthor, String bookpublication, int bookPrice,
			int availableBooks) {
		super();

		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookpublication = bookpublication;
		this.bookPrice = bookPrice;
		this.availableBooks = availableBooks;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookpublication() {
		return bookpublication;
	}

	public void setBookpublication(String bookpublication) {
		this.bookpublication = bookpublication;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getAvailableBooks() {
		return availableBooks;
	}

	public void setAvailableBooks(int availableBooks) {
		this.availableBooks = availableBooks;
	}

}
