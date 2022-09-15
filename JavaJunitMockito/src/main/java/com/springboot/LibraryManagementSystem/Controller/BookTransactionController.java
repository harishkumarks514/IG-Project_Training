package com.springboot.LibraryManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.LibraryManagementSystem.Entity.Book;
import com.springboot.LibraryManagementSystem.Entity.BookTransactionDetails;
import com.springboot.LibraryManagementSystem.Service.BookTransactionService;

@Controller
public class BookTransactionController {

	private BookTransactionService bookTransactionService;

	public BookTransactionController(BookTransactionService bookTransactionService) {
		super();
		this.bookTransactionService = bookTransactionService;
	}

//	Handler method to handle List BookTransactiondetails and return mode and view

	@GetMapping("/booktransactiondetails")
	public String listBookTransactionDetails(Model model) {
		model.addAttribute("booktransactiondetails", bookTransactionService.getAllBookTransactionDetails());
		return "booktransactiondetails";
	}

	@PostMapping("/booktransactiondetails")
	public String savebooktransactiondetails(
			@ModelAttribute("booktransactiondetails") BookTransactionDetails bookTransactionDetails) {
		bookTransactionService.saveBookTransactionDetails(bookTransactionDetails);
		return "redirect:/books";
	}
}
