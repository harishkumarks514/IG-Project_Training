package com.springboot.LibraryManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Service;

import com.springboot.LibraryManagementSystem.Entity.User;

public interface UsersRepository extends JpaRepository<User, Long> {

	public User findByuserId(Long value);

	public List<User> findByuserName(String name);
}
