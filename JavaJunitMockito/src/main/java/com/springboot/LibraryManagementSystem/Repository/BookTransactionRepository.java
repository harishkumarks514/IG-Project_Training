package com.springboot.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.LibraryManagementSystem.Entity.BookTransactionDetails;

public interface BookTransactionRepository extends JpaRepository<BookTransactionDetails, Long> {

}
