package com.SpringCore.life;

public class samosa {
 public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

public samosa(double price) {
		super();
		this.price = price;
	}

private double price;

@Override
public String toString() {
	return "samosa [price=" + price + "]";
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
     private void init() {
		// TODO Auto-generated method stub
       System.out.println("Inside Inite");
	}
     
     private void destroy() {
		// TODO Auto-generated method stub
    	 System.out.println("Inside Destroy");
	}

	



}
