package com.springboot.LibraryManagementSystem.Service.Impl;

import java.util.List;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
 
import com.springboot.LibraryManagementSystem.Entity.Book;
import com.springboot.LibraryManagementSystem.Entity.BookTransactionDetails;
import com.springboot.LibraryManagementSystem.Entity.User;
import com.springboot.LibraryManagementSystem.Repository.BookRepository;
import com.springboot.LibraryManagementSystem.Repository.BookTransactionRepository;
import com.springboot.LibraryManagementSystem.Repository.UsersRepository;
import com.springboot.LibraryManagementSystem.Service.BookTransactionService;

public class BookTransactionImpl implements BookTransactionService {
	private static final Logger logger = LoggerFactory.getLogger(BookTransactionImpl.class); 

	@Autowired
	private BookTransactionRepository BookTransactionRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private UsersRepository usersRepository;

	public BookTransactionDetails saveTransaction(BookTransactionDetails bookTransactionDetails, long userId,
			long bookId, long libId) {
		logger.info("Book transaction service called for save transaction details.");
		User user = usersRepository.findById(userId).get();
		User librId = usersRepository.findById(libId).get();
		Book book = bookRepository.findById(bookId).get();
		bookTransactionDetails.setTransactionId(libId);
		bookTransactionDetails.setBookId(bookId);
		bookTransactionDetails.setIssuedTo(user);
		bookTransactionDetails.setModifiedBy(user);
		bookTransactionDetails.setCreatedBy(user);
		bookTransactionDetails.setUserId(user);
		bookTransactionDetails.setReturnedOn(null);
		bookTransactionDetails.setBookIssueddate(null);
		bookTransactionDetails.setTransactionStatus(null);
		return BookTransactionRepository.save(bookTransactionDetails);
	}

	@Override
	public List<BookTransactionDetails> getAllBookTransactionDetails() {
		logger.info("Book transaction service called for to get all Book transaction details.");
		return BookTransactionRepository.findAll();

	}

	@Override
	public List<BookTransactionDetails> findBookTransactionByRemarks(String name) {
		logger.info("Book transaction service called for to find Book transaction details By Remarks.");
		return BookTransactionRepository.findBytransactionRemark(name);
	}

	@Override
	public Optional<BookTransactionDetails> findTransactionByTransactionId(Long id) {
		logger.info("Book transaction service called for to find Book transaction details By Transaction ID.");
		return BookTransactionRepository.findById(id);
	}

	@Override
	public BookTransactionDetails updateTransaction(BookTransactionDetails bookTransactionDetails) {
		logger.info("Book transaction service called for to Update Book transaction details.");
		BookTransactionDetails bookTransactionDet = BookTransactionRepository
				.findById(bookTransactionDetails.getTransactionId()).orElse(null);
		bookTransactionDet.setBookIssueddate(bookTransactionDetails.getBookIssueddate());
		bookTransactionDet.setBookReturndate(bookTransactionDetails.getBookReturndate());
		bookTransactionDet.setCreatedOn(bookTransactionDetails.getCreatedOn());
		bookTransactionDet.setIssuedBy(bookTransactionDetails.getIssuedBy());
		bookTransactionDet.setRemark(bookTransactionDetails.getRemark());
		bookTransactionDet.setTransactionStatus(bookTransactionDetails.getTransactionStatus());
		bookTransactionDet.setIssuedTo(bookTransactionDetails.getIssuedTo());
		bookTransactionDet.setUserId(bookTransactionDetails.getUserId());
		bookTransactionDet.setBookId(bookTransactionDetails.getBookId());
		bookTransactionDet.setCreatedBy(bookTransactionDetails.getCreatedBy());
		bookTransactionDet.setModifiedBy(bookTransactionDetails.getModifiedBy());
		bookTransactionDet.setModifiedon(bookTransactionDetails.getModifiedon());
		return BookTransactionRepository.save(bookTransactionDet);

	}

}
