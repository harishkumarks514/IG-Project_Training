package com.springboot.LibraryManagementSystem.Service;

import java.util.List;


import com.springboot.LibraryManagementSystem.Entity.BookTransactionDetails;

public interface BookTransactionService {

	List<BookTransactionDetails> getAllBookTransactionDetails();
}
