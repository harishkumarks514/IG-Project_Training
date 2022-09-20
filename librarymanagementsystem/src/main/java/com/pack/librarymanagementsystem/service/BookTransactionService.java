package com.pack.librarymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pack.librarymanagementsystem.entity.BookTransaction;

@Service
public interface BookTransactionService {

	public BookTransaction saveTransaction(BookTransaction bookTransaction, long userId,long bookId);

	public List<BookTransaction> findAllBookIssued();
	
	public Optional<BookTransaction> findTransactionByTransactionId(Long Id);
	

	public BookTransaction updateTransaction(BookTransaction bookTransaction);
	
}
