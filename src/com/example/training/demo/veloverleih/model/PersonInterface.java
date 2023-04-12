package com.example.training.demo.veloverleih.model;

public interface PersonInterface {

	String getId();

	void setId(String id);

	String getFistName();

	void setFistName(String fistName);

	String getLastName();

	void setLastName(String lastName);

	String getStreet();

	void setStreet(String street);

	String getBuildingNumber();

	void setBuildingNumber(String buildingNumber);

	int getZipCode();

	void setZipCode(int zipCode);

	void sendLetter();
	
	void create();
}
