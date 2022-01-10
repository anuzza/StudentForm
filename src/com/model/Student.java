package com.model;

public class Student {
	private String fname;
	private String lname;
	private String college;
	private String faculty;
	private int rollno;
	private String phone;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", college=" + college + ", faculty=" + faculty
				+ ", rollno=" + rollno + ", phone=" + phone + "]";
	}
	
	

}
