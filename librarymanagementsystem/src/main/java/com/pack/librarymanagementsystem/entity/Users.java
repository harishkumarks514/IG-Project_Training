package com.pack.librarymanagementsystem.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "Users_Table") 
public class Users {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private long userId;
	private String userName;
	private String mobilleNo;
	private String mailId;
	private String userAddress;

}
