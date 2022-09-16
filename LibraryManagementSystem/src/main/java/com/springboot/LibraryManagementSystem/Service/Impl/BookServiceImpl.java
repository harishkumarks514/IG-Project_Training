package com.springboot.LibraryManagementSystem.Service.Impl;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
import com.springboot.LibraryManagementSystem.Entity.Book;
import com.springboot.LibraryManagementSystem.Entity.User;
import com.springboot.LibraryManagementSystem.Repository.BookRepository;
import com.springboot.LibraryManagementSystem.Repository.UsersRepository;
import com.springboot.LibraryManagementSystem.Service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class); 
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private UsersRepository usersRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@Override
	public List<Book> getAllBooks() {
		logger.info("Book transaction service called for save all Books.");
		return bookRepository.findAll() ;
	}


	@Override
	public Book saveBook(Long libId, Book book) {
		logger.info("Book service called for save Books.");
		User user = usersRepository.findById(libId).get();
		book.setCreatedBy(user);
		book.setModifiedBy(user);
		return bookRepository.save(book);
		
	}


	@Override
	public Book getsBookById(Long id) {
		logger.info("Book service called for Find Book by ID.");
		return bookRepository.findById(id).orElse(null);
	}


	@Override
	public List<Book> findBookBybook_Name(String name) {
		logger.info("Book service called for Find Book by Name.");
		List<Book> books = new ArrayList<>();
		return bookRepository.findByName(name);
	}


	@Override
	public List<Book> getsBookByAuthorName(String author) {
		logger.info("Book service called for Find books by Author.");
		List<Book> books = new ArrayList<>();
		return bookRepository.findByauthor(author);
	}


	@Override
	public List<Book> getsBookPublication(String name) {
		logger.info("Book service called for to find Book Publisher Name .");
		return bookRepository.findBypublication(name);
	}


	@Override
	public Book deleteBook(String name, Long id) {
		logger.info("Book service called for to delete Book by name and Id.");
			 
			List<Book> existingBook = bookRepository.findByName(name);
			User user = usersRepository.findById(id).get();
			existingBook.get(0).setActiveFlag(0);
			existingBook.get(0).setAvailableBooks(0);
			existingBook.get(0).setModifiedBy(user);
			return bookRepository.save(existingBook.get(0));
	}


	@Override
	public Book updateBook(Book book) {
		
		logger.info("Book service called for to update the Book.");
		Book existingBook = bookRepository.findById(book.getBookId()).orElse(null);
		existingBook.setBookName(book.getBookName());
		existingBook.setBookAuthor(book.getBookAuthor());
		existingBook.setBookpublication(book.getBookpublication());
		existingBook.setBookPrice(book.getBookPrice());
		existingBook.setAvailableBooks(book.getAvailableBooks());
		existingBook.setCreatedBy(book.getCreatedBy());
		existingBook.setCreatedOn(book.getCreatedOn());
		existingBook.setModifiedBy(book.getModifiedBy());
		existingBook.setModifiedOn(book.getModifiedOn());
		existingBook.setActiveFlag(book.getActiveFlag());
		return bookRepository.save(existingBook);
	}

}
