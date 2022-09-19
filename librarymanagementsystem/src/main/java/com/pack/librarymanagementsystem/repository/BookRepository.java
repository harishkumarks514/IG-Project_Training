package com.pack.librarymanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.librarymanagementsystem.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	
	
	List<Book> findByTopicAndIssued(String author, boolean isIssued);

	List<Book> findByAuthorAndIssued(String author, boolean isIssued);

	int deleteByName(String name);

	Book findByNameAndIssued(String name, boolean isIssued);

	Book findByName(String name);
}
