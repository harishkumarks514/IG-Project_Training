package com.pack.librarymanagementsystem;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.reactive.function.server.MockServerRequest.Builder;
import org.springframework.test.context.junit4.SpringRunner;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.repository.BookRepository;
import com.pack.librarymanagementsystem.service.BookService;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.OngoingStubbing;

@RunWith(SpringRunner.class)
@SpringBootTest
class LibrarymanagementsystemApplicationTests {

	@Autowired
	private BookService bookService;
 

	@MockBean
	private BookRepository bookRepository;

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
		Mockito.when(bookService.getBookForUser("Chethan bhaghath")).thenReturn((Book) Stream.of(book));
		assertEquals(book,bookService.getBookForUser("Chethan bhaghath"));
	} 

	@ParameterizedTest
	public void updateBook() {
		Book book = new Book(04, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		Mockito.when(bookService.updateBookDetails(book))
				.thenReturn(book);
		assertEquals(book, bookService.updateBookDetails(book));
	}

	 

	@ParameterizedTest
	public void getBookByTopicTest(String author, Boolean isIssued) {
		Book book = new Book(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		Mockito.when(bookService.searchBooksByTopic("GK")).thenReturn((List<Book>) Stream.of(book));
		assertEquals(book, bookService.searchBooksByTopic("GK"));
	}

	@ParameterizedTest
	public void deleteBookTest() {
		Book book = new Book(01, "Half Girlfriend", "Chethan bhaghath", "GK", true, "");
		Mockito.when(bookService.deleteByBookName("Half Girlfriend")).thenReturn("delete  successfully");
		Mockito.verify(bookRepository, Mockito.times(1)).deleteByName("Half Girlfriend");
	}

}
