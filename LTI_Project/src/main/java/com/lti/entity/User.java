package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import oracle.sql.BLOB;

@Entity 
@Table(name="Users")
public class User {

	//surendra
	//maurya
	@Column(name="user_id")
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	
	private String name;
	
	@Column(name="contact_no")
	private int contactNo;
	
	
	private String address;
	
	@Column(name="pin_code")
	private int pinCode;
	
	@Column(name="account_no")
	private int accountNo;
	
	@Column(name="IFSC_code")
	private String ifscCode;
	
	
	private String area;
	
	private String city;
	
	private String state;
	
	private BLOB aadhar;
	
	private BLOB pan_no;
	
	private BLOB license;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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

	public BLOB getAadhar() {
		return aadhar;
	}

	public void setAadhar(BLOB aadhar) {
		this.aadhar = aadhar;
	}

	public BLOB getPan_no() {
		return pan_no;
	}

	public void setPan_no(BLOB pan_no) {
		this.pan_no = pan_no;
	}

	public BLOB getLicense() {
		return license;
	}

	public void setLicense(BLOB license) {
		this.license = license;
	}
	
	
}
