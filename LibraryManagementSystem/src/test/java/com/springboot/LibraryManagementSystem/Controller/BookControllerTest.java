package com.springboot.LibraryManagementSystem.Controller;

import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.LibraryManagementSystem.Entity.Book;
import com.springboot.LibraryManagementSystem.Service.BookService;

@WebMvcTest(value =  BookController.class)
public class BookControllerTest {

	@Autowired
	private MockMvc mockMva;
	
	@MockBean
	private BookService bookService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	private Book book;
	
	
	@DisplayName("Junit test for creating new book using rest api")
	@test
	
}
