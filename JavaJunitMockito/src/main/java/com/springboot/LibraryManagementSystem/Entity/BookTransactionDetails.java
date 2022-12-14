package com.springboot.LibraryManagementSystem.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Transaction_Details")
public class BookTransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;

	@Column(name = "Book Name", nullable = false)
	private String bookName;

	@Column(name = "Book_Issued_By", nullable = false)
	private String issuedBy;

	@Column(name = "Book_Issued_To", nullable = false)
	private String issuedTo;

	@Column(name = "Book_Issued_On", nullable = false)
	private Date issuedOn;

	@Column(name = "Book _Returned_On", nullable = false)
	private Date returnedOn;

	@Column(name = "Remarks", nullable = false)
	private String remark;

	public BookTransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookTransactionDetails(long bookId, String bookName, String issuedBy, String issuedTo, Date issuedOn,
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

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(String issuedTo) {
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

}
