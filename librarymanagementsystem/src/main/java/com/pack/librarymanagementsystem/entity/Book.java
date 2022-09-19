package com.pack.librarymanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class Book {

	@Id // To make the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Provides for the specification of generation
//	strategies for thevalues of primary keys. Provides for the specification of generation strategies for thevalues of primary keys. 
	private long Id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "author", nullable = false)
	private String author;

	@Column(name = "topic", nullable = false)
	private String topic;

	@Column(name = "issued", nullable = false)
	private boolean issued;

	@Column(name = "metaData", nullable = false)
	private String metaData;
}
