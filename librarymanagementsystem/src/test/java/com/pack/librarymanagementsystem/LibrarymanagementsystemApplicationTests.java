package com.pack.librarymanagementsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.repository.BookRepository;
import com.pack.librarymanagementsystem.repository.UsersRepository;
import com.pack.librarymanagementsystem.service.BookService;
import com.pack.librarymanagementsystem.service.UserTableService;

@RunWith(SpringRunner.class)
@SpringBootTest
class LibrarymanagementsystemApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private BookService bookService;

	@MockBean
	private BookRepository bookRepository;

	@Autowired
	private UserTableService userTableService;

	@MockBean
	private UsersRepository userRepository;

	@Test
	public void saveBook() {
//		Save Book
		Book book = new Book(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		Mockito.when(bookRepository.save(book)).thenReturn(book);
		assertEquals(book, bookService.saveBook(book));
	}

//	@ParameterizedTest
//	public void saveAllBookTest() {
//		Book book = new Book(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
//		List<Book> books = new ArrayList();
//		books.add(book);
//		books.add(1, book);
//		List<Book> books = new ArrayList<>(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
//		 
//		Mockito.when(bookService.saveBulkBook(books));
//		assertEquals(book, books.get(0));
//	}

	@Test
	public void getBookForUserTest() {
		Book book = new Book(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		Mockito.when(bookService.getBookForUser("Chethan bhaghath")).thenReturn((book));
		assertEquals(book, bookService.getBookForUser("Chethan bhaghath"));
	}

	@Test
	public void updateBook() {
		Book book = new Book(04, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		Mockito.when(bookService.updateBookDetails(book)).thenReturn(book);
		assertEquals(book, bookService.updateBookDetails(book));
	}

	@ParameterizedTest
	public void getBookByTopicTest(String author, Boolean isIssued) {

		Book book = new Book(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		List<Book> books = new ArrayList();
		books.add(book);
		books.add(1, book);
//		Book book = new Book(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		Mockito.when(bookService.searchBooksByTopic("GK")).thenReturn(books);
		assertEquals(books, books);
		assertEquals(book, bookService.searchBooksByTopic("GK"));
	}

	@ParameterizedTest
	public void deleteBookTest() {
		Book book = new Book(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		Mockito.when(bookService.deleteByBookName("Half Girlfriend")).thenReturn("delete  successfully");
		Mockito.verify(bookRepository, Mockito.times(1)).deleteByName("Half Girlfriend");
	}

	@Test
	public void saveUsersTest() {
//		Save user test
		Users user = new Users(01, "Harish", "8970002353", "Harish@gmail.com", "Banglore");
		Mockito.when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userTableService.saveUser(user));
	}
	
}
