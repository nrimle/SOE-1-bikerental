package com.example.training.demo.veloverleih.repository;

import com.example.training.demo.veloverleih.repository.spec.BikeSpecifications;

public class BikeDAOMock implements BikeDAOInterface {

	@Override
	public BikeSpecifications findOne() {
		BikeSpecifications bike = new BikeSpecifications();
		bike.setBaseRate(4.5);
		return bike;
		
	}

	@Override
	public void createBikeDAO(double baseRate) {
		BikeSpecifications bike = new BikeSpecifications();
		bike.setBaseRate(baseRate);
		System.out.println("Saved bike: " + bike.toString() + "with baseRate=" + bike.getBaseRate());
	}
}
