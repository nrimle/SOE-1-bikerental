package com.example.training.demo.veloverleih.model;

import java.util.Date;

public class Rental {
	
	private String id;
	private Bike bike;
	private Customer customer;
	private Date startDateTime;
	private Date endDateTime;
	
	public Rental(String id, Bike bike, Customer customer, Date startDateTime, Date endDateTime) {
		super();
		this.id = id;
		this.bike = bike;
		this.customer = customer;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	@Override
	public String toString() {
		return "Rental [id=" + id + ", bike=" + bike + ", customer=" + customer + ", startDateTime=" + startDateTime
				+ ", endDateTime=" + endDateTime + "]";
	}

}
