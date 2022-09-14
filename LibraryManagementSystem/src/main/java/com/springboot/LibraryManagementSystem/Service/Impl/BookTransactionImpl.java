package com.springboot.LibraryManagementSystem.Service.Impl;

import java.util.List;

import com.springboot.LibraryManagementSystem.Entity.BookTransactionDetails;
import com.springboot.LibraryManagementSystem.Repository.BookTransactionRepository;
import com.springboot.LibraryManagementSystem.Service.BookTransactionService;

public class BookTransactionImpl implements BookTransactionService {

	private BookTransactionRepository BookTransactionRepository;

	public BookTransactionImpl(
			com.springboot.LibraryManagementSystem.Repository.BookTransactionRepository bookTransactionRepository) {
		super();
		this.BookTransactionRepository = bookTransactionRepository;
	}

	@Override
	public List<BookTransactionDetails> getAllBookTransactionDetails() {
		// TODO Auto-generated method stub
		return BookTransactionRepository.findAll();
	}

}
