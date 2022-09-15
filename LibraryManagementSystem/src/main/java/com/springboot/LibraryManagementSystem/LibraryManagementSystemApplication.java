package com.springboot.LibraryManagementSystem;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.springboot.LibraryManagementSystem.Repository")

@Configuration
@EnableJpaRepositories(basePackageClasses = ClassLoaderRepository.class)
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}
}