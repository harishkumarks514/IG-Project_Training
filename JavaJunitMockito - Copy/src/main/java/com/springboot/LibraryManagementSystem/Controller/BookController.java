package com.springboot.LibraryManagementSystem.Controller;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.LibraryManagementSystem.Entity.Book;
import com.springboot.LibraryManagementSystem.Service.BookService;

@Controller // To make this class asSPRING MVC Class to handle the requests
public class BookController {

	@Autowired
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
	
	@GetMapping("/books/new")
	public String createBookForm(Model model)
	{
		
		Book book = new  Book();
		model.addAttribute("book" , book);
		return "create_book";
	}

	@PostMapping("/books")
	public String saveBook(@ModelAttribute("books") Book book)
	{
	bookService.saveBook(book);
	return "redirect:/books";
	}
	

}