package com.bms.workshop.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "publisher")
public class Publisher {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String email;
	
	private String contactno;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false )
	@JoinColumn(name = "id")
	private Book book;
	
	private Publisher() {}

	public Publisher(String name, String email, String contactno) {
		super();
		this.name = name;
		this.email = email;
		this.contactno = contactno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
	
}
