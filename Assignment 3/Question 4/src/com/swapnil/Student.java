package com.swapnil;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private  int studentId;
	
	
	
	
	public Student(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + "]";
	}
	
	
}
