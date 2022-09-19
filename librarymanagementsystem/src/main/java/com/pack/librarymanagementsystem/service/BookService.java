package com.pack.librarymanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.librarymanagementsystem.entity.Book;

@Service
//@Component
public interface BookService {
	

	public Book saveBook(Book book);

	public String saveBulkBook(List<Book> books);

	public List<Book> searchBooksByTopic(String topic);

	public List<Book> searchBooksByAuthor(String author);

	public String deleteByBookName(String bookName);

	public Book getBookForUser(String name);

	public Book updateBookDetails(Book book);
}
