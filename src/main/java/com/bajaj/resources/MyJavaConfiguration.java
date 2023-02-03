package com.bajaj.resources;

import org.springframework.context.annotation.*;

import com.bajaj.beans.Employee;

@Configuration
public class MyJavaConfiguration {

	@Bean
	public Employee employee() {
		return new Employee();
	}
}
