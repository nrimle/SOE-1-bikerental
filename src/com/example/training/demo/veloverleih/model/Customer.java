package com.example.training.demo.veloverleih.model;

import java.util.ArrayList;

public class Customer extends AbstractPerson {

	private String customerNumber;
	private ArrayList<Rental> rentals;

	public Customer(String id, String fistName, String lastName, String street, String buildingNumber, int zipCode,
			String customerNumber, ArrayList<Rental> rentals) {
		super(id, fistName, lastName, street, buildingNumber, zipCode);
		this.customerNumber = customerNumber;
		this.rentals = rentals;
	}
	
	public Customer() {
		super();
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public ArrayList<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(ArrayList<Rental> rentals) {
		this.rentals = rentals;
	}

	@Override
	public void sendLetter() {
		System.out.println("Sending letter to Customer");
	}
	public void create() {
		System.out.println("Creating customer");
	}
}
