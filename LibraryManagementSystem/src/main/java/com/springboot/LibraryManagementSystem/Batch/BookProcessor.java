package com.springboot.LibraryManagementSystem.Batch;

import java.util.Date;

import javax.batch.api.chunk.ItemProcessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.springboot.LibraryManagementSystem.Entity.Book;
import com.springboot.LibraryManagementSystem.Entity.User;

@Component
public class BookProcessor implements org.springframework.batch.item.ItemProcessor<Book, Book> {

	public static final Logger log = LoggerFactory.getLogger(BookProcessor.class);
	

	private User user;
	
	 @SuppressWarnings("static-access")
	 @Override
	public Book process(Book books) throws Exception {
		 books.setCreatedOn(new Date());
		 books.setModifiedOn(new Date());
		 books.setActiveFlag(1);
		 log.info("Display Books"+books);
			log.info("Book Process stop");
		 return books;
	}
	
}
