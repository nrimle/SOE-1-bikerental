package com.example.training.demo.veloverleih.service;

import com.example.training.demo.veloverleih.model.Customer;
import com.example.training.demo.veloverleih.model.Employee;
import com.example.training.demo.veloverleih.model.PersonInterface;

public class PersonFactory {
	
	private static final PersonFactory instance = new PersonFactory();
	
	private PersonFactory() {
		
	}
	
	public static PersonFactory getInstance() {
		return instance;
	}
	
	public PersonInterface createEmployee() {
		PersonInterface employee = new Employee();
		return employee;
	}
	
	public PersonInterface createCustomer() {
		PersonInterface customer = new Customer();
		return customer;
	}
}
