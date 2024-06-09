package com.example.ClassManagementSystem.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")	
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String Fname;
	String Lname;	
	Date Birthday;	
	long  aadhar_Number;
	long phone_Number;
	String Qualifications;
	String Address;
	String Gender;
	
	

	@Column(name = "email")
	private String email;

    @Column(name = "Password")
    private String password;
	
	
	public Student(long id, String email, String password) {
		
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public Student(String email, String password) {
		
		this.email = email;
		this.password = password;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param fname
	 * @param lname
	 * @param birthday
	 * @param aadhar_Number
	 * @param phoneNumber
	 * @param qualifications
	 * @param address
	 * @param gender
	 * @param email
	 * @param password
	 */
	
	public Student(long id, String fname, String lname, Date birthday, long aadhar_Number, long phone_Number,
			String qualifications, String address, String gender, String email, String password) {
		this.id = id;
		this.Fname = fname;
		this.Lname = lname;
		this.Birthday = birthday;
		this.aadhar_Number = aadhar_Number;
		this.phone_Number = phone_Number;
		this.Qualifications = qualifications;
		this.Address = address;
		this.Gender = gender;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}

	public long getAadhar_Number() {
		return aadhar_Number;
	}

	public void setAadhar_Number(long aadhar_Number) {
		this.aadhar_Number = aadhar_Number;
	}

	public long getPhoneNumber() {
		return phone_Number;
	}

	public void setPhoneNumber(long phone_Number) {
		this.phone_Number = phone_Number;
	}

	public String getQualifications() {
		return Qualifications;
	}

	public void setQualifications(String qualifications) {
		Qualifications = qualifications;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
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
	
	
	
	
	
}
