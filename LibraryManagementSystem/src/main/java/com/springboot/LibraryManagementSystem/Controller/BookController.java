package com.springboot.LibraryManagementSystem.Controller;

 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic;
import com.springboot.LibraryManagementSystem.Service.BookService;

import ch.qos.logback.classic.BasicConfigurator;

@Controller // To make this class asSPRING MVC Class to handle the requests
public class BookController {

 
	
//	instance initializer
//	{
//		org.apache.log4j.BasicConfigurator.configure();
//	}

	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

//	Handler method to handle list Books and return mode and view
	@GetMapping("/books")
	public String listBooks(Model model) {
	 
		model.addAttribute("books", bookService.getAllBooks());
		return "books";
	}

}