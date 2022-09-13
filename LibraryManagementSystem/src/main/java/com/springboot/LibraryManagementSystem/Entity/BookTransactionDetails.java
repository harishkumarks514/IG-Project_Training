package com.springboot.LibraryManagementSystem.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Transaction_Details")
public class BookTransactionDetails {

	private long bookId;
	private String bookName;
	private String issuedBy;
	private String issuedTo;
	private Date issuedOn;
	private Date returnedOn;
	private String remark;
}
