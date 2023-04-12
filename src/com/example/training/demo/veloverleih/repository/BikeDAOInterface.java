package com.example.training.demo.veloverleih.repository;

import com.example.training.demo.veloverleih.repository.spec.BikeSpecifications;

public interface BikeDAOInterface {
	
	public BikeSpecifications findOne();
	
	public void createBikeDAO(double baseRate);

}
