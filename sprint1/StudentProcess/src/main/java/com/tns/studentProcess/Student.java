package com.tns.studentProcess;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name="studentID")
	private int studentID;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="contactNo")
	private long  contactNo;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="department")
	private String department;
	

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentID, String firstName, String lastName, String address, long contactNo, String emailId,String department) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName+ ", address=" + address + ", contactNo=" + contactNo + ", emailId=" + emailId + ", department=" + department+ "]";
	}
}
