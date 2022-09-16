package com.springboot.LibraryManagementSystem.Entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "Users_Table")
public class User {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@Column(name = "User_Name", nullable=false )
	private String userName;
	
	@Column(name = "User_mail_Id" , nullable = false )
	private String userMailId;
	
	@Column(name = "Moble_Number" , nullable = false)
	private int mobileNo;
	
	@Column(name = "User_Occupation" , nullable = false)
	private String occupation;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String name, String mailId, int mobileNo, String occupation) {
		super();

		this.userName = name;
		this.userMailId = mailId;
		this.mobileNo = mobileNo;
		this.occupation = occupation;
	}

	public long getId() {
		return userId;
	}

	public void setId(long id) {
		userId = id;
	}

	public String getName() {
		return userName;
	}

	public void setName(String name) {
		this.userName = name;
	}

	public String getMailId() {
		return userMailId;
	}

	public void setMailId(String mailId) {
		this.userMailId = mailId;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
