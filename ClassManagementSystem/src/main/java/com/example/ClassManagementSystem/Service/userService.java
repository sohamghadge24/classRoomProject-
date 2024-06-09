package com.example.ClassManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ClassManagementSystem.Entity.Student;
import com.example.ClassManagementSystem.Entity.User;
import com.example.ClassManagementSystem.Repo.studentRepo;




@Service
public class userService {
	@Autowired
	private studentRepo studentRepo;
	
	public Student SaveUser(Student user) {
		return studentRepo.save(user);
	}
	
	public void deleteUser(Long userId) {
		studentRepo.deleteById(userId);
	}
	
	public Student getUserById(long studentId) {
		return studentRepo.findById(studentId).orElseThrow(()->new RuntimeException(studentId +" not found"));
	}
	
	public User getUserbyEmail(String Email) {
		return studentRepo.findByEmail(Email);
	}
	
	
	
	public Student UpdateUser(User user) {
		Student getUserId=getUserById(user.getId());
		Student user1= new Student();
		if(getUserId!=null) {
    		user1.setEmail(user.getEmail());
    		user1.setPassword(user.getPassword());
    		
		}
    	return studentRepo.save(user1);
	}
	
	
	 public boolean authenticateUser(String email, String password) {

	        // Find the user by email and password
		 User user = studentRepo.findByEmailAndPassword(email, password);

	        // Check if the user is found
	     return user != null;
	        }

	public Iterable<Student> getAllStudents(){
		return studentRepo.findAll();
	}

	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

	public Student updateStudent(int studentId, Student student) {
		 Optional<Student> existingStudent = studentRepo.findById((long) studentId);
		 if (existingStudent.isPresent()) {
			 Student updatedStudent = existingStudent.get();
			 updatedStudent.setFname(student.getFname());
	            updatedStudent.setLname(student.getLname());
	            updatedStudent.setBirthday(student.getBirthday());
	            updatedStudent.setAadhar_Number(student.getAadhar_Number());
	            updatedStudent.setPhoneNumber(student.getPhoneNumber());
	            updatedStudent.setQualifications(student.getQualifications());
	            updatedStudent.setAddress(student.getAddress());
	            updatedStudent.setGender(student.getGender());
	            
	            return studentRepo.save(updatedStudent);
		 }
		 else {
			 //throw new StudentNotFoundException("Student not found with ID: " + student.getId());
			 return null;
		 }
		
	}
}
