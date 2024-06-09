package com.example.ClassManagementSystem.Entity;

public class Teacher {
	
	long id;
	String Name;
	String Email;
	String Courses;
	int Teaching_Experience;
	private String password;
	
	
	
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param courses
	 * @param teaching_Experience
	 */
	public Teacher(long id, String name, String email, String courses, int teaching_Experience) {
		this.id = id;
		Name = name;
		Email = email;
		Courses = courses;
		Teaching_Experience = teaching_Experience;
	}
	
	
	/**
	 * @param id
	 * @param email
	 * @param password
	 */
	public Teacher(long id, String email, String password) {
		this.id = id;
		Email = email;
		this.password = password;
	}


	
	/**
	 * 
	 */
	public Teacher() {
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCourses() {
		return Courses;
	}
	public void setCourses(String courses) {
		Courses = courses;
	}
	public int getTeaching_Experience() {
		return Teaching_Experience;
	}
	public void setTeaching_Experience(int teaching_Experience) {
		Teaching_Experience = teaching_Experience;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
