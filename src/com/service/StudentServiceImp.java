package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentServiceImp implements StudentService {

	static List<Student> slist = new ArrayList<>();

	@Override
	public void addStudent(Student s) {
		
		
		slist.add(s);
		System.out.println("===added sucess === size = "+ slist.size());
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return slist;
	}

	@Override
	public void deleteStudent(int index) {
		slist.remove(index);
		System.out.println("Delete success === size =="+ slist.size());
		
	}
	
}
