package com.SpringCore.auto;

public class Emp {

	private Adress adress;

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Emp(Adress adress) {
		super();
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [adress=" + adress + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
