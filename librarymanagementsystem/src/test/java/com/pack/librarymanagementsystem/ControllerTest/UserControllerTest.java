package com.pack.librarymanagementsystem.ControllerTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Any;
import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.service.impl.UserTableServiceImpl;

@WebMvcTest(value = UserControllerTest.class)
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserTableServiceImpl userService;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	private Users user;
	
	@BeforeEach
	public void setUpUser() {
		user = Users.builder().userName("Twain").mailId("Twain@gmail.com").mobileNo("765434453")
				.userAddress("Mumbai").build();
	}
	
	@DisplayName("Junit test for creating new user using rest api")
	@Test
	public void givenUserObject_whenCreateUser_thenReturnSavedUser() throws Exception{
        given(userService.saveUser(any(Users.class)))
                .willAnswer((invocation)-> invocation.getArgument(0));

     
        ResultActions response = mockMvc.perform(PostMapping("/addUser")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(user)));

        response.andDo(print()).
                andExpect(status().isCreated());
	}
	

	@DisplayName("Junit test for get all user rest api")
	@Test
	public void givenUserObjectList_whenGetAllUser_thenReturnUserList() throws Exception {
		List<Users> userList = new ArrayList()<>();
		userList.add(Users.builder().userName("Marcel").mailId("Marcel@gmail.com")
				.mobileNo("88888899").userAddress("Mumbai").build());
		userList.add(Users.builder().userName("George").mailId("George@gmail.com")
				.mobileNo("777734565").userAddress("Varanasi").build());
		BDDMockito.given(userService.getAllUser()).willReturn(userList);
		ResultActions response = mockMvc.perform(GetMapping("/getAllUser"));
		response.andExpect(status().isOk()).andDo(print()).andExpect(jsonPath("$.size()", is(userList.size())));
	}
	
	@DisplayName("Junit test for get user by id rest api")
	@Test
	public void givenUserObject_whenGetbyId_thenReturnUserObject() throws Exception {
		BDDMockito.given(userService.getUserById(user.getUserId())).willReturn(user);
		ResultActions response = mockMvc.perform(get("https://localhost:8082/getUserById/1", user.getUserId()));
		response.andExpect(status().isOk()).andDo(print());
	}
		
	@DisplayName("Junit test for get user by name rest api")
	@Test
	public void givenUserObject_whenGetbyname_thenReturnUserObject() throws Exception {
		BDDMockito.given(userService.getUsersByName(user.getUserName())).willReturn(List.of(user));
		ResultActions response = mockMvc.perform(GetMapping("https://localhost:8082/getUserByName/Twain", user.getUserName()));
		response.andExpect(status().isOk()).andDo(print());
	}

	@DisplayName("Junit test for update user rest api")
	@Test
	public void givenUserObject_whenUpdateUser_thenReturnUserObject() throws JsonProcessingException, Exception {
		Users savedUser = Users.builder().userId(1L).userName("Marcel").mailId("Marcel@gmail.com")
				.userAddress("Mumbai").build();
		Users updateUser = Users.builder().userName("Marcel").mailId("Marcel@gmail.com")
				.userAddress("Navi Mumbai").build();

		BDDMockito.given(userService.getUserById(1l)).willReturn(savedUser);
		BDDMockito.given(userService.updateUser(Any(Users.class))).willAnswer(invocation -> invocation.getArgument(0));
		ResultActions response = mockMvc.perform(PutMapping("/updateUser").contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(updateUser)));
		response.andExpect(status().isOk()).andDo(print());
//	   .andExpect(jsonPath("$.userAddress", is(updateUser.getUserAddress())));
	}
}
