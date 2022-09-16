package com.springboot.LibraryManagementSystem.Service;

import java.util.List;

import com.springboot.LibraryManagementSystem.Entity.Book;

public interface BookService {
	
	public List<Book> getAllBooks(); 
	
	public Book saveBook(Long libId, Book book) ;

	public Book getsBookById(Long id);

	public List<Book> findBookBybook_Name(String name);

	public List<Book> getsBookByAuthorName(String author);
	
	public List<Book> getsBookPublication(String name);

	public Book deleteBook(String name, Long id);

	public Book updateBook(Book book);
}
