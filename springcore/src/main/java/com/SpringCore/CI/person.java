package com.SpringCore.CI;

public class person {
private int id;
private String name;
@Override
public String toString() {
	return "person [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public person() {
	super();
	// TODO Auto-generated constructor stub
}
public person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
}
