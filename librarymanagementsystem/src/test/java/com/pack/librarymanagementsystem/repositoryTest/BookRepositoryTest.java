package com.pack.librarymanagementsystem.repositoryTest;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.repository.BookRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

	@Autowired
	private BookRepository bookRepository;

	private Book book;

	@BeforeEach
	private void setUp() {
		// TODO Auto-generated method stub
		book = Book.builder().activeFlag(1).author("Jokha Alharthi").name("Celestial Bodies").topic("Health").build();
	}

	@DisplayName("Junit test for adding single row.")
	@Test
	public void givenBookObject_whenSave_thenReturnSavedBook() {
		book = Book.builder().activeFlag(1).author("Jokha Alharthi").name("Celestial Bodies").topic("Health").build();

		Book booksaved = bookRepository.save(book);
		assertThat(booksaved).isNotNull();
		assertThat(booksaved.getId()).isGreaterThan(0);
	}

	@DisplayName("JUnit test for getting all books.")
	@Test
	public void givenBookList_whenFindAll_thenBookList() {

		bookRepository.save(book);
		List<Book> allBook = bookRepository.findAll();
		assertThat(allBook.size()).isGreaterThanOrEqualTo(14);
	}

	@DisplayName("JUnit test for getting book by id.")
	@Test
	public void givenBookObject_whenFindById_thenReturnBookObject() {

		bookRepository.save(book);

		Book bookDB = bookRepository.findById(book.getId()).get();

		assertThat(bookDB).isNotNull();
	}

	@DisplayName("JUnit test for getting book by Name.")
	@Test
	public void givenBookObject_whenFindByName_thenReturnBookObject() {
		bookRepository.save(book);

		List<Book> bookdb = bookRepository.findByAuthorAndIssued(book.getAuthor(), true);
		assertThat(bookdb).isNotNull();
	}

	@DisplayName("JUnit test for getting book by Author.")
	@Test
	public void givenBookObject_whenFindByAuthor_thenReturnBookObject() {
		bookRepository.save(book);

		List<Book> bookdb = bookRepository.findByAuthorAndIssued(book.getAuthor(), true);
		assertThat(bookdb).isNotNull();

	}

	@DisplayName("JUnit test for update book operation")
	@Test
	public void givenBookObject_whenUpdateBookData_thenReturnUpdatedBookData() {

		bookRepository.save(book);

		Book savedBook = bookRepository.findById(book.getId()).get();
		savedBook.setActiveFlag(0);

		Book updatedBook = bookRepository.save(savedBook);

		assertThat(updatedBook.getActiveFlag()).isEqualTo(0);
	}
	
	 @DisplayName("JUnit test for delete(Update Active Flag To 0) book.")
	    @Test
	    public void givenEmployeeObject_whenDelete_thenRemoveEmployee(){

	        bookRepository.save(book);

	        Book checkActiveFlag = bookRepository.getById(book.getId());
	        checkActiveFlag.setActiveFlag(0);
	        Book updatedBookData = bookRepository.save(checkActiveFlag);
	        
	         
	        assertThat(updatedBookData.getActiveFlag()).isEqualTo(0);
	    }
	
}
