package com.pack.librarymanagementsystem.ControllerTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pack.librarymanagementsystem.controller.BookController;
import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.service.BookService;

@WebMvcTest(value = BookController.class)
public class BookControllerTest {

	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private BookService bookService;

	@Autowired
	private ObjectMapper objectMapper;
	
	private Book book;
	
	private Users user;
	
	@DisplayName("Junit test for creating new book using rest api")
    @Test
    public void givenBookObject_whenInsertbook_thenReturnSavedBook() throws Exception{
        Book book = Book.builder()
                .activeFlag(1).author("Erica Jong")
                .name("Fear of Flying")
                .topic("GK")
                .issued_to(user)
                .metaData(" ")
                .build();
        BDDMockito.given(bookService.saveBook(book)).willReturn(book);

        ResultActions response = mockMvc.perform(Post("/books/1")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(book)));
        response.andExpect(status().isCreated()).
        andDo(print());

    }

	@DisplayName("Junit test for get books by book name using rest api")
	@Test
	public void givenBookObjectList_whenGetAllUser_thenReturnBookList() throws Exception {
		List<Book> bookList = new ArrayList()<>();
		bookList.add(Book.builder().bookId(1L)
                .activeFlag(1).author("Erica Jong").name("Fear of Flying")
                .topic("GK")
                .issued_to(user)
                .metaData(" ")
                .build());
		BDDMockito.given(bookService.getBookForUser("Fear of Flying")).willReturn((Book) bookList);
		ResultActions response = mockMvc.perform(GetMapping("/getAllBook"));
		response.andExpect(status().isOk());
	}
	
	@DisplayName("Junit test for get book by book name using rest api")
	@Test
	public void givenBookObject_whenGetbyName_thenReturnBookObject() throws Exception {
		 Book book = Book.builder()
	                .activeFlag(1).author("Erica Jong").bookPrice(700).name("Fear of Flying")
	                .topic("GK")
	                .issued_to(user)
	                .metaData(" ")
	                .build();
		BDDMockito.given(bookService.getBookForUser("Fear of Flying")).willReturn(List.of(book));
		ResultActions response = mockMvc.perform(get("/BookByName/Fear of Flying", book.getName()));
		response.andExpect(status().isOk()).andDo(print());
		
	}
	@DisplayName("Junit test for get book by author name using rest api")
	@Test
	public void givenBookObject_whenGetbyAuthor_thenReturnBookObject() throws Exception {
		 Book book = Book.builder()
	                .activeFlag(1).author("Erica Jong").bookPrice(700).name("Fear of Flying")
	                .topic("GK")
	                .issued_to(user)
	                .metaData(" ")
	                .build();
		BDDMockito.given(bookService.searchBooksByAuthor("Erica Jong")).willReturn(List.of(book));
		ResultActions response = mockMvc.perform(GetMapping("/BookByAuthorName/Erica Jong", book.getAuthor()));
		response.andExpect(status().isOk()).andDo(print());
		
	}

 
	@DisplayName("Junit test for updating book using rest api")
	@Test
	public void givenBookObject_ToUpdateBookData_thenReturnBookObject() throws Exception {
		 Book savedbook = Book.builder().bookId(1L)
	                .activeFlag(1).author("Erica Jong").bookPrice(700).name("Fear of Flying").publication("Penguin")
	                .topic("GK")
	                .issued_to(user)
	                .metaData(" ")
	                .build();
		 Book updatedbook = Book.builder().bookId(1L)
	                .activeFlag(1).author("Erica Jong").bookPrice(700).name("Fear of Flying").publication("Pearson")
	                .topic("GK")
	                .issued_to(user)
	                .metaData(" ")
	                .build();
			BDDMockito.given(bookService.updateBookDetails(updatedbook)).willReturn(updatedbook);
		ResultActions response = mockMvc.perform(PutMapping("/updateBook", 1L));
		response.andExpect(status().isOk()).andDo(print());	
	} 
	
	@DisplayName("Junit test for deleteing book using rest api")
	@Test
	public void givenBookObject_ToDeleteBookData_thenReturnBookObject() throws Exception {
		 Book book = Book.builder().bookId(1L)
	                .activeFlag(1).author("Erica Jong").bookPrice(700).name("Fear of Flying").publication("Penguin")
	                .noOfCopies(10)
	                .build();
		BDDMockito.given(bookService.deleteByBookName(book.getName())).willReturn(book);
		ResultActions response = mockMvc.perform(delete("/deleteBookByName/Fear of Flying/1", book.getBookId()));
		response.andExpect(status().isOk()).andDo(print());	
	}
}
