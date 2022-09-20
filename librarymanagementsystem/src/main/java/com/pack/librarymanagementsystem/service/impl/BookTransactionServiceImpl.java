package com.pack.librarymanagementsystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.entity.BookTransaction;
import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.repository.BookRepository;
import com.pack.librarymanagementsystem.repository.BookTransactionRepository;
import com.pack.librarymanagementsystem.repository.UsersRepository;
import com.pack.librarymanagementsystem.service.BookTransactionService;

@Service
public class BookTransactionServiceImpl implements BookTransactionService {

	private static final Logger logger = LoggerFactory.getLogger(BookTransactionServiceImpl.class);

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private UsersRepository userRepository;
	@Autowired
	private BookTransactionRepository bookTransactionRepository;

	public BookTransaction saveTransaction(BookTransaction bookTransaction, long userId, long bookId) {
		logger.info("Book Transaction service called for save transaction..");
		
		Users user=userRepository.findById(userId).get();
		Book book =bookRepository.findById(bookId).get();
		bookTransaction.setBookId(book);
		bookTransaction.setIssued_To(user);
		bookTransaction.setUserId(user);
		return bookTransactionRepository.save(bookTransaction);
	}

	@Override
	public List<BookTransaction> findAllBookIssued() {
		logger.info("Book Transaction service called for Fetching all transaction .");
		return bookTransactionRepository.findAll();
	}
  
	public Optional<BookTransaction> findTransactionByTransactionId(Long id) {
		logger.info("Book Transaction service called for finding transaction by id..");
		return bookTransactionRepository.findById(id);
	}

	public BookTransaction updateTransaction(BookTransaction bookTransaction) {
		logger.info("Book issued service called for updating transaction.");
		BookTransaction	transactionDetails=bookTransactionRepository.findById(bookTransaction.getTransactionId()).orElse(null);
		transactionDetails.setBookId(bookTransaction.getBookId());
		transactionDetails.setIssued_To(bookTransaction.getUserId());
		transactionDetails.setRemarks(bookTransaction.getRemarks());
		transactionDetails.setTransactionId(bookTransaction.getTransactionId());
		transactionDetails.setTransactionStatus(bookTransaction.getTransactionStatus());
		transactionDetails.setUserId(bookTransaction.getUserId());
		return bookTransactionRepository.save(transactionDetails);
	}

}
