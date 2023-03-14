package com.example.training.demo.veloverleih.model;

import java.util.ArrayList;

public class Customer extends Person {
	
	private String id;
	private String customerNumber;
	private ArrayList<Rental> rentals;
	
	public Customer(String id, String fistName, String lastName, String street, String buildingNumber, int zipCode) {
		super(id, fistName, lastName, street, buildingNumber, zipCode);
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	public String toString() {
		return "Customer [id=" + id + ", customerNumber=" + customerNumber + ", rentals=" + rentals + "]";
	}

}
