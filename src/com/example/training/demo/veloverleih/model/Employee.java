package com.example.training.demo.veloverleih.model;

public class Employee extends AbstractPerson {

	private String employeeNumber;
	private double salary;

	public Employee(String id, String fistName, String lastName, String street, String buildingNumber, int zipCode,
			String employeeNumber, double salary) {
		super(id, fistName, lastName, street, buildingNumber, zipCode);
		this.employeeNumber = employeeNumber;
		this.salary = salary;
	}
	
	public Employee() {
		super();
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

	@Override
	public void sendLetter() {
		System.out.println("Sending letter to Employee");
	}
	public void create() {
		System.out.println("Creating employee");
	}
}
