package com.springboot.LibraryManagementSystem.Entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "Book_Transaction_Details")
public class BookTransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User userId;

	@Lob
	@Column(name = "Book_Name", nullable = false)
	private String bookName;

	@Lob
	@Column(name = "Book_Issued_By", nullable = false)
	private User issuedBy;

	@Lob
	@Column(name = "Book_Issued_To", nullable = false)
	private User issuedTo;

	@Lob
	@Column(name = "Book_Issued_On", nullable = false)
	private Date issuedOn;

	@Lob
	@Column(name = "Book_Returned_On", nullable = false)
	private Date returnedOn;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date bookIssueddate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date bookReturndate;

	@ManyToOne
	@JoinColumn(name = "createdBy")
	private User createdBy;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date createdOn;

	@ManyToOne
	@JoinColumn(name = "modifiedBy")
	private User modifiedBy;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY")
	private Date modifiedon;

	private String transactionStatus;

	@Lob
	@Column(name = "Remarks", nullable = false)
	private String remark;

	public BookTransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookTransactionDetails(long bookId, String bookName, User issuedBy, User issuedTo, Date issuedOn,
			Date returnedOn, String remark) {
		super();
		this.bookName = bookName;
		this.issuedBy = issuedBy;
		this.issuedTo = issuedTo;
		this.issuedOn = issuedOn;
		this.returnedOn = returnedOn;
		this.remark = remark;
	}

	public long getBookId() {
		return transactionId;
	}

	public void setBookId(long transactionId) {
		this.transactionId = transactionId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public User getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(User issuedBy) {
		this.issuedBy = issuedBy;
	}

	public User getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(User issuedTo) {
		this.issuedTo = issuedTo;
	}

	public Date getIssuedOn() {
		return issuedOn;
	}

	public void setIssuedOn(Date issuedOn) {
		this.issuedOn = issuedOn;
	}

	public Date getReturnedOn() {
		return returnedOn;
	}

	public void setReturnedOn(Date returnedOn) {
		this.returnedOn = returnedOn;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Date getBookIssueddate() {
		return bookIssueddate;
	}

	public void setBookIssueddate(Date bookIssueddate) {
		this.bookIssueddate = bookIssueddate;
	}

	public Date getBookReturndate() {
		return bookReturndate;
	}

	public void setBookReturndate(Date bookReturndate) {
		this.bookReturndate = bookReturndate;
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

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	 

}
