package com.SpringCore.ref;

public class A {
private int x;
private B ob;
public int getX() {
	return x;
}
public A() {
    // Default constructor logic, if needed
}
public void setX(int x) {
	this.x = x;
}
public B getOb() {
	return ob;
}
public void setOb(B ob) {
	this.ob = ob;
}
@Override
public String toString() {
	return "A [x=" + x + ", ob=" + ob + ", getX()=" + getX() + ", getOb()=" + getOb() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public A(int x, B ob) {
	super();
	this.x = x;
	this.ob = ob;
}
}
