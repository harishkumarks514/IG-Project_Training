package com.pack.SpringBootExample;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements ErrorController {
	private static final String PATH = "/error";

	@GetMapping(value = "/index")
	public String getMsg() {
		return "Hello World!!!";
	}

	@GetMapping(value = "/info")
	public String getInfo() {
		return "Welcome to springboot";
	}

	@GetMapping(value = PATH)
	public String errorMessage() {
		return "Requested resource not found";
	}

}
