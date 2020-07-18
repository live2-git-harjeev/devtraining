package com.live.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	//create the sequence generator
	@SequenceGenerator(name="customerIdSeq", sequenceName = "CUSTOMER_ID_SEQ")
	//associate sequence generator with a hibernate generation strategy
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "customerIdSeq")
	@Column(name="ID")
	private int id;
//	@Transient
//	private int ID;
	@Column(name="FIRST_NAME")	
	private String firstName;
	@Column(name="LAST_NAME")	
	private String lastName;
	@Column(name="EMAIL")
	private String email;
	public Customer() {
	
	}
	
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getId() {
		return id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}
