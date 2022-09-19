package com.pack.librarymanagementsystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.service.BookService;

@RestController
public class BookController {
	Logger log = LoggerFactory.getLogger(BookController.class); 
	
	@Autowired
	private BookService bookService;

	@PostMapping("/save-book")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String saveBook(  @RequestBody Book book) {
		log.info("Adding book through json in bookController.");
		bookService.saveBook(book);
		return "Book Added Successfully";
	}

	@GetMapping("/getBookByAuthor/{author}")
	public List<Book> searchBooksByAuthor(@PathVariable String author) {
		log.info("Fetching the Books Available based on the author.");
		return bookService.searchBooksByAuthor(author);
	}

	@GetMapping("/getBookByTopic/{topic}")
	public List<Book> searchBooksByTopic(@PathVariable String topic) {
		log.info("Fetching All Books Available in bookController.");
		return bookService.searchBooksByTopic(topic);
	}

	@PostMapping("/saveallbooks")
	public String saveBulkBook( @RequestBody List<Book> books) {
		log.info("Save All Books.");
		return bookService.saveBulkBook(books);
	}

	@GetMapping("/getBookForUser/{name}")
	public Book getBooksForUser(@PathVariable String name) {
		log.info("Fetching All Books Available in bookController.");
		return bookService.getBookForUser(name);
	}
	
	@PutMapping("/updateBook")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Book updateProduct(@RequestBody Book book) {
		log.info("Updating book details in bookController.");
		return bookService.updateBookDetails(book);
	}

	@DeleteMapping("/deleteBookByName/{name}")
	public String deleteBook(@PathVariable String name) {
		log.info("Deleting book details in bookController.");
		return bookService.deleteByBookName(name);
	}
	
}
