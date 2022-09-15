package com.springboot.LibraryManagementSystem.Service;

import java.util.List;


import com.springboot.LibraryManagementSystem.Entity.BookTransactionDetails;
import com.springboot.LibraryManagementSystem.Entity.User;

public interface BookTransactionService {

	List<BookTransactionDetails> getAllBookTransactionDetails();
	BookTransactionDetails saveBookTransactionDetails(BookTransactionDetails bookTransactionDetails);
}
