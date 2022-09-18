package com.pack.librarymanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.repository.BookRepository;

public class BookDao {

	@Autowired
	BookRepository bookRepository;

	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> findBookByTopicAndIsIssued(String topic, boolean isIssued) {
		return bookRepository.findByTopicAndissued(topic, isIssued);
	}

	public List<Book> findBookByAuthorAndIsIssued(String author, boolean isIssued) {
		return bookRepository.findByAuthorAndissued(author, isIssued);
	}

	public Book deleteBookByName(String name) {
		return bookRepository.deleteByName(name);
	}

	public Book findBookByName(String name) {
		return bookRepository.findByName(name);
	}
	

	public Book findBookByNameAndIsIssued(String name, boolean isIssued) {
		return bookRepository.findByNameAndIsIssued(name, isIssued);
	}


}
