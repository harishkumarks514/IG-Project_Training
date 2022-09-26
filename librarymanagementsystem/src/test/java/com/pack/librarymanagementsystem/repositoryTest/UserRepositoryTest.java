package com.pack.librarymanagementsystem.repositoryTest;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pack.librarymanagementsystem.entity.Users;
import com.pack.librarymanagementsystem.repository.UsersRepository;

public class UserRepositoryTest {

	@Autowired
	private UsersRepository userRepository;

	Users user;

	@BeforeEach
	public void setUpUser() {
		user = Users.builder().userName("Harish").userAddress("Banglore BTM.").mobileNo("9538401159")
				.mailId("def@gmail.com").build();
	}
	
	@DisplayName("Junit test for save user.")
	@Test
	public void givenUserObject_whenSave_thenReturnUser() {
    Users user = Users.builder().userName("Harish").userAddress("Banglore BTM.").mobileNo("9538401159")
			.mailId("def@gmail.com").build();
		  userRepository.save(user);
		  Users found = userRepository.findById(user.getUserId()).get();
	      assertEquals(user.getUserId(), found.getUserId());	
	}
	@DisplayName("Junit test for saving multiple user.")
	@Test
	public void givenUserObject_whenSaveall_thenReturnUser() {
	userRepository.save(user);
	List<Users> allBook = userRepository.findAll();
    assertThat(allBook.size()).isGreaterThanOrEqualTo(9);	
	}
	
	@DisplayName("Junit Test for get All Employee.")
	@Test
	public void givenUserListObject_whenFindAll_thenReturnUserList() {
		
		userRepository.save(user);
		
		List<Users> userList = userRepository.findAll();
		assertThat(userList).isNotNull();
		assertThat(userList.size()).isEqualTo(9);
	}
	
	@DisplayName("Junit test for getting user by user id.")
	@Test
	public void givenUserObject_whenFindById_thenReturnUser() {
		userRepository.save(user);
		Users savedUser = userRepository.findById(user.getUserId()).get();
		assertThat(savedUser).isNotNull();
	}
	
	@DisplayName("Junit test for getting user by name.")
	@Test
	public void givenUserObject_whenFindByName_thenReturnUser() {
		userRepository.save(user);
		List<Users> savedUser = userRepository.findByUserName(user.getUserName());
		assertThat(savedUser).isNotNull();
	}
	
	
	@DisplayName("Junit test for update user")
	@Test
	public void givenUserObject_whenUpdate_thenReturnUser() {
		userRepository.save(user);
		Users savedUser = userRepository.findById(user.getUserId()).get();
						savedUser.setMailId("rahul@gmail.com");
						savedUser. setMobileNo("9538291145");
		Users updateUser = userRepository.save(savedUser);
		assertThat(updateUser.getMailId()).isEqualTo("rahul@gmail.com");
		assertThat(updateUser.getMobileNo()).isEqualTo("9538291145");
	}
	
	
}
