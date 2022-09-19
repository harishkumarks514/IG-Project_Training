package com.pack.librarymanagementsystem.service.impl;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.repository.BookRepository;
import com.pack.librarymanagementsystem.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		if (Objects.isNull(book)) {
			// throw error
			throw new NullPointerException("Book details not entered.");
		}
		if ( book.getName().isEmpty()) {
			// throw error book name is mandatory
			throw new NullPointerException("Book name is mandatory.");
		}
		Book newBook = null;
		Book existingBook = bookRepository.findByName(book.getName());
		if (Objects.isNull(existingBook))
			newBook = bookRepository.save(book);
		
		else {
			// throw this book already exist in our DB
			throw new NullPointerException("Book is already exist in our DB.");
		}
		System.out.println("Book saved Successfully" + newBook);
		return newBook;
	}
	
	
	
	@Override
	public String saveBulkBook(List<Book> books) {
		if (Objects.isNull(books)) {
			// throw error
			throw new NullPointerException("Book details not entered.");
		}
		for (Book book : books) {

			if ( book.getName().isEmpty()) {
				// throw error book name is mandatory
				throw new NullPointerException("Book name is mandatory.");
			}
			Book existingBook = bookRepository.findByName(book.getName());
			if (Objects.isNull(existingBook))
				  bookRepository.save(book);
			else {
				// throw this book already exist in our DB
				throw new NullPointerException("Book is already exist in our DB.");
			}
		
		}
		return "success";
	}
	
	
	
	@Override
	public List<Book> searchBooksByTopic(String topic) {
		if (topic.isEmpty()) {
			// throw error topic is mandatory
			throw new NullPointerException("Topic is mandatory.");
		}
		return bookRepository.findByTopicAndIssued(topic, false);

	}
	@Override
	public List<Book> searchBooksByAuthor(String author) {
		if (author.isEmpty()) {
			// throw error author is mandatory
			throw new NullPointerException("Author is mandatory.");
		}
		return bookRepository.findByAuthorAndIssued(author, false);

	}
	
	@Transactional
	@Override
	public String deleteByBookName(String bookName) {
		if (bookName.isEmpty()) {
			// throw error bookName name is mandatory
			throw new NullPointerException("Book name is mandatory.");
		}
		return bookRepository.deleteByName(bookName) ==1?"Book removed successfully":"Book Not Exist";
	}
	@Override
	public Book getBookForUser(String name) {
		if (name.isEmpty()) {
			// throw error Book Name is mandatory
			throw new NullPointerException("Book name is mandatory.");
		}
		return bookRepository.findByNameAndIssued(name, false);
	}
	@Override
	public Book updateBookDetails(Book book) {
		if (book.getName().isEmpty()) {
			// throw error book name is mandatory
			throw new NullPointerException("Book name is mandatory.");
		}
		Book existingBook = bookRepository.findByNameAndIssued(book.getName(), false);
		if (!Objects.isNull(existingBook)) {
			book.setId(existingBook.getId());
			bookRepository.save(book);
		} else {
			// throw this book is not exist in our DB
			throw new NullPointerException("Book is not exist in our DB.");

		}

		return book;
	}
	
}
