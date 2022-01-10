package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImp;
//cmt
public class Run {
	 public static void main(String[] args) {
		
		 StudentService ss = new StudentServiceImp();
		String flag = "y";
		Scanner sc = new Scanner (System.in);
		do { 
		
		Student st = new Student();
		System.out.println("Enter fname");
		st.setFname(sc.next());
		System.out.println("Enter Lname");
		st.setLname(sc.next());
		System.out.println("Enter college");
		st.setCollege(sc.next());
		System.out.println("Enter faculty");
		st.setFaculty(sc.next());
		System.out.println("Enter rollno");
		st.setRollno(sc.nextInt());
		System.out.println("Enter phone");
		st.setPhone(sc.next());
		
		
		ss.addStudent(st);
		
		System.out.println("Do you want to continue? [y/n]");
		flag = sc.next();
		} while(flag.equalsIgnoreCase("y"));
		
		//====== get all student ============
		List<Student> slist = ss.getAllStudent();
		
		slist.forEach(s-> System.out.println(s));
		
		// ==== delete student ======
		System.out.println("Enter index for delete");
		ss.deleteStudent(sc.nextInt());
		
		List<Student> slist1 = ss.getAllStudent();
		
		slist.forEach(s-> System.out.println(s));
		
	}
	

}
