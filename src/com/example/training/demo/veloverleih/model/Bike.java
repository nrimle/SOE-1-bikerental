package com.example.training.demo.veloverleih.model;

public class Bike {
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
		super();
		this.id = id;
		this.type = type;
		this.gears = gears;
		this.propulsion = propulsion;
		this.hourlyRate = hourlyRate;
		this.baseRate = baseRate;
		this.brand = brand;
		this.color = color;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTyp() {
		return type;
	}
	public void setTyp(String typ) {
		this.type = typ;
	}
	public double getGaenge() {
		return gears;
	}
	public void setGaenge(int gaenge) {
		this.gears = gaenge;
	}
	public String getAntrieb() {
		return propulsion;
	}
	public void setAntrieb(String antrieb) {
		this.propulsion = antrieb;
	}
	public double getPreisProStunde() {
		return hourlyRate;
	}
	public void setPreisProStunde(double preisProStunde) {
		this.hourlyRate = preisProStunde;
	}
	public double getGrundTaxe() {
		return baseRate;
	}
	public void setGrundTaxe(double grundTaxe) {
		this.baseRate = grundTaxe;
	}
	public String getMarke() {
		return brand;
	}
	public void setMarke(String marke) {
		this.brand = marke;
	}
	public String getFarbe() {
		return color;
	}
	public void setFarbe(String farbe) {
		this.color = farbe;
	}
	
	

}
