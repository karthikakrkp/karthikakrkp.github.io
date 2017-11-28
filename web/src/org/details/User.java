package org.details;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="USER")
@Table(name = "USER_PROFILE")
public class User {
	@Id
	@GeneratedValue
	private Integer candidateid;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="PHONE_NUMBER")
	private long phoneNo;
	@Column(name="CITY")
	private String city;
	@Column(name="GENDER")
	private String gender;
	@Column(name="STREET")
	private String street;
	@Column(name="LOCATION")
	private String location;
	@Column(name="STATE")
	private String state;
	@Column(name="EMAILID")
	private String emailid;
	@Column(name="PINCODE")
	private long pincode;
	
	public Integer getCandidateid() {
		return candidateid;
	}

	public void setCandidateid(Integer candidateid) {
		this.candidateid = candidateid;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public User() {
		super();
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}
