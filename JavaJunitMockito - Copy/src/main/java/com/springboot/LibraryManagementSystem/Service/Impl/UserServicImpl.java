package com.springboot.LibraryManagementSystem.Service.Impl;

import java.util.List;

import com.springboot.LibraryManagementSystem.Entity.User;
import com.springboot.LibraryManagementSystem.Repository.BookRepository;
import com.springboot.LibraryManagementSystem.Repository.UsersRepository;
import com.springboot.LibraryManagementSystem.Service.UserService;

public class UserServicImpl implements UserService {

	private UsersRepository UsersRepository;

	public UserServicImpl(UsersRepository usersRepository) {
		super();
		this.UsersRepository = usersRepository;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return UsersRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return UsersRepository.save(user);
	}

}
