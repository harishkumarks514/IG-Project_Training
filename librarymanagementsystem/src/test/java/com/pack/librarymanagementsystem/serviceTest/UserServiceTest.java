package com.pack.librarymanagementsystem.serviceTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.repository.UsersRepository;
import com.pack.librarymanagementsystem.service.impl.UserTableServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {


	@Mock
	private UsersRepository userRepository;

	@InjectMocks
	private UserTableServiceImpl userService;

	private Users user;
	
	@BeforeEach
	public void setUpUser() {
		user = Users.builder().userName("John").mailId("John@gmail.com").mobileNo("999238774")
				.userAddress("Bangalore").build();
	}
	@DisplayName("Junit test for save user.")
	@Test
	public void givenUserObject_whenSave_thenReturnUserObject() {
		BDDMockito.given(userRepository.save(user)).willReturn(user);
		Users savedUser = userService.saveUser(user);
		assertThat(savedUser).isNotNull();
	}
	@DisplayName("Junit test for save multiple user.")
	@Test
	public void givenMultipleUserObject_whenSave_thenReturnMultipleUserObject() {
		Users user2 = Users.builder().userName("John").mailId("John@gmail.com").mobileNo("999238774")
				.userAddress("Bangalore").build();
		List<Users> savedUser = new ArrayList<>();
		savedUser.add(user);
		savedUser.add(user2);
		userRepository.saveAll(savedUser);
		assertThat(savedUser).isEqualTo(savedUser);
	}
	
	@DisplayName("Junit test for getying all Users.")
	@Test
	public void givenUsersObject_whenFindAll_thenReturnUsersObjcet() {
		BDDMockito.given(userRepository.findAll()).willReturn(List.of(user));
		List<Users> UserList = userService.getAllUser();
		assertThat(UserList).isNotNull();
		assertThat(UserList.size()).isGreaterThan(0);
	}
	@DisplayName("Junit test for get user by user id.")
	@Test
	public void givenUserObject_whenFindById_thenReturnUserObject() {
		user = Users.builder().userId(10L).userName("John").mailId("John@gmail.com").mobileNo("999238774")
				.userAddress("Bangalore").build();
		BDDMockito.given(userRepository.findById(10L)).willReturn(user);
	    Users savedUser = userService.getUserById(user.getUserId());
		assertThat(savedUser).isNotNull();
	}
	
	@DisplayName("Junit test for get user by user name.")
	@Test
	public void givenUserObject_whenFindByName_thenReturnUserObject() {
		BDDMockito.given(userRepository.findByUserName("John")).willReturn(List.of(user));
	    List<Users> savedUser = userService.getUsersByName("John");
		assertThat(savedUser).isNotNull();
	}
	
	@DisplayName("Junit test for updating user.")
	@Test
	public void givenUserObject_ForUpdate_thenReturnUserObject() {
		BDDMockito.given(userRepository.save(user)).willReturn(user);
		Users savedUser = userService.saveUser(user);
		savedUser.setMailId("johnsnow@gmail.com");
        assertThat(savedUser.getMailId()).isEqualTo("johnsnow@gmail.com");
	}
}
