package com.example.training.demo.veloverleih.model;

public class Person {
	
	private String id;
	private String fistName;
	private String lastName;
	private String street;
	private String buildingNumber;
	private int zipCode;
	
	public Person(String id, String fistName, String lastName, String street, String buildingNumber, int zipCode) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.street = street;
		this.buildingNumber = buildingNumber;
		this.zipCode = zipCode;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuildingNumber() {
		return buildingNumber;
	}
	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
