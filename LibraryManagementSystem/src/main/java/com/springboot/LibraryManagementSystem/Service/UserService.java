package com.springboot.LibraryManagementSystem.Service;

import java.util.List;

import com.springboot.LibraryManagementSystem.Entity.User;

public interface UserService {

	
	public User  saveUser(User  userTable);
	 
	public List<User> SaveAllUser(List<User> userTable);

	public List<User> getAllUser();

	public User getUserById(Long id);

	public List<User> getsUserByName(String name);

	public User updateUser(User userTable);

}
