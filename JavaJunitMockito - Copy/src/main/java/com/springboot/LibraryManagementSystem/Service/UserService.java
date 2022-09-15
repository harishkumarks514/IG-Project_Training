package com.springboot.LibraryManagementSystem.Service;

import java.util.List;

import com.springboot.LibraryManagementSystem.Entity.Book;
import com.springboot.LibraryManagementSystem.Entity.User;

public interface UserService {

	List<User> getAllUsers();
	
	User saveUser(User user);
}
