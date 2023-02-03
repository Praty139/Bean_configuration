package com.bajaj.beans;

import java.util.List;

public class Emp2Collection {

	private int eid;
	private String name;
	private double salary;
	private List<String> lang;

	public Emp2Collection(int eid, String name, double salary, List<String> lang) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.lang = lang;
	}

	public Emp2Collection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<String> getLang() {
		return lang;
	}

	public void setLang(List<String> lang) {
		this.lang = lang;
	}

}
