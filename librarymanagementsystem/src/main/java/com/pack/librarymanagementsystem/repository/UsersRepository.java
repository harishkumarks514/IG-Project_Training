package com.pack.librarymanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.librarymanagementsystem.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	public List<Users> findByUserName(String name);
	
	public Users findByUserId(Long userId);
	
}
