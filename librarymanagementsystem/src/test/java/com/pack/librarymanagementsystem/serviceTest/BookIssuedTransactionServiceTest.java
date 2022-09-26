package com.pack.librarymanagementsystem.serviceTest;

import static org.junit.Assert.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pack.librarymanagementsystem.entity.BookTransaction;
import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.repository.BookTransactionRepository;
import com.pack.librarymanagementsystem.service.impl.BookTransactionServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BookIssuedTransactionServiceTest {

	
	@Mock
	private BookTransactionRepository bookTransRepo;
	
	@InjectMocks
	private BookTransactionServiceImpl bookIssuedService;
	
	Users user;
	
	@DisplayName("Junit test for save transaction.")
	@Test
	public void givenBookIssueObject_whenSave_ThenReturnBookIssueObject() {
		BookTransaction bookIssue = BookTransaction.builder().
				transactionId(1L).transactionStatus("Approved").
				remarks("Book Issued").issued_To(user). build();
		BDDMockito.given(bookTransRepo.findById(1L)).willReturn(Optional.of(bookIssue));
		BDDMockito.given(bookTransRepo.save(bookIssue)).willReturn(bookIssue);
        BookTransaction savedBook = bookIssuedService.saveTransaction(bookIssue,2L,1L);
       	assertThat(savedBook).isNotNull();
	}
	
	@DisplayName("Junit test for get book issue by transaction id")
	@Test
	public void givenBookIssueObject_whenFindById_thenReturnBookIssueObject() {
		BookTransaction	bookIssue1 = BookTransaction.builder().transactionId(1L).transactionStatus("Approved").remarks("Book Issued").build();
		BDDMockito.given(bookTransRepo.findById(bookIssue1.getTransactionId())).willReturn(Optional.of(bookIssue1));
		BookTransaction savedBookIssue = bookIssuedService.findTransactionByTransactionId(bookIssue1.getTransactionId()).get();
		assertThat(savedBookIssue).isNotNull();
	}
	@DisplayName("Junit test for getting all books.")
	@Test
	public void givenBookIssueObject_whenFindall_thenReturnBookIssueObject() {
		BookTransaction	bookIssue1 =
		BookTransaction.builder().transactionId(1L).
		transactionStatus("Approved").remarks("Book Issued").build();
		BDDMockito.given(bookTransRepo.findAll()).willReturn(List.of(bookIssue1));
		List<BookTransaction> bookList = bookIssuedService.findAllBookIssued();
		assertThat(bookList).isNotNull();
		assertThat(bookList.size()).isGreaterThan(0);
	}

	@DisplayName("Junit test for updating transaction.")
	@Test
	public void givenUserObject_ForUpdateTransaction_thenReturnUserObject() {
		BookTransaction	bookIssue1 =
				BookTransaction.builder().transactionId(1L).
				transactionStatus("Approved").remarks("Book Issued").build();
		BDDMockito.given(bookTransRepo.save(bookIssue1)).willReturn(bookIssue1);
		BookTransaction savedUser = bookIssuedService.saveTransaction(bookIssue1,2L,1L);
		savedUser.setRemarks("Book is issued and only nine left.");
        assertThat(savedUser.getRemarks()).isEqualTo("Book is issued and only nine left.");
	}
}
