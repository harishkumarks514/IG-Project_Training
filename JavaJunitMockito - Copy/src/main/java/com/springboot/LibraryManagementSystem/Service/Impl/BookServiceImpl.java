package com.springboot.LibraryManagementSystem.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.LibraryManagementSystem.Entity.Book;
import com.springboot.LibraryManagementSystem.Repository.BookRepository;
import com.springboot.LibraryManagementSystem.Service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository BookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.BookRepository = bookRepository;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub

		return BookRepository.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return BookRepository.save(book);
	}

}
