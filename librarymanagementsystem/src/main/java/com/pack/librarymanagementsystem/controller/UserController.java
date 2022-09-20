package com.pack.librarymanagementsystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.service.UserTableService;

@RestController
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserTableService userService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody Users user) {
		log.info("Adding the user in user Controller.");
		userService.saveUser(user);
		return "User added successfully!!!";
	}
	
	@PostMapping("/addAllUser")
	private String addAllUser(@RequestBody List<Users> user) {
		log.info("Adding Multipleusers in user controller.");
		userService.saveAllUser(user);
		return "All Users Added successfully..";
	}
	
	@GetMapping("/getAllUser")
	private List<Users> findUser() {
		log.info("Fetching the user details through user controller.");
		return userService.getAllUser();
	}
	
	@GetMapping("/getUserById/{id}")
	private Users findUserById(@PathVariable Long id) {
		log.info("Fetching user in user controller by ID.");
		return userService.getUserById(id);
	}
	
	@GetMapping("/getUserByName/{name}")
	private List<Users> findUserByName(@PathVariable String name) {
		log.info("Fetching user in user controller by Name.");
		return userService.getUsersByName(name);
	}
	@PutMapping("/updateUser")
	private String updateUser(@RequestBody Users user) {
		log.info("Updating user in user controller by user details..");
		userService.updateUser(user);
		return "User Updated successfully!!!";
	
	}
}
