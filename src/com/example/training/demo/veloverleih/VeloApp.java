package com.example.training.demo.veloverleih;

import com.example.training.demo.veloverleih.model.BikeInterface;
import com.example.training.demo.veloverleih.service.BikeFactory;

public class VeloApp {

	public static void main(String[] args) {

		/*Customer customer = new Customer("123", null, null, null, null, 0, null, null);
		Employee employee = new Employee(null, null, null, null, null, 0, null, 0);

		List<PersonInterface> persons = new ArrayList<PersonInterface>();

		persons.add(employee);
		persons.add(customer);

		for (PersonInterface person : persons) {
			person.sendLetter();
		}*/
		
		/*CustomerFactory customerFactory = CustomerFactory.getInstance();
		
		PersonInterface pers = customerFactory.createPerson();
		
		System.out.println(pers.getFistName());*/
		
		double testCase1Value = 3.5;
		
		BikeFactory bikeFactory = BikeFactory.getInstance();

		// Creates a new bike object 
		BikeInterface bike = bikeFactory.createBike(testCase1Value);
		
		// Gets the baseRate of the created bike to verify the "business layer"
		System.out.println("TestCase1: should be=" + testCase1Value + ", is=" + bike.getBaseRate());
		
		// Saves the created bike to the database (only mocked -> log details of bike)
		System.out.println("TestCase2: should log bike details including baseRate=" + testCase1Value);
		bikeFactory.saveBike(bike); 
		
		// Finds one mocked bike from the database
		System.out.println("TestCase3: should be=4.5, is=" + bikeFactory.findBike().getBaseRate());
		
	}
}
