package com.pack.librarymanagementsystem.serviceTest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pack.librarymanagementsystem.entity.Book;
import com.pack.librarymanagementsystem.repository.BookRepository;
import com.pack.librarymanagementsystem.service.impl.BookServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

	
	 @Mock
	    private BookRepository  bookRepository;
	    
 
	    @InjectMocks
	    private BookServiceImpl bookService;

	    private Book book;
}
