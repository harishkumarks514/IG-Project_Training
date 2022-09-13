package com.springboot.LibraryManagementSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {

	private long bookId;
	private String name;
	private String author;
	private String publication;
	private int price;
	private int availableBooks;

}
