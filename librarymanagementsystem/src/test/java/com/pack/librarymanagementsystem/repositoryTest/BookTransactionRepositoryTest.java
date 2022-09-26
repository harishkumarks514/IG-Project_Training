package com.pack.librarymanagementsystem.repositoryTest;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pack.librarymanagementsystem.entity.BookTransaction;
import com.pack.librarymanagementsystem.repository.BookTransactionRepository;

public class BookTransactionRepositoryTest {

	@Autowired
	private BookTransactionRepository bookTransactionRepo;

	private BookTransaction bookTransaction;

	@BeforeEach
	public void setUp() {
		bookTransaction = BookTransaction.builder().remarks("Approved").transactionStatus("Transaction Approved")
				.build();
	}

	@DisplayName("Junit test for save data in book transaction.")
	@Test
	public void givenBookIssuedObject_whenFindAll_thenReturnBookList() {
		bookTransactionRepo.save(bookTransaction);
		BookTransaction book = bookTransactionRepo.findById(bookTransaction.getTransactionId()).get();
		assertThat(book).isNotNull();
	}

	@DisplayName("Junit Test for get All Transaction.")
	@Test
	public void givenBookListObject_whenFindAll_thenReturnBookList() {
		bookTransactionRepo.save(bookTransaction);
		List<BookTransaction> transactionList = bookTransactionRepo.findAll();
		assertThat(transactionList).isNotNull();
		assertThat(transactionList.size()).isGreaterThanOrEqualTo(6);
	}

	@DisplayName("Junit test for getting all transaction by transaction id.")
	@Test
	public void givenUserObject_whenFindById_thenReturnUser() {
		bookTransactionRepo.save(bookTransaction);
		BookTransaction savedTransaction = bookTransactionRepo.findById(bookTransaction.getTransactionId()).get();
		assertThat(savedTransaction).isNotNull();
	}

	@DisplayName("Junit test for getting all transaction by status.")
	@Test
	public void givenUserObject_whenFindByName_thenReturnUser() {
		bookTransactionRepo.save(bookTransaction);
		List<BookTransaction> savedUser = bookTransactionRepo
				.findBytransactionStatus(bookIssuedTransaction.getTransactionStatus());
		assertThat(savedUser).isNotNull();
	}

	@DisplayName("Junit test for updating transaction.")
	@Test
	public void givenUserObject_whenUpdate_thenReturnUser() {
		bookTransactionRepo.save(bookTransaction);
		BookTransaction savedTransaction = bookTransactionRepo.findById(bookTransaction.getTransactionId()).get();
		savedTransaction.setRemarks("Rejected");
		savedTransaction.setTransactionStatus("Book is not available");
		BookTransaction bookUpdated = bookTransactionRepo.save(savedTransaction);
		assertThat(bookUpdated.getRemarks()).isEqualTo("Rejected");
		assertThat(bookUpdated.getTransactionStatus()).isEqualTo("Book is not available");
	}

}
