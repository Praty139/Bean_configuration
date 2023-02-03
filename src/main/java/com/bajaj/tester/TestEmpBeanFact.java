package com.bajaj.tester;

import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.bajaj.beans.Employee;

public class TestEmpBeanFact {
	public static void main(String[] args) {
		
		BeanFactory bf = new ClassPathXmlApplicationContext("com/bajaj/resources/my_beans_configuration.xml");
		
//		Resource res = new FileSystemResource("com/bajaj/resource/my_beans_configuration.xml");
//		BeanFactory factory = new XmlBeanFactory(res);
		Employee employee = (Employee)bf.getBean("employee");
		employee.display();
	}
}
