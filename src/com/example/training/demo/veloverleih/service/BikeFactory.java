package com.example.training.demo.veloverleih.service;

import com.example.training.demo.veloverleih.model.Bike;
import com.example.training.demo.veloverleih.model.BikeInterface;
import com.example.training.demo.veloverleih.repository.BikeDAOFactory;
import com.example.training.demo.veloverleih.repository.BikeDAOInterface;

public class BikeFactory {
	
	private static final BikeFactory instance = new BikeFactory();
	
	private BikeFactory() {
		
	}
	
	public static BikeFactory getInstance() {
		return instance;
	}
	
	public BikeInterface createBike(double baseRate) {
		BikeInterface bike = new Bike();
		bike.setBaseRate(baseRate);
		return bike;	
	}
	
	public void saveBike(BikeInterface bike) {
		BikeDAOInterface bikeDAOInterface = BikeDAOFactory.getInstance().createBikeDAOInterface();
		bikeDAOInterface.createBikeDAO(bike.getBaseRate());
	
	}
	
	public Bike findBike() {
		BikeDAOInterface bikeDAOInterface = BikeDAOFactory.getInstance().createBikeDAOInterface();
		Bike bike = new Bike(bikeDAOInterface.findOne().getBaseRate());
		return bike;
	}
}
