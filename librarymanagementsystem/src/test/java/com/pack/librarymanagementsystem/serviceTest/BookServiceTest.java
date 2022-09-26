package com.pack.librarymanagementsystem.serviceTest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.verification.Times;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.repository.BookRepository;
import com.pack.librarymanagementsystem.service.impl.BookServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

	
	 @Mock
	    private BookRepository  bookRepository;
	    
 
	    @InjectMocks
	    private BookServiceImpl bookService;

	    private Book book;
	    
	    @DisplayName("Junit test for save book service.")
		@Test
		public void givenUserObject_whenSave_thenReturnUserObject() {
	    Book book = Book.builder().bookId(10L)
	                .activeFlag(1).name("A Revenue Stamp")
	                .author("Amrita Pritam")
	                 .createdOn(new Date())
	                .build();
			BDDMockito.given(bookRepository.save(book)).willReturn(book);
			Book savedBook = bookService.saveBook(book);
			assertThat(savedBook).isNotNull();
		}
	    
	    
	    @DisplayName("Junit test for get book by book topic.")
		@Test
		public void givenBookObject_whenFindByTopic_thenReturnBookObject() {
	    	Book book = Book.builder().bookId(10L)
	                .activeFlag(1).name("A Revenue Stamp")
	                .author("Amrita Pritam")
	                 .createdOn(new Date())
	                .build();
			BDDMockito.given(bookRepository.findByName(book.getName())).willReturn(List.of(book));
			List<Book> savedBook = bookService.searchBooksByTopic(book.getTopic());
			assertThat(savedBook).isNotNull();
		}
	  
	    @DisplayName("Junit test for get book by book author.")
		@Test
		public void givenBookObject_whenFindByAuthor_thenReturnBookObject() {
	    	Book book = Book.builder().bookId(10L)
	                .activeFlag(1).name("A Revenue Stamp")
	                .author("Amrita Pritam")
	                 .createdOn(new Date())
	                .build();
			BDDMockito.given(bookRepository.findByName(book.getName())).willReturn(List.of(book));
			List<Book> savedBook = bookService.searchBooksByAuthor(book.getAuthor());
			assertThat(savedBook).isNotNull();
		}
	    
	    @DisplayName("Junit test for delete book")
		@Test
		public void givenBookObject_whenDeleteById_thenReturnNothing() {
	    	Book book = Book.builder().bookId(10L)
	                .activeFlag(1).name("A Revenue Stamp")
	                .author("Amrita Pritam")
	                 .createdOn(new Date())
	                .build();
			BDDMockito.willDoNothing().given(bookRepository).deleteById(book.getBookId());
			bookService.deleteByBookName("Arun" );
			verify(bookRepository, Times(1)).deleteById(book.getId());
		}
}
