package com.bajaj.beans;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	public int id;
	public String name;
	public double salary;

	public Address address;

	// constructor method
	public Employee() {
		super();

	}

	public Employee(Address address, int id, String name, double salary) {
		super();
		this.address = address;
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// setter method
	public Address getAddress() {
		return address;
	}

//	@Required
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

//	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

//	@Required
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

//	@Required
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println(id + " " + name + " " + salary + " " + address.city + " " + address.state);
	}

}
