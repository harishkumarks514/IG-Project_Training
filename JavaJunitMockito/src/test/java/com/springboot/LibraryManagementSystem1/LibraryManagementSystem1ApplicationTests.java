package com.springboot.LibraryManagementSystem1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.hibernate.query.criteria.internal.expression.SearchedCaseExpression.WhenClause;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mysql.cj.util.DnsSrv.SrvRecord;
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

	@Test
	private void getUsersTest() {

		when(repository.findAll()).thenReturn(Stream.of(new User(376, "Raj", "raj123@gmail.com", 897896754, "Employee"))
				.collect(Collectors.toList()));

		assertEquals(2, service.getAllUsers().size());

	}

	@Test
	public void saveUserTest() {
		User user = new User(1001, "Ravi", "ravi123@gmail.com", 897000754, "SelfEmployee");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.saveUser(user));
	}

	@Test
	public void deleteUserTest() {
		User user = new User(191, "Bhaeath", "bharath123@gmail.com", 897000235, "Student");
		service.deleteUser(user);
		verify(repository, times(1)).delete(user);
	}

}
