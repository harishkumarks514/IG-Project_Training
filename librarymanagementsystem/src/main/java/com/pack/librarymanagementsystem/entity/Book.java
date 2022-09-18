package com.pack.librarymanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
	private String tpoic;

	@Column(name = "issued", nullable = false)
	private boolean issued;

	@Column(name = "metaData", nullable = false)
	private String metaData;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long id, String name, String author, String tpoic, boolean issued, String metaData) {
		super();
		Id = id;
		this.name = name;
		this.author = author;
		this.tpoic = tpoic;
		this.issued = issued;
		this.metaData = metaData;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTpoic() {
		return tpoic;
	}

	public void setTpoic(String tpoic) {
		this.tpoic = tpoic;
	}

	public boolean isIssued() {
		return issued;
	}

	public void setIssued(boolean issued) {
		this.issued = issued;
	}

	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

}
