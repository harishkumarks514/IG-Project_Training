package com.pack.librarymanagementsystem.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.repository.UsersRepository;
import com.pack.librarymanagementsystem.service.UserTableService;

@Service
public class UserTableServiceImpl implements UserTableService{

	private static final Logger log = LoggerFactory.getLogger(UserTableServiceImpl.class);

	@Autowired
	private UsersRepository userRepository;
	
	
	@Override
	public Users saveUser(Users userTable) {
		log.info("Save user method called for to save the user details");
		return userRepository.save(userTable);
	}

	@Override
	public List<Users> saveAllUser(List<Users> userTable) {
		log.info("Save user method called for to save the user details");
		
		return userRepository.saveAll(userTable);
	}

	@Override
	public List<Users> getAllUser() {
		log.info("Get all user method called for get the user details");
		return userRepository.findAll();
	}

	@Override
	public Users getUserById(Long id) {
		log.info("Get user by Id method called for get the user details by using Id");
		return userRepository.findByUserId(id);
	}

	@Override
	public List<Users> getUsersByName(String name) {
		log.info("Get user by Name method called for get the user details by using Name");
		return userRepository.findByUserName(name);
	}

	public Users updateUser(Users userTable) {
		log.info("Update user method called for update user details.");
		Users userDetails =userRepository.findById(userTable.getUserId()).orElse(null);
		userDetails.setUserName(userTable.getUserName());
		userDetails.setMailId(userTable.getMailId());
		userDetails.setMobileNo(userTable.getMobileNo());
		userDetails.setUserAddress(userTable.getUserAddress());
		return userRepository.save(userDetails);
	}

	
}
