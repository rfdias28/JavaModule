package io.altar.jseproject.model;

public class Shelf {

	public Shelf(int capacity, String product, double rentPrice) {
		super();
		this.capacity = capacity;
		this.product = product;
		this.rentPrice = rentPrice;
	}

	private int capacity;
	private String product;
	private double rentPrice;

	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}
}