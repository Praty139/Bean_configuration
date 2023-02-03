package com.bajaj.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bajaj.beans.Address;
import com.bajaj.beans.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bajaj/resources/MyJavaConfiguration.java");

//	Employee employee=(Employee)ac.getBean("employee");  
//	employee.display();      

		Employee employee = (Employee) ac.getBean("employee");
		employee.display();

		System.out.println("Name : " + employee.getName());
		System.out.println("Age : " + employee.getSalary());

//	Employee employee3=(Employee)ac.getBean("employee3"); 
//	Address address = employee.getAddress();
//	employee3.display();
	}
}
