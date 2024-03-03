package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressid;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String email;
	
	private long mobile;
	
	private long pincode;
	
	private boolean ccemail;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String city, String state, String country, String email, long mobile, long pincode,
			boolean ccemail) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.email = email;
		this.mobile = mobile;
		this.pincode = pincode;
		this.ccemail = ccemail;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public boolean isCcemail() {
		return ccemail;
	}

	public void setCcemail(boolean ccemail) {
		this.ccemail = ccemail;
	}
	
	
	
}
