package com.pack.librarymanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.librarymanagementsystem.entity.Users;

@Service
public interface UserTableService {

	public Users saveUser(Users userTable); 
	
	public List<Users> saveAllUser(List<Users> userTable);
	
	public List<Users> getAllUser();
	
	public Users getUserById(Long id);
	
	public List<Users> getUsersByName(String name);
	
	public Users updateUser(Users userTable);
}
