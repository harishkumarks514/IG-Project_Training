package com.pack.librarymanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.librarymanagementsystem.entity.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long >{

	List<Book> findByTopicAndissued(String author, boolean isIssued);

	List<Book> findByAuthorAndissued(String author, boolean isIssued);

	Book deleteByName(String name);

	Book findByNameAndIsIssued(String name, boolean isIssued);

	Book findByName(String name);


	

	 
	
}
