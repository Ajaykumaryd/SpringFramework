package com.SpringCore.ref;

public class B {
	
private int y;

public int getY() {
	return y;
}

    public B() {
        // Default constructor logic, if needed
    }
    // Other constructors and methods

public void setY(int y) {
	this.y = y;
}

@Override
public String toString() {
	return "B [y=" + y + ", getY()=" + getY() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

public B(int y) {
	super();
	this.y = y;
}




}
