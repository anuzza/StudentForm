package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
	
	void addStudent(Student s);
	List<Student> getAllStudent();
	
	void deleteStudent (int index);
	
	
		
	}

