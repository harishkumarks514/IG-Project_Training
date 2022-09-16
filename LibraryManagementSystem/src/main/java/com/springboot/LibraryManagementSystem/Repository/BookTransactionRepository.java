package com.springboot.LibraryManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.springboot.LibraryManagementSystem.Entity.BookTransactionDetails;

public interface BookTransactionRepository extends JpaRepository<BookTransactionDetails, Long> {

	List<BookTransactionDetails> findByuserId(Long userId);

	List<BookTransactionDetails> findBytransactionRemark(String transactionStatus);
}
