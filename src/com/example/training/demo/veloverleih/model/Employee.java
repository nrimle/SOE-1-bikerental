package com.example.training.demo.veloverleih.model;

public class Employee extends Person {
	
	private String id;
	private String employeeNumber;
	private double salary;

	public Employee(String id, String fistName, String lastName, String street, String buildingNumber, int zipCode) {
		super(id, fistName, lastName, street, buildingNumber, zipCode);
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
