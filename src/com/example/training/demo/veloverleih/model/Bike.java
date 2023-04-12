package com.example.training.demo.veloverleih.model;

public class Bike implements BikeInterface {
	private String id;
	private String type;
	private int gears;
	private String propulsion;
	private double hourlyRate;
	private double baseRate;
	private String brand;
	private String color;

	public Bike(String id, String type, int gears, String propulsion, double hourlyRate, double baseRate, String brand,
			String color) {
		this.id = id;
		this.type = type;
		this.gears = gears;
		this.propulsion = propulsion;
		this.hourlyRate = hourlyRate;
		this.baseRate = baseRate;
		this.brand = brand;
		this.color = color;
	}
	
	public Bike() {
		
	}
	
	public Bike(double baseRate) {
		this.baseRate = baseRate;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

}
