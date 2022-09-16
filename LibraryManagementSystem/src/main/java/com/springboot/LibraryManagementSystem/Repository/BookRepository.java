package com.springboot.LibraryManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.LibraryManagementSystem.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	public List<Book> findByName(String name);

	public List<Book> findByauthor(String author);

	public List<Book> findBypublication(String name);
}
