package com.pack.librarymanagementsystem.impl;

import java.util.List;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import com.pack.librarymanagementsystem.dao.BookDao;
import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.service.BookService;
public class BookImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	public Book saveBook(Book book) {
		if (Objects.isNull(book)) {
			// throw error
			throw new NullPointerException("Book details not entered.");
		}
		if (io.micrometer.core.instrument.util.StringUtils.isBlank(book.getName())) {
			// throw error book name is mandatory
			throw new NullPointerException("Book name is mandatory.");
		}
		Book newBook = null;
		Book existingBook = bookDao.findBookByName(book.getName());
		if (Objects.isNull(existingBook))
			newBook = bookDao.saveBook(book);
		else {
			// throw this book already exist in our DB
			throw new NullPointerException("Book is already exist in our DB.");
		}

		return newBook;

	}

	public String saveBulkBook(List<Book> books) {
		if (Objects.isNull(books)) {
			// throw error
			throw new NullPointerException("Book details not entered.");
		}
		for (Book book : books) {

			if (io.micrometer.core.instrument.util.StringUtils.isBlank(book.getName())) {
				// throw error book name is mandatory
				throw new NullPointerException("Book name is mandatory.");
			}
			Book existingBook = bookDao.findBookByName(book.getName());
			if (Objects.isNull(existingBook))
				bookDao.saveBook(book);
			else {

			}
			// throw this book already exist in our DB
			throw new NullPointerException("Book is already exist in our DB.");
		}
		return "success";
	}

	public List<Book> searchBooksByTopic(String topic) {
		if (io.micrometer.core.instrument.util.StringUtils.isBlank(topic)) {
			// throw error topic is mandatory
			throw new NullPointerException("Topic is mandatory.");
		}
		return bookDao.findBookByTopicAndIsIssued(topic, false);

	}

	public List<Book> searchBooksByAuthor(String author) {
		if (io.micrometer.core.instrument.util.StringUtils.isBlank(author)) {
			// throw error author is mandatory
			throw new NullPointerException("Author is mandatory.");
		}
		return bookDao.findBookByAuthorAndIsIssued(author, false);

	}

	public Book deleteByBookName(String bookName) {
		if (io.micrometer.core.instrument.util.StringUtils.isBlank(bookName)) {
			// throw error bookName name is mandatory
			throw new NullPointerException("Book name is mandatory.");
		}
		return bookDao.deleteBookByName(bookName);
	}

	public Book getBookForUser(String name) {
		if (io.micrometer.core.instrument.util.StringUtils.isBlank(name)) {
			// throw error Book Name is mandatory
			throw new NullPointerException("Book name is mandatory.");
		}
		return bookDao.findBookByNameAndIsIssued(name, false);
	}

	public Book updateBookDetails(Book book) {
		if (io.micrometer.core.instrument.util.StringUtils.isBlank(book.getName())) {
			// throw error book name is mandatory
			throw new NullPointerException("Book name is mandatory.");
		}
		Book existingBook = bookDao.findBookByNameAndIsIssued(book.getName(), false);
		if (!Objects.isNull(existingBook)) {
			book.setId(existingBook.getId());
			bookDao.saveBook(book);
		} else {
			// throw this book is not exist in our DB
			throw new NullPointerException("Book is not exist in our DB.");

		}

		return book;
	}
}
