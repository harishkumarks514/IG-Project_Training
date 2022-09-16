package com.springboot.LibraryManagementSystem.Service.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springboot.LibraryManagementSystem.Entity.User;
import com.springboot.LibraryManagementSystem.Repository.UsersRepository;
import com.springboot.LibraryManagementSystem.Service.UserService;

public class UserServiceImpl implements UserService {
	

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class); 
	
	private UsersRepository usersRepository;

	public UserServiceImpl(UsersRepository usersRepository) {
		super();
		this.usersRepository = usersRepository;
	}

	@Override
	public User saveUser(User userTable) {
		logger.info("User service called for save the user.");
		return usersRepository.save(userTable);
	}

	@Override
	public List<User> getAllUser() {
		logger.info("User service called for update all users.");
		
		return usersRepository.findAll();

	}

	@Override
	public List<User> SaveAllUser(List<User> usersTable) {
		logger.info("User service called for save the all the user.");
		
		return usersRepository.saveAll(usersTable);
	}

	@Override
	public User getUserById(Long id) {
		logger.info("User service called for find user by id.");
		
		return usersRepository.findByuserId(id);
	}

	@Override
	public List<User> getsUserByName(String name) {
		logger.info("User service called for to find user by name.");
		return usersRepository.findByuserName(name);
	}

	@Override
	public User updateUser(User userTable) {
		logger.info("User service called for update the user table.");
		
		User existingUser = usersRepository.findById(userTable.getId()).orElse(null);
		existingUser.setName(userTable.getName());
		existingUser.setMailId(userTable.getMailId());
		existingUser.setMobileNo(userTable.getMobileNo());
		existingUser.setOccupation(userTable.getOccupation());
		return usersRepository.save(existingUser);
	}

	 

}
