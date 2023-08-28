package com.SpringCore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
   
	@Value("Ajay")
	private String name;
	@Value("21")
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", getName()=" + getName() + ", getRollNo()="
				+ getRollNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
