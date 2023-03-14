package com.example.training.demo.veloverleih;

import com.example.training.demo.veloverleih.model.Bike;
import com.example.training.demo.veloverleih.model.Rental;

public class VeloApp {

	public static void main(String[] args) {
		Bike bike = new Bike("1", null, 1, "asd", 0, 0, null, null);
		Rental rental = new Rental("1", bike, null, null, null);
		
		System.out.println(bike.getId() + " " + bike.getAntrieb());
		System.out.println(rental.toString());

	}

}
