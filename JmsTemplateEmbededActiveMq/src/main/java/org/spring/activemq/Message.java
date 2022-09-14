package org.spring.activemq;

import java.util.Date;

public class Message {

	private Long id;
	private String content;
	private Date date;
	public Message(Long id, String content, Date date) {
		super();
		this.id = id;
		this.content = content;
		this.date = date;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
