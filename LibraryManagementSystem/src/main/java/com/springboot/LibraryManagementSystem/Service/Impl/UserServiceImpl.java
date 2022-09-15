package com.springboot.LibraryManagementSystem.Service.Impl;

import java.util.List;

import com.springboot.LibraryManagementSystem.Entity.User;
import com.springboot.LibraryManagementSystem.Repository.UsersRepository;
import com.springboot.LibraryManagementSystem.Service.UserService;

public class UserServiceImpl implements UserService {

	private UsersRepository UsersRepository;

	public UserServiceImpl(UsersRepository usersRepository) {
		super();
		this.UsersRepository = usersRepository;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return UsersRepository.findAll();
	}

}