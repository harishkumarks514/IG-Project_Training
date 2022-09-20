package com.pack.librarymanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
 
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Book_Transaction")
public class BookTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;
	
	@ManyToOne
	@JoinColumn(name = "bookId")
	private Book bookId;

	@ManyToOne
	@JoinColumn(name = "userId")
	private Users userId;
	
	@ManyToOne
	@JoinColumn(name = "issued_To")
	private Users issued_To;
	
	private String transactionStatus;
	private String remarks;
}
