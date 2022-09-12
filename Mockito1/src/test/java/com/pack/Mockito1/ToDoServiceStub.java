package com.pack.Mockito1;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub {

	public List<String> getTodos(String user)
	{
		return Arrays.asList("Use Core Java","Use Spring Core","Use Hibernate","Use Spring MVC");
	}
}
