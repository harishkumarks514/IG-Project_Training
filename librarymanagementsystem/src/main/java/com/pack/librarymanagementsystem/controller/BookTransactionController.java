package com.pack.librarymanagementsystem.controller;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.librarymanagementsystem.entity.BookTransaction;
import com.pack.librarymanagementsystem.service.BookTransactionService;

@RestController
public class BookTransactionController {

	private static final Logger log = LoggerFactory.getLogger(BookTransactionController.class);
	
	@Autowired
	BookTransactionService bookTransactionService;
	
	@PostMapping("/saveTransaction/{bookId}/{userId}")
	private String saveTransaction(@RequestBody BookTransaction bookTransaction, 
			@PathVariable("userId") Long userId,
			@PathVariable("bookId") Long bookId) {
		log.info("Book Transaction controller called for save Transaction..");
		bookTransactionService.saveTransaction(bookTransaction, userId, bookId);
		return "Transaction saved successfully";
	}
	
	@GetMapping("/getAllTransaction")
	private List<BookTransaction> findAllTransaction() {
		log.info("Book Transaction controller called for find Transaction..");
		return bookTransactionService.findAllBookIssued();
	}
	
	@GetMapping("/getTransactionByTransactionId/{id}")
	private Optional<BookTransaction> getTransactionByTransactionId(@PathVariable Long id) {
		log.info("Book Transaction controller called for fetching transaction by transaction ID.");
		return bookTransactionService.findTransactionByTransactionId(id);
	}

	
	private BookTransaction updateTransaction(@RequestBody BookTransaction bookTransaction) {
		log.info("Book Transaction controller called for updating transaction.");
		return bookTransactionService.updateTransaction(bookTransaction);

	}
}
