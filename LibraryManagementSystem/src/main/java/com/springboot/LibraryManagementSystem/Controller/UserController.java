package com.springboot.LibraryManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.LibraryManagementSystem.Service.UserService;

@Controller
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

//	Handler method to handle to List Users and return model and view
	@GetMapping("/users")
	public String listUsers(Model model)
	{
		model.addAttribute("users",userService.getAllUser());
	return "users";	
	}
}