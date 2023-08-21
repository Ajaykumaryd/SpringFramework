package com.SpringCore.autowired;

public class Adress {
    
	private String road;
	private String city;
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Adress [road=" + road + ", city=" + city + "]";
	}
	public Adress(String road, String city) {
		super();
		this.road = road;
		this.city = city;
	}
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}

}
