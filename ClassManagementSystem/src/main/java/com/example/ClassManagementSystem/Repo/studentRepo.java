package com.example.ClassManagementSystem.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ClassManagementSystem.Entity.Student;
import com.example.ClassManagementSystem.Entity.User;

@Repository
public interface studentRepo extends CrudRepository<Student, Long> { // Fix the interface name
	 User findByEmail(@Param("email") String email);
	 User findByEmailAndPassword(String email, String password);
	 
}