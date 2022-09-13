package com.springboot.LibraryManagementSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Users_Table")
public class User {

	private long Id;
	private String name;
	private String mailId;
	private int mobileNo;
	private String occupation;
}
