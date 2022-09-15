package com.springboot.LibraryManagementSystem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.LibraryManagementSystem.Entity.User;
import com.springboot.LibraryManagementSystem.Repository.UsersRepository;
import com.springboot.LibraryManagementSystem.Service.UserService;

import javafx.beans.binding.When;


@RunWith(SpringRunner.class)
@SpringBootTest
class LibraryManagementSystem1ApplicationTests {
	
	@Autowired
	private UserService service;
	
	@MockBean
	private UsersRepository repository;

	private void getUsersTest() {

		when(repository.findAll()).thenReturn(
				Stream.of(new User(376,"Raj","raj123@gmail.com", 897896754,"Employee")).collect(Collectors.toList()));
		
		assertEquals(2, service.getAllUsers().size());
		
	}
	
	
}
