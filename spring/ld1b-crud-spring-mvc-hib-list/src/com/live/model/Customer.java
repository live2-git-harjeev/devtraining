package com.live.model;

public class Customer {
	public Customer() {
	
	}
	private int id;
	private String firstName;
	private String lastName;
	private String email;
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
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
