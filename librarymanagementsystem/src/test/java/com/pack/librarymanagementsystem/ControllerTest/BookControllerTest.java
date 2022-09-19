package com.pack.librarymanagementsystem.ControllerTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pack.librarymanagementsystem.controller.BookController;
import com.pack.librarymanagementsystem.entity.Book;
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
	
	
}
