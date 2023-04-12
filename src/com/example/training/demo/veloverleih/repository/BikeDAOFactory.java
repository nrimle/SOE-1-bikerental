package com.example.training.demo.veloverleih.repository;

public class BikeDAOFactory {
	
	private static final BikeDAOFactory instance = new BikeDAOFactory();
	
	private BikeDAOFactory() {
		
	}
	
	public static BikeDAOFactory getInstance() {
		return instance;
	}
	
	public BikeDAOInterface createBikeDAOInterface() {
		return new BikeDAOMock();
	}

}
