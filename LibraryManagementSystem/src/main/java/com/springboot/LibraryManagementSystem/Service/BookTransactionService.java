package com.springboot.LibraryManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import com.springboot.LibraryManagementSystem.Entity.BookTransactionDetails;

public interface BookTransactionService {

	public List<BookTransactionDetails> getAllBookTransactionDetails();

	public List<BookTransactionDetails> findBookTransactionByRemarks(String name);

	public Optional<BookTransactionDetails> findTransactionByTransactionId(Long id);
	
	public BookTransactionDetails updateTransaction(BookTransactionDetails bookTransactionDetails);
	
}
