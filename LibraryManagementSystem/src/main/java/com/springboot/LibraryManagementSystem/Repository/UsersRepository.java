package com.springboot.LibraryManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.springboot.LibraryManagementSystem.Entity.User;


 
public interface UsersRepository extends JpaRepository<User, Long> {

}
