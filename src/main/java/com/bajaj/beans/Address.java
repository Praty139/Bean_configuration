package com.bajaj.beans;

public class Address {

	String city;
	String state;

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public Address() {
		System.out.println("In address constructor");
	}

	@Override
	public String toString() {
		return "Address[City=" + city + ", State = " + state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
