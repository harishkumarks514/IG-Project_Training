package com.springboot.LibraryManagementSystem.Entity;

import java.util.Date;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "Book")
public class Book {

	@Id        //To make the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Provides for the specification of generation 
//	strategies for thevalues of primary keys. Provides for the specification of generation strategies for thevalues of primary keys. 
	private long bookId;
	
	@Column(name="Book_Name" , nullable=false)
	private String bookName;
	
	@Column(name ="Author",  nullable = false )
	private String bookAuthor;
	
	@Column(name = "Publisher", nullable = false)
	private String bookpublication;
	
	@Column(name="price", nullable = false)
	private int bookPrice;
	
	@Column(name = "Books_Available", nullable = false)
	private int availableBooks;

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "createdBy",referencedColumnName = "userId")
	private User createdBy; 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
	private Date createdOn;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modifiedBy")
	private User modifiedBy;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
	private Date modifiedOn;
	private int activeFlag;
	
	 

	 

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public Book(long bookId, String bookName, String bookAuthor, String bookpublication, int bookPrice,
			int availableBooks, User createdBy, Date createdOn, User modifiedBy, Date modifiedOn, int activeFlag) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookpublication = bookpublication;
		this.bookPrice = bookPrice;
		this.availableBooks = availableBooks;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.activeFlag = activeFlag;
	}



	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookpublication() {
		return bookpublication;
	}

	public void setBookpublication(String bookpublication) {
		this.bookpublication = bookpublication;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getAvailableBooks() {
		return availableBooks;
	}

	public void setAvailableBooks(int availableBooks) {
		this.availableBooks = availableBooks;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public User getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public int getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	

}
