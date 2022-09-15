package com.springboot.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.LibraryManagementSystem.Entity.Book;



public interface BookRepository extends JpaRepository<Book, Long> {

}
