package com.pack.librarymanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.librarymanagementsystem.entity.BookTransaction;

@Repository
public interface BookTransactionRepository extends JpaRepository<BookTransaction, Long> {

	
	List<BookTransaction> findByUserId(Long userId);
	
//	List<BookTransaction> findByUserName(String name);
}
