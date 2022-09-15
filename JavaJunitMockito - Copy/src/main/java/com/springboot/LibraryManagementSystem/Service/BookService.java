package com.springboot.LibraryManagementSystem.Service;

import java.util.List;

import com.springboot.LibraryManagementSystem.Entity.Book;

public interface BookService {
	
	List<Book> getAllBooks(); 

	Book saveBook(Book book);
}
